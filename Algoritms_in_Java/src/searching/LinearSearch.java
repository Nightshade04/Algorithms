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
 *  Iterate over the given collection
 *  For each element present in the collection -
 *  	check if the val is equal to the current pointed value (coll[i]) -
 *  		if yes, break out and return true indicating the value is found in the collection
 *  		if no, keep checking with the rest of the values.
 *  	if the complete collection is traversed and the value is not found, return false indicating the val does not exist in the coll
 *  
 *  Time Complexity :- O(n) worst case
 *  				   O(1) best case
 *  
 *  Trivia: Can be used even if the collection is unsorted.
 *  
 */


public class LinearSearch {

	// can be adapted to other data types too
	public boolean linearSearch(int[] col, int val) {
		for(int i = 0; i < col.length;i ++) {
			if(col[i] == val) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] col = {1, 5, 9, 2, 4, 3, 7, 10, 15, -1, 75};
		int val = 25;
		LinearSearch ls = new LinearSearch();
		
		//Usage
		if(ls.linearSearch(col, val))
			System.out.println("Value is present.");
		else
			System.out.println("Value is absent.");
	}
	
}
