package org.example.schedulers;

public class EmailNotificaitonJob {
    public void run(){
        this.initializeResources();
        this.executeBusinessLogic();
        this.cleanUp();
        this.reportStatus();
    };

    public void initializeResources(){
        System.out.println("initializing resources for email notification job...");
    };
    public void executeBusinessLogic(){
        System.out.println("executing business logic for email notification job...");
    };
    public void cleanUp(){
        System.out.println("cleaning up email notification job...");
    };
    public void reportStatus(){
        System.out.println("email notification job status: successful");
    };

}
