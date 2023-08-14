package com.gradeCalculator;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int English;
		int Hindi;
		int Science;
		int math;

		System.out.print("Enter Marks for English:  ");
		English = sc.nextInt();

		System.out.print("Enter Marks  for Hindi:   ");
		Hindi = sc.nextInt();

		System.out.print("Enter Marks for Science:  ");
		Science = sc.nextInt();

		System.out.print("Enter Marks  for math:    ");
		math = sc.nextInt();

		System.out.println("++++++++++++++++++++++++++++++");

		System.out.println("Total Marks");
		System.out.println(English + Hindi + Science + math);

		System.out.println("++++++++++++++++++++++++++++++");

		System.out.println("Average Percentage");
		int Percentage = ((English + Hindi + Science + math )*100)/ 400;
		System.out.println(Percentage + "%");
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		 if (Percentage >= 80 && Percentage <= 100) {
	            System.out.println("A");
	        } else if (Percentage >= 60 && Percentage < 80) {
	            System.out.println("B");
	        } else if (Percentage >= 40 && Percentage < 60) {
	            System.out.println("C");
	        } else if (Percentage >= 33 && Percentage < 40) {
	            System.out.println("D");
	        } else {
	            System.out.println("Fail");
	        }
		
		
        sc.close();
	}

}
