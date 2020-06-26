package clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import clientes.model.entity.Servico;

//o JpaRepository recebe a entidade e o tipo de dado da chave primaria
public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
