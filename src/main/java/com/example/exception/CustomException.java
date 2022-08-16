package com.example.exception;

public class CustomException extends  RuntimeException {
    private String message;
    private String hint;

    protected CustomException() {}

    public CustomException(String message, String hint) {
        this.message = message;
        this.hint = hint;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
}
