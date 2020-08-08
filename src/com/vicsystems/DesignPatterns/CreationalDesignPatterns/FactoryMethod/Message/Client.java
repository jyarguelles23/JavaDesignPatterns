package com.vicsystems.DesignPatterns.CreationalDesignPatterns.FactoryMethod.Message;

import com.vicsystems.DesignPatterns.CreationalDesignPatterns.FactoryMethod.Message.messageAux.Message;

public class Client {
    public static void main(String[] args) {
        printMessage(new JsonMessageCreator());

        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg);
    }
}
