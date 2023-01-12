package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String endUserName, endUserBirthDay;

        Scanner scanner= new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        while (true)
        {

            while(true)
            {
                System.out.println("Please enter the user's name:- ");
                endUserName = scanner.nextLine();
                if("".equals(endUserName))
                {
                    System.out.println("Please Enter Valid User Name.");
                }
                else{
                    break;
                }
            }
            System.out.println("Please Enter User's Birthday (MM/dd/yyyy):- ");
            endUserBirthDay = scanner.nextLine();
            EndUser endUser = new EndUser(endUserName, endUserBirthDay);

            try {
                LocalDate localCurrentDate = LocalDate.now();
                LocalDate localBirthDate = LocalDate.parse(endUserBirthDay, dtf);
                System.out.println(endUser.getEndUserName()+" is "+ endUser.getCurrentAge(localBirthDate, localCurrentDate) + " years old as of today.");
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Birthdate is invalid");
            }
        }
    }
}
