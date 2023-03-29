package br.com.andresgois.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import br.com.andresgois.rh.model.Funcionario;
import br.com.andresgois.rh_antigo.ValidacaoException;

public class ValidacaoPeriodicidadeEntreReajustes implements ValidacaoReajuste {
    
    public void validar(Funcionario func, BigDecimal aumento) {
        BigDecimal salarioAtual = func.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
    }
}
