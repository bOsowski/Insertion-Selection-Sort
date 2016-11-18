package sorts;

public class SelectionSort {

	
	public static void sort(Comparable[] objectArray)
	{
		int N = objectArray.length;
		for( int i = 0; i < N; i++){
			int min = i;
			for(int j = i+1; j < N; j++)
			{
				if(less(objectArray[j], objectArray[min]))
					min = j;
			}
			exch(objectArray, i, min);
		}
	}

	private static void exch(Comparable[] objectArray, int i, int j) {
		Comparable swap = objectArray[i];
		objectArray[i] = objectArray[j];
		objectArray[j] = swap;
		
	}

	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	
	
	
	
}
