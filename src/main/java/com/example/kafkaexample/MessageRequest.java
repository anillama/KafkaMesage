package com.example.kafkaexample;

public class MessageRequest {

    private String message;
    //messge request
    public MessageRequest(String message) {
        this.message = message;
    }
    //getMessage
    public String getMessage() {
        return message;
    }
    //setMessage
    public void setMessage(String message) {
        this.message = message;
    }
}