package ProcessingArrays;

import java.util.Arrays;

public class copyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sourceArray = {2, 3, 1, 5, 10};
		int[] targetArray = new int[sourceArray.length];
		for (int i = 0; i < sourceArray.length; i++) {
		targetArray[i] = sourceArray[i];
		
		 System.out.println("sourceArray: " + Arrays.toString(sourceArray));
	     System.out.println("targetArray: " + Arrays.toString(targetArray));
		}

	}

}
