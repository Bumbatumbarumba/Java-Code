public class Ass1_6{
	public static void main (String [] args){
		int[] arr1 = {1, 3, 5, 7, 9, 11};
		int[] arr2 = {1};
		int i = 0;
		int j = 0;

		while (i < arr1.length && j < arr2.length){
			if (arr1[i] > arr2[j]){ j++;}
			else if (arr1[i] < arr2[j]){ i++;}
			else{
				System.out.println(arr1[i]);
				i++;
				j++;
			}
		}
	}
}