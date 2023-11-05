package dev.snascimento.cnabbackend.web;


import dev.snascimento.cnabbackend.entity.TransacaoReport;
import dev.snascimento.cnabbackend.service.TransacaoService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transacoes")
public class TransacaoController {

  private TransacaoService transacaoService;

  public TransacaoController(TransacaoService transacaoService) {
    this.transacaoService = transacaoService;
  }

  @GetMapping
  List<TransacaoReport> listAll() {
    return transacaoService.listTotaisTransacoesPorNomeDaLoja();
  }
}
