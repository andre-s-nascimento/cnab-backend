package dev.snascimento.cnabbackend.web;

import java.io.IOException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("cnab")
public class CnabController {

  private final CnabService cnabService;

  public CnabController(CnabService cnabService) {
    this.cnabService = cnabService;
  }

  @PostMapping(value = "upload")
  public String upload(@RequestParam("file") MultipartFile file)
      throws IllegalStateException, IOException {
    cnabService.uploadCnabFile(file);

    return "Processamento iniciado!";
  }
}
