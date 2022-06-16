package codingchallenge;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayMedian {
	
	public static void main(String[] args) {
		int[] array1 = {2,1};
		int[] array2 = {4,3};
		
		double median = getMedian(array1,array2);
		System.out.println(median);
	}

	
	public static double getMedian(int[] array1, int[] array2) {
		
		double median = 0.0;
		ArrayList<Integer> combinedArray = new ArrayList<Integer>();
		
		for(int i =0; i< array1.length; i++) {
			combinedArray.add(array1[i]);
		}
		for(int i =0; i< array2.length; i++) {
			combinedArray.add(array2[i]);
		}
//		System.out.println(combinedArray);
		
		Collections.sort(combinedArray);
		
//		System.out.println(combinedArray);
//		System.out.println(combinedArray.size());
		
		if(combinedArray.size()%2 == 0) {
			double upperNumber = combinedArray.get((combinedArray.size()/2));
//			System.out.println(upperNumber);
			double lowerNumber = combinedArray.get((combinedArray.size()/2)-1);
//			System.out.println(lowerNumber);
			median = (upperNumber + lowerNumber)/2;
		}else {
			median = combinedArray.get((combinedArray.size()/2));
		}
		
		
		
		return median;
	}
}
