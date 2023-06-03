package io.github.andresgois.modelo;

import javax.swing.JOptionPane;

import io.github.andresgois.infra.mensagemexterna.Mensagem;

public class MensagemEmail implements Mensagem {
    
    @Override
    public void enviar(String msg) {
        JOptionPane.showMessageDialog(null, "Enviado por E-mail: "+msg);
    }
    
}
