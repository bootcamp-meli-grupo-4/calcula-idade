package com.mercadolivre.calculadoraidade;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class CalculadoraService {

    public Integer calculaIdade(Integer dia, Integer mes, Integer ano) {
        LocalDate date = LocalDate.of(ano, mes, dia);
        Period between = Period.between(date, LocalDate.now());
        return between.getYears();
    }
}
