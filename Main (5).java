/*
*  UCF COP3330 Fall 2021 Assignment 1 Solution
*  Copyright 2021 Victor Urena
*/

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int year = LocalDate.now().getYear();
    int age;
    int retire;
		
		System.out.print("What is your current age? ");
		age = input.nextInt();

    System.out.print("At what age would you like to retire? ");
		retire = input.nextInt();

    int yrs_left = retire - age;
    System.out.printf("You have %d years left until you can retire. ", yrs_left);

    System.out.printf("\nIt's %d, so you can retire in %d. ", year, year+yrs_left);
	}

}
