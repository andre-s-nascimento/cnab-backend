package dev.snascimento.cnabbackend.web;

import dev.snascimento.cnabbackend.entity.TransacaoReport;
import dev.snascimento.cnabbackend.service.TransacaoService;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
  private final TransacaoService transacaoService;

  public ViewController(TransacaoService transacaoService) {
    this.transacaoService = transacaoService;
  }

  @GetMapping("view")
  public String getAll(Model model) {
    List<TransacaoReport> transacaoList = transacaoService.listTotaisTransacoesPorNomeDaLoja();
    model.addAttribute("transacaoList", transacaoList);
    return "transacao";
    // var msg = "Hello there!";
    // model.addAttribute("message", msg);

    // return "hello";
  }
}
