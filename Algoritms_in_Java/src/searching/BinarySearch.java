package searching;

/*
 * Algorithm
 * 
 *  For a given collection and a value to be searched in the said collection
 *  
 *  coll => collection in which the value is to be searched
 *  val => value to be searched in the collection
 *  
 *  Steps :
 *  
 *  calculate left = 0 (starting index of the collection) and right = col.length - 1(ending index of the collection)
 *  repeat till left <= right :
 *  	if val == col[ (left + right) / 2 ]: (checking the value against the element in the middle of the collection)
 *  		return true
 *  	else if val < col[ (left + right) / 2 ]:
 *  		right = (left + right) / 2 - 1
 *  	else
 *  		left = (left + right) / 2 + 1
 * 
 *  return false if left > right
 *  
 *  Time Complexity :- O(log n) worst case
 *  				   O(1) best case
 *  
 *  Trivia: Can only be used if the collection is sorted either in ascending or descending order.
 *  
 */

public class BinarySearch {
	
	public boolean binarySearch(int[] col, int val) {
		int left = 0;
		int right = col.length - 1;
		int mid = (left + right) / 2;
		
		while(left <= right) {
			if(col[mid] == val)
				return true;
			else if(col[mid] < val)
				left = mid + 1;
			else
				right = mid - 1;
			mid = (left + right) / 2;
		}
		return false;
		
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] col = {-1, 1, 2, 3, 4, 5, 7, 9, 10, 15, 75};
		int val = -1;
		
		//Usage
		if(bs.binarySearch(col, val)) 
			System.out.println("Value is present.");
		else
			System.out.println("Value is absent.");
	}

}
