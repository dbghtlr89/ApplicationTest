public class SearchMaxTest {

	public static int searchMax(int arr[]) {
		int max = arr[0];
		int[] array = {1,3,4,2};

		for(int i=0; i <arr.length; i++) {
			if(max < arr[i]) 
				max = arr[i];
		}
		return max;
	}
}


public class SearchMaxTest {

	public static int searchMax(int arr[]) {
		int max = arr[0];
		int[] array = {-12,-1,-3,-4,-2};

		for(int i=0; i <arr.length; i++) {
			if(max < arr[i]) 
				max = arr[i];
		}
		return max;
	}
}