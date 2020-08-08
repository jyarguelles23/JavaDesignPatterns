package com.vicsystems.DesignPatterns.CreationalDesignPatterns.FactoryMethod.Message;

import com.vicsystems.DesignPatterns.CreationalDesignPatterns.FactoryMethod.Message.messageAux.Message;

public abstract class MessageCreator {

    public Message getMessage() {
        Message msg = createMessage();

        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    //Factory method
    protected abstract Message createMessage();

}
