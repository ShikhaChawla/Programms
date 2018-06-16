package com.array;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		Student student = new Student ("Shikha" , new int[] {99,98,100});
		
		int number = student.getNumberOfMarks();
		System.out.println("The No Of Marks Are: "+number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("The Sum Of Marks : "+sum);
		
		int MaximumMark = student.getMaximumMark();
		System.out.println("The Maximum marks Of array Marks is : "+MaximumMark);
		
		int MinimumMark = student.getMinimumMark();
		System.out.println("The Minimum marks Of array Marks is : "+MinimumMark);
		
		BigDecimal average = student.getAverageMarks(); //bigdecimal is used because average can be a float
		System.out.println("The Average marks Of array Marks is : "+average);
		
		student.addNewMark(35);
		System.out.println(student);
		
		student.removeMarkAtIndex(3);
		System.out.println(student);
	}

}
