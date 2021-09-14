// yousaffuentes-cop3330-ex21

/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the number of the month: ");
        int numMonth = s.nextInt();

        String monthMatch = "";

        switch(numMonth) {
            case 1:
                monthMatch = "January";
                break;
            case 2:
                monthMatch = "February";
                break;
            case 3:
                monthMatch = "March";
                break;
            case 4:
                monthMatch = "April";
                break;
            case 5:
                monthMatch = "May";
                break;
            case 6:
                monthMatch = "June";
                break;
            case 7:
                monthMatch = "July";
                break;
            case 8:
                monthMatch = "August";
                break;
            case 9:
                monthMatch = "September";
                break;
            case 10:
                monthMatch = "October";
                break;
            case 11:
                monthMatch = "November";
                break;
            case 12:
                monthMatch = "December";
                break;
            default:
                break;

        };

        System.out.println(String.format("The name of the month is %s.", monthMatch));

    }
}
