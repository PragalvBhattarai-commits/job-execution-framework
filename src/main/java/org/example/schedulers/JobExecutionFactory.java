package org.example.schedulers;

public class JobExecutionFactory {

    DataImportJob dataJob = new DataImportJob();
    EmailNotificaitonJob emailJob = new EmailNotificaitonJob();
    ReportGenerationJob reportJob = new ReportGenerationJob();

    public void runJob(String jobType){
        switch (jobType){
            case "data" -> dataJob.run();
            case "email" -> emailJob.run();
            case "report" -> reportJob.run();
        }
    }
}
