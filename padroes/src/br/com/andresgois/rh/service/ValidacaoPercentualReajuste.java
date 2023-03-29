package br.com.andresgois.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import br.com.andresgois.rh.model.Funcionario;
import br.com.andresgois.rh_antigo.ValidacaoException;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {

    public void validar(Funcionario func, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = func.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if(mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre os reajustes deve ser maior que 6 meses");
        }
    }
}
