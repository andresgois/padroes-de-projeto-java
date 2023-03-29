package br.com.andresgois.rh.service;

import java.math.BigDecimal;
import java.util.List;
import br.com.andresgois.rh.model.Funcionario;

public class ReajusteService {
    
    // Forma um pouco mais acoplada, a cada nova regra a classe irá cresce mais e mais
    /*public void reajustarSalario(Funcionario func, BigDecimal aumento) {
        BigDecimal salarioAtual = func.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
        
        LocalDate dataUltimoReajuste = func.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if(mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre os reajustes deve ser maior que 6 meses");
        }
        
        BigDecimal salrioReajustado = salarioAtual.add(aumento);
        func.atualizarSalario(salrioReajustado);
    }*/
    private List<ValidacaoReajuste> validacoes;
    
    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }
    
    public void reajustarSalario(Funcionario func, BigDecimal aumento) {
        validacoes.forEach( v -> v.validar(func, aumento));

        BigDecimal salrioReajustado = func.getSalario().add(aumento);
        func.atualizarSalario(salrioReajustado);
    }
}
