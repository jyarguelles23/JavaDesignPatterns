package com.vicsystems.DesignPatterns.CreationalDesignPatterns.AbstractFactory.AWSGoogleCloud;

import com.vicsystems.DesignPatterns.CreationalDesignPatterns.AbstractFactory.AWSGoogleCloud.aws.AwsResourceFactory;
import com.vicsystems.DesignPatterns.CreationalDesignPatterns.AbstractFactory.AWSGoogleCloud.gcp.GoogleResourceFactory;

import java.time.Instant;

public class Client {
    private ResourceFactory factory;

    public Client(ResourceFactory factory){
         this.factory=factory;
    }

    public Instance createServer(Instance.Capacity cap,int storageMib){
        Instance instance=factory.createInstance(cap);
        Storage storage=factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }
    public static void main(String[] args) {
          Client aws=new Client(new AwsResourceFactory());
          Instance i1=aws.createServer(Instance.Capacity.micro,20480);
        i1.start();
        i1.stop();
        System.out.println("*******************");
        Client gcp=new Client(new GoogleResourceFactory());
        i1=gcp.createServer(Instance.Capacity.micro,20480);
        i1.start();
        i1.stop();
    }
}
