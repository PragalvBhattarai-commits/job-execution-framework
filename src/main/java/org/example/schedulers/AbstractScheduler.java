package org.example.schedulers;

public abstract class AbstractScheduler {

    abstract void run();
    abstract void initializeResources();
    abstract void executeBusinessLogic();
    abstract void cleanUp();
    abstract void reportStatus();



}

