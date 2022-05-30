package sorting;

/*
 *  
 *  Algorithm: 
 *  
 *  iterate over the array from 0 to last index.
 *  for each i(index):
 *  	find the minimum in the rest of the array
 *  	swap the positions of the min element and arr[i]
 *  you have a sorted array in the end 
 *  
 *  Time Complexity :- O(n^2) worst case
 *  
 */

public class SelectionSort {
	
	public void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int pos = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(min > arr[j]) {
					min  = arr[j];
					pos = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		display(arr);
	}
	
	public void display(int[] arr) {
		for(int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		SelectionSort selectionSort =  new SelectionSort();
		int arr[] = {13, 6, 5, 3, 4, 1, 7, 12};
		selectionSort.sort(arr);
	}

}
