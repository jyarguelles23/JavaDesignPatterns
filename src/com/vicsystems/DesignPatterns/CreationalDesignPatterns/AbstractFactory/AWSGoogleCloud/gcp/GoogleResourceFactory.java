package com.vicsystems.DesignPatterns.CreationalDesignPatterns.AbstractFactory.AWSGoogleCloud.gcp;

import com.vicsystems.DesignPatterns.CreationalDesignPatterns.AbstractFactory.AWSGoogleCloud.Instance;
import com.vicsystems.DesignPatterns.CreationalDesignPatterns.AbstractFactory.AWSGoogleCloud.ResourceFactory;
import com.vicsystems.DesignPatterns.CreationalDesignPatterns.AbstractFactory.AWSGoogleCloud.Storage;

public class GoogleResourceFactory  implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }
}
