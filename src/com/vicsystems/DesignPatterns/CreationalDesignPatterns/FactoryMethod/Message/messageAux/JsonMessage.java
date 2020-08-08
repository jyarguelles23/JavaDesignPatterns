package com.vicsystems.DesignPatterns.CreationalDesignPatterns.FactoryMethod.Message.messageAux;

public class JsonMessage extends Message{
    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }
}
