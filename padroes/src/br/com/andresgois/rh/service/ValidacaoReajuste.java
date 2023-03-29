package br.com.andresgois.rh.service;

import java.math.BigDecimal;
import br.com.andresgois.rh.model.Funcionario;

public interface ValidacaoReajuste {
    
    void validar(Funcionario func, BigDecimal aumento);
    
}
