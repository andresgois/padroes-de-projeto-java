package io.github.andresgois.factory;

import io.github.andresgois.exception.MensagemException;
import io.github.andresgois.infra.mensagemexterna.Mensagem;
import io.github.andresgois.modelo.MensagemEmail;
import io.github.andresgois.modelo.MensagemSMS;

public class FactoryMensagem {
    
    public static Mensagem getMensagem(String msg){
        if(msg.equalsIgnoreCase("sms")) {
            return new MensagemSMS();
        }else if(msg.equalsIgnoreCase("email")) {
            return new MensagemEmail();
        }else {
            throw new MensagemException("Tipo de mensagem não encontrado!");
        }
    }
}
