package com.etec.tcc.sprint_quiz.service;

import com.etec.tcc.sprint_quiz.model.Questao;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

public interface QuestaoService {

	List<Questao> getAll();

	Questao getById(@PathVariable Long id);

	List<Questao> getAllByTexto(@PathVariable String texto);

	List<Questao> getAllByInstituicao(@PathVariable String instituicao);

	List<Questao> findAllByAno(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate ano);

	List<Questao> findAllByAnoInicialFinal(@PathVariable LocalDate anoInicial, LocalDate anoFinal);

	List<Questao> findAllByAntesAno(@PathVariable LocalDate ano);

	List<Questao> getQuestoesByCriadorId(@PathVariable Long criadorId);

	Questao postQuestao(@Valid @RequestBody Questao questao);

	Questao salvarQuestaoComAlternativa(@RequestBody Questao questao);

	Questao putQuestao(@Valid @RequestBody Questao questao);

	void deleteQuestao(@PathVariable Long id);

}
