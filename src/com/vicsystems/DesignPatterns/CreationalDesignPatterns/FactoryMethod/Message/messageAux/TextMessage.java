package com.vicsystems.DesignPatterns.CreationalDesignPatterns.FactoryMethod.Message.messageAux;

public class TextMessage extends Message {

    @Override
    public String getContent() {
        return "Text";
    }

}
