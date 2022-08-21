package com.etec.tcc.sprint_quiz.service;

import com.etec.tcc.sprint_quiz.model.CategoriaQuestao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

public interface CategoriaQuestaoService {

    ResponseEntity<CategoriaQuestao> getById(@PathVariable Long id);

    ResponseEntity<List<CategoriaQuestao>> getByTitutlo(@PathVariable("titulo") String titulo);

    ResponseEntity<List<CategoriaQuestao>> getByDescricao(@PathVariable("descricao") String descricao);

    ResponseEntity<CategoriaQuestao> postCategoriaQuestao(@Valid @RequestBody CategoriaQuestao categoria);

    ResponseEntity<CategoriaQuestao> putCategoriaQuestao(@Valid @RequestBody CategoriaQuestao categoria);

    ResponseEntity<?> deleteCategoriaQuestao(@PathVariable Long id);
}