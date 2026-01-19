package org.example;
import org.example.schedulers.*;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        JobExecutionFactory jobScheduler = new JobExecutionFactory();

        Scanner sc = new Scanner(System.in);
        boolean session = true;

        while (session){
            System.out.println("---------------------------");
            System.out.println("---------------------------");
            System.out.println("1. Data Import Job");
            System.out.println("2. Report Generation Job");
            System.out.println("3. Email Notification Job");
            System.out.println("4. Exit");
            String userResponse = sc.nextLine();

            switch (userResponse){
                case "1" -> jobScheduler.runJob("data");
                case "2" -> jobScheduler.runJob("report");
                case "3" -> jobScheduler.runJob("email");
                case "4" -> session = false;
            }
        }
        System.out.println("closing job scheduler....");
    }
}