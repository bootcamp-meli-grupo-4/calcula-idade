package com.mercadolivre.calculadoraidade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraControler {

    CalculadoraService calculadoraService;

    public CalculadoraControler(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping(path = "/{dia}/{mes}/{ano}")
    public Integer getIdade(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer ano){
        return calculadoraService.calculaIdade(dia,mes,ano);
    }
}
