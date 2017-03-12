import java.util.Random;
import java.util.Arrays;

public class FarthestPair{
    
    public static void main(String[] args){
        LinkedList test1 = new LinkedList(5, new LinkedList(2, new LinkedList(7, new LinkedList(3, null))));
        int greatest = test1.a;
        LinkedList iteratorList = test1;

        while (iteratorList.tail.tail != null){
            if (iteratorList.tail.a > greatest){
                greatest = iteratorList.tail.a;
                iteratorList.tail = iteratorList.tail.tail;
            }
            iteratorList = iteratorList.tail;
        }


        /*double[] arr = {-213, -2312, -453, -12, 1, -213};
        double smallest = arr[0];
        double largest = arr[4]; //these two initializations are arbitrary and could have been any element in the array
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
            }
            else if (arr[i] > largest){
                largest = arr[i];
            }
            System.out.println(arr[i]);
        }
        System.out.println("=========================");
        System.out.println(largest-smallest);*/

    }
}

class LinkedList{
    int a = 0;
    LinkedList tail = null;
    public LinkedList(int a, LinkedList tail){
        this.a = a;
        this.tail = tail;
    }
}