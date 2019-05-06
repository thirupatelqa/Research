package com.research.thiru;

public class LargestElementInArray {
	
	public void getIndexOfMax(int[] array) {
	    if (!(array.length == 0)) {
	    
	    	int largest = array[0];
	    	int position = 0;
	    	for(int i=1; i<array.length; i++) {
		        if (largest < array[i]) {
		            position = i;
		            largest = array[i];
		        }
		    }
		    System.out.println("Index is: "+position);
		    System.out.println("Value is: "+largest);
		} 
	    else{
	    System.out.println("Array length is zero");
	 }
}
	public static void main(String args[]){
		int[] array = {99,12,58,87,56};
		LargestElementInArray indexOfLargestValue = new LargestElementInArray();
		indexOfLargestValue.getIndexOfMax(array);
	}
}
