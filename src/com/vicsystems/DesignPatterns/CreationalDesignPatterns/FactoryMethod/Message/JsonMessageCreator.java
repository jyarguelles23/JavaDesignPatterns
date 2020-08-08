package com.vicsystems.DesignPatterns.CreationalDesignPatterns.FactoryMethod.Message;

import com.vicsystems.DesignPatterns.CreationalDesignPatterns.FactoryMethod.Message.messageAux.JsonMessage;
import com.vicsystems.DesignPatterns.CreationalDesignPatterns.FactoryMethod.Message.messageAux.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JsonMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JsonMessage();
    }
}
