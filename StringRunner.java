package com.array;

public class StringRunner {

	public static void main(String[] args) {
		
		String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		String initial ="";
		for(String days:daysOfWeek)
			{if(days.length()>initial.length())
			initial=days;
		}System.out.println("The Longest string is:");
		System.out.println(initial );
		
		
		System.out.println("The Week days in order are:");
		
		for(String days:daysOfWeek)
		System.out.println(days);
		
		System.out.println("The Week days in reverse order are:");
		for(int i=daysOfWeek.length-1;i>=0;i--)
	System.out.println(daysOfWeek[i]);

	}

}
