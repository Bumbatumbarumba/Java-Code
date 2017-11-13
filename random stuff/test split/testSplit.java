import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class testSplit{
	public static void main (String [] args) throws Exception{
/*		String multipleDelimiters = "{},";
		String words = "{testing,11,22},{will,33,44}";

		StringTokenizer test = new StringTokenizer(words, "{},");
		String[] test2 = words.split(",|\\{|\\}");

		while (test.hasMoreTokens())
			System.out.println(test.nextToken());
		for (String s: test2)
			System.out.println(s);
		System.out.println("=-=-=-=-=-=-=-=-=");
		for (int i = 0; i< test2.length-2; i++){
			if (!test2[i].equals("")){
				System.out.println(test2[i]);
				System.out.println(test2[i+1]);
				System.out.println(test2[i+2]);
				i+=3;
			}
			//System.out.println(test2[i]);
		}*/

		Scanner scan = new Scanner(new File("textFiles/testSplit.txt"));
		System.out.println(scan.next());
		System.out.println(scan.next());
		double a = System.nanoTime();
		double b = System.nanoTime();
		System.out.println(a);
		System.out.println(b);
		System.out.println(b-a);
	}
}
