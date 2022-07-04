package array;

import java.util.Scanner;

public class sortArray {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		int[] myArray = getInteger(5);
		int[] sorted = SortArray(myArray);
		printArray(sorted);
	}

	public static int[] getInteger(int number) {
		System.out.println("Enter the " + number + " of element\r");
		int[] value = new int[number];
		for (int i = 0; i < value.length; i++) {
			value[i] = scanner.nextInt();
		}
		return value;
	}

public static int[] SortArray(int[] myArray) {
	int temp;
	for(int i = 0; i<myArray.length;i++) {
		for(int j = i+1;j<myArray.length;j++) {
		if(myArray[i]<myArray[j]) {
			temp = myArray[i];
			myArray[i] = myArray[j];
			myArray[j]= temp;		
		}
	}
	}
	return myArray;
}

public static void printArray(int[] sort ) {
	System.out.println("the sorted array is:- ");
	   for(int i = 0; i<sort.length ;i++) {
    	System.out.print(sort[i]+ " ");
    }

}
}
