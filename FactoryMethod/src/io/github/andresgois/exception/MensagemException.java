package io.github.andresgois.exception;

public class MensagemException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    
    public MensagemException(String msg) {
        super(msg);
    }
    
}
