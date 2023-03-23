package br.com.andresgois.telldontask;

public class Publica {
    
    private String status;
    
    public String publicar() throws Exception {
        
        if(status == null) {
           throw new Exception("FALHA");  
        }
        return "OK";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }   
}
