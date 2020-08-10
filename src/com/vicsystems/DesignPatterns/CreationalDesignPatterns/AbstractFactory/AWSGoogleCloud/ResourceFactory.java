package com.vicsystems.DesignPatterns.CreationalDesignPatterns.AbstractFactory.AWSGoogleCloud;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capMib);
}
