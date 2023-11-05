package dev.snascimento.cnabbackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dev.snascimento.cnabbackend.entity.Transacao;

public interface TransacaoRepository extends CrudRepository<Transacao, Long>{
    //select * from transacao order by nome_loja asc, id desc
    List<Transacao> findAllByOrderByNomeDaLojaAscIdDesc();
}
