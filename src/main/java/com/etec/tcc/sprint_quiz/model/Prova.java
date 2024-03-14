package com.etec.tcc.sprint_quiz.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Representa prova no banco
 * 
 * @author hsjon
 *
 */
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_prova")
public class Prova {

    //    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "nome {campo.texto.notBlank.obrigatorio}")
    @Size(max = 50, message = "O nome deve ter no máximo 50 caracteres")
//    @Schema(name = "Vestibulinho etec 1° SEM/2020")
    private String nome;

    @NotBlank(message = "descricao {campo.texto.notBlank.obrigatorio}")
    @Size(max = 400, message = "descricao {campo.texto.sizeMax} 400")
//    @Schema(name = "etec - Vestibulinho 1° SEM/2020")
    private String descricao;

//    @NotNull(message = "O atributo duracao não pode ser nullo")
    private Integer duracao;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    @JsonIgnoreProperties(value = {"email", "senha","foto", "tipo", "provas" ,"questoes", "usuario"}, allowSetters = true)
    private Usuario usuario;


//    @OneToMany(mappedBy = "prova")
//    @JsonIgnoreProperties("prova")
//    private List<QuestaoProva> questoes;

//    @OneToMany()
//    @JsonIgnoreProperties("prova")
//    private Set<Questao> questoes;

    @JsonIgnoreProperties({"provas"})
    @ManyToMany
    @JoinTable(
            name = "tb_prova_questao",
            joinColumns = @JoinColumn(name = "prova_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "questao_id", referencedColumnName = "id"))
    private Set<Questao> questoes = new HashSet<>();




//    @OneToMany(fetch = FetchType.EAGER)
////	@OneToMany(orphanRemoval = true)
//    @Cascade(org.hibernate.annotations.CascadeType.MERGE)
//    @JoinTable(name = "tb_questao_prova", joinColumns = @JoinColumn(name = "prova_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "questao_id", referencedColumnName = "id"))
////	@JsonIgnoreProperties(value = { "questao" }, allowSetters = true)
//    private Set<Questao> questoes;


//    @Schema(name = "Etec JK")
    private String instituicao;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    @JsonIgnoreProperties({"descritivo", "provas"})
//    @JsonIgnoreProperties(value = "provas", allowSetters = true, allowGetters = true)
    private CategoriaProva categoria;


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
