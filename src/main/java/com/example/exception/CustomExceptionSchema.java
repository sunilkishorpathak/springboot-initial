package com.example.exception;

public class CustomExceptionSchema {
    private String message;
    private String hint;

    public CustomExceptionSchema() {
    }

    public CustomExceptionSchema(String message, String hint) {
        this.message = message;
        this.hint = hint;
    }

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
