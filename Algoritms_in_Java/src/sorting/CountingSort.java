package sorting;

import java.util.Arrays;

/*
 *  
 *  Algorithm: 
 *  
 *  
 *  
 *  Time Complexity :- O(n + k) where k = largest value in the array, n = size of the array.
 *  
 *  Trivia: Linear time sorting algorithm. 
 *  
 */

public class CountingSort {
	
	public void sort(int[] arr) {
		
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		int[] count  = new int[max - min + 1];
		int[] output = new int[arr.length];
		System.out.println(max + " " + min);
		
		for(int i = 0; i < arr.length; i++) {
			count[arr[i] - min] += 1;
		}
		
		for(int i = 1; i < count.length; i++) {
			count [i] += count[i - 1];
		}
		
		for(int i = arr.length - 1; i >= 0; i--) {
			output[count[arr[i] - min] - 1] = arr[i];
			count[arr[i] - min] -= 1;
		}
		
		display(output);
		
	}
	
	public void display(int[] arr) {
		for(int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		CountingSort countingSort = new CountingSort();
		int arr[] = {13, 6, 5, 3, 4, 1, 7, 12};
		countingSort.sort(arr);
	}

}
