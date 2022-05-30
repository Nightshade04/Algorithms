package sorting;

/*
 *  
 *  Algorithm: 
 *  
 *  iterate over the array from 1 to last index.
 *  for each i(index):
 *  	check if current element(arr[i]) is bigger than it's predecessor
 *  		if yes: shift the predecessor to the current place
 *  		if no: place current element(arr[i]) in this position.
 *  		repeat this process till there are no more predecessors left.
 *  you have a sorted array in the end 
 *  
 *  Time Complexity :- O(n^2) worst case
 *  
 *  Trivia: Insertion sort is efficient for small data values. 
 *  		Insertion sort is adaptive in nature, i.e. 
 *  		it is appropriate for data sets which are already partially sorted.
 *  
 */

public class InsertionSort {
	
	public void sort(int[] arr) {
		int n = arr.length;
		
		for(int i = 1; i < n;i ++) {
			int currentValue = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > currentValue) {
				arr[j + 1] = arr[j];
				j -= 1;
			}
			arr[j + 1] = currentValue;
		}
		display(arr);
	}
	
	public void display(int[] arr) {
		for(int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int arr[] = {13, 6, 5, 3, 4, 1, 7, 12};
		insertionSort.sort(arr);
	}

}
