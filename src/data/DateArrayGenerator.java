package data;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import sorts.SelectionSort;

public class DateArrayGenerator {
	private Scanner input;
	private int amountOfDates;
	private Date[] dates;
	
	public static void main(String[] args){
		new DateArrayGenerator();
	}
	
	public DateArrayGenerator(){
		input = new Scanner(System.in);
		System.out.print("How many years to print out?");
		amountOfDates = input.nextInt();
		dates = randomDateArray(amountOfDates);
		SelectionSort.sort(dates);
		//System.out.println(randomDateArray(amountOfDates));
		if(dates != null){
		for(int i = 0; i<dates.length;i++){
			System.out.println(dates[i]);
		}
		}
		else System.out.print("empty");
	}
	
	
	public Date[] randomDateArray(int n){
		
		Date dates[] = new Date[n];
		
		for( int i = n-1; i>=0; i--){
			int day = ThreadLocalRandom.current().nextInt(1, 31 + 1);
			int month = ThreadLocalRandom.current().nextInt(1, 12 + 1);
			int year = ThreadLocalRandom.current().nextInt(1915, 2015 + 1);
			
			dates[i] = new Date(month, day ,year);
			//System.out.println(dates[i]);
		}
		
		return dates;
		
		//return an array of n random dates over the last 100 years

		
	}

}
