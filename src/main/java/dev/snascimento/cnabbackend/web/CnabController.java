package dev.snascimento.cnabbackend.web;

import java.io.IOException;

import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import dev.snascimento.cnabbackend.service.CnabService;

@RestController
@RequestMapping("cnab")
public class CnabController {

  private final CnabService cnabService;

  public CnabController(CnabService cnabService) {
    this.cnabService = cnabService;
  }

  @PostMapping(value = "upload")
  public String upload(@RequestParam("file") MultipartFile file)
      throws IllegalStateException, IOException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
    cnabService.uploadCnabFile(file);

    return "Processamento iniciado!";
  }
}
