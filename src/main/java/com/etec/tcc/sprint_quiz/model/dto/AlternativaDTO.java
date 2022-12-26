package com.etec.tcc.sprint_quiz.model.dto;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.etec.tcc.sprint_quiz.model.Alternativa;
import com.etec.tcc.sprint_quiz.service.QuestaoService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AlternativaDTO {

	private Long id;

	@NotNull(message = "texto {campo.texto.notnull.obrigatorio}")
	@Size(max = 1000)
	private String texto;
	private String foto;
	private String questaoTexto;

//	public AlternativaDTO(Alternativa alternativa) {
//		this.id = alternativa.getId();
//		this.texto = alternativa.getTexto();
//		this.foto = alternativa.getFoto();
//		this.questaoTexto = alternativa.getQuestao().getId();
//	}
//
//	public AlternativaDTO paraDTO(Alternativa alternativa) {
//		AlternativaDTO dto = new AlternativaDTO();
//		dto.setId(alternativa.getId());
//		dto.setTexto(alternativa.getTexto());
//		dto.setFoto(alternativa.getFoto());
//		dto.setQuestaoTexto(alternativa.getQuestao().getId());
//		return dto;
//	}

	/**
	 * Recebe uma lista de Alternativas e transforma em uma lista de AlternativaDTO
	 * 
	 * @param alternativas
	 * @return lista de AlternativaDTO
	 */
//	public static List<AlternativaDTO> converterLista(List<Alternativa> alternativas) {
//		return alternativas.stream().map(AlternativaDTO::new).collect(Collectors.toList());
//	}

//	public static List<AlternativaDTO> converteLista(List<Alternativa> alternativas){
//		return alternativas.stream().map(AternativaDTO::new).C
//	}

}