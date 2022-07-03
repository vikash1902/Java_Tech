package array;

import java.util.Scanner;

public class Average {
	private static Scanner scanner = new Scanner(System.in);
	
 public static void main(String args[]) {
	 int[] myNumber = getNumber(5);
	for(int i = 0; i<myNumber.length;i++) {
		System.out.println("the element selected at "+i+"th number is "+ myNumber[i]);
	}
	System.out.println("the average of the number given is "+ getAverage(myNumber));
 }
 
 private static double getAverage(int[] avg) {
	int sum = 0;
	for(int i = 0; i<avg.length;i++) {
		sum += avg[i];
	}
	return (double)sum/(double)avg.length;
}

public static int[] getNumber(int number) {
	   System.out.println("Enter"+ number + " of element \r");
	   int[] value = new int[number];
	   for(int i = 0;i<value.length;i++) {
		   value[i] =scanner.nextInt();
	   }
     
	return value;	 
 }
}
