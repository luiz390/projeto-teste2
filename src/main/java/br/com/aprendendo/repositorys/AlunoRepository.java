package br.com.aprendendo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aprendendo.eneity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
