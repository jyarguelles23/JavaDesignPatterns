package com.vicsystems.DesignPatterns.CreationalDesignPatterns.AbstractFactory.AWSGoogleCloud.aws;

import com.vicsystems.DesignPatterns.CreationalDesignPatterns.AbstractFactory.AWSGoogleCloud.Instance;
import com.vicsystems.DesignPatterns.CreationalDesignPatterns.AbstractFactory.AWSGoogleCloud.ResourceFactory;
import com.vicsystems.DesignPatterns.CreationalDesignPatterns.AbstractFactory.AWSGoogleCloud.Storage;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
