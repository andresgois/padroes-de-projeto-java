package br.com.andresgois.telldontask;

public class main {
    
    public static void main(String[] args) {
       
        // Padrão "Tell, Don't Ask"
        Publica p = new Publica();
        p.setStatus(null);
        try {
            p.publicar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}


