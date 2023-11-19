package org.example;

import java.util.Scanner;

public class Grade {
    public String checkGrade(double mark){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter mark: ");
//        double mark = sc.nextDouble();

            if(mark>=75){
                return "Grade A";
            }else if(mark>=65 && mark<75){
                return "Grade B";
            }else if(mark>=55 && mark<65){
                return "Grade C";
            }else if(mark>=40 && mark<55){
                return "Grade S";
            }else if(mark>=0 && mark<40){
                return "Grade W";
            }else{
                return "Please add valid mark";
            }
    }
}
