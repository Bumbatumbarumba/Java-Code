public class testInsertion{
	public static void main (String [] args){
		int[] test = {50, 25, 30, 12, 18};
		printArray(test);
		System.out.println("=-=-=-=-=-=-=");
		intInsertionSort(test);
		System.out.println("=-=-=-=-=-=-=");
		printArray(test);
		System.out.println("=-=-=-=-=-=-=");
	}//end of main
	public static void intInsertionSort(int[] a){
		for (int i = 1; i<a.length; i++){
			int temp = a[i];
			System.out.println(temp);
			int j;
			for (j = i-1; j>=0 && temp < a[j]; j--)
				a[j+1] = a[j];
			a[j+1] = temp;
		}
	}

	public static void printArray(int[] a){
		for (int i = 0; i <a.length; i++)
			System.out.println(a[i]);
	}
}//end of testInsertion

