package ProcessingArrays;

import java.util.Arrays;

public class test713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sourceArray = {3, 4, 5};
		int[] targetArray = new int[sourceArray.length];
		for (int i = 0; i < sourceArray.length; i++) {
		targetArray[i] = sourceArray[i];
		
		 System.out.println("sourceArray: " + Arrays.toString(sourceArray));
	     System.out.println("targetArray: " + Arrays.toString(targetArray));
		}
	}

}
