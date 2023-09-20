package io.github.andresgois;

import javax.swing.JOptionPane;

import io.github.andresgois.factory.FactoryMensagem;
import io.github.andresgois.infra.mensagemexterna.Mensagem;

public class Main {
    
    public static void main(String[] args) {
        String txt = JOptionPane.showInputDialog(null);
        Mensagem sms = FactoryMensagem.getMensagem("email");
        sms.enviar(txt);
    }
    
}
