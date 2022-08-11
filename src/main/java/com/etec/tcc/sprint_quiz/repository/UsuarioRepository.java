package com.etec.tcc.sprint_quiz.repository;

import com.etec.tcc.sprint_quiz.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    Optional<Usuario> findByEmail(String email);

    List<Usuario> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

    Optional<Usuario> findByNome(@Param("nome") String nome);
}