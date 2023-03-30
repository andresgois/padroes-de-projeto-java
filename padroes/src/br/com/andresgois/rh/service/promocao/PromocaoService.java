package br.com.andresgois.rh.service.promocao;

import br.com.andresgois.rh.model.Cargo;
import br.com.andresgois.rh.model.Funcionario;
import br.com.andresgois.rh_antigo.ValidacaoException;

public class PromocaoService {
    
    public void promover(Funcionario func, boolean metaBatida) {
        Cargo cargoAtual = func.getCargo();
        if(Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerentes não podem ser promovidos!");
        }
        
        if(metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            func.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionario não bateu a meta!");
        }
    }
}
