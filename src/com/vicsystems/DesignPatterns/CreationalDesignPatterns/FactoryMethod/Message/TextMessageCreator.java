package com.vicsystems.DesignPatterns.CreationalDesignPatterns.FactoryMethod.Message;

import com.vicsystems.DesignPatterns.CreationalDesignPatterns.FactoryMethod.Message.messageAux.Message;
import com.vicsystems.DesignPatterns.CreationalDesignPatterns.FactoryMethod.Message.messageAux.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
