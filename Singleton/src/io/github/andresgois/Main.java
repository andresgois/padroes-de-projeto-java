package io.github.andresgois;

import io.github.andresgois.infra.conexaoexterna.GerenciadorImpressao;

public class Main {
    
   public static void main(String[] args) {
       GerenciadorImpressao g1 = GerenciadorImpressao.getInstance();
       GerenciadorImpressao g2 = GerenciadorImpressao.getInstance();
       GerenciadorImpressao g3 = GerenciadorImpressao.getInstance();
       
       System.out.println(g1);
       System.out.println(g2);
       System.out.println(g3);
   }
}
