package org.example.schedulers;

public class ReportGenerationJob {
    public void run(){
        this.initializeResources();
        this.executeBusinessLogic();
        this.cleanUp();
        this.reportStatus();
    };

    public void initializeResources(){
        System.out.println("initializing resources for report generation job...");
    };
    public void executeBusinessLogic(){
        System.out.println("executing business logic for report generation job...");
    };
    public void cleanUp(){
        System.out.println("cleaning up report generation job...");
    };
    public void reportStatus(){
        System.out.println("report generation job status: successful");
    };

}
