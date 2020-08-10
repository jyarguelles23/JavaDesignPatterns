package com.vicsystems.DesignPatterns.CreationalDesignPatterns.AbstractFactory.AWSGoogleCloud;

public interface Instance {
    enum Capacity{micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}
