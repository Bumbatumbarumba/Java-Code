public class LinkedListInsertion{
	public static void main (String [] args){
		MyList test1 = new myList(1, null);
		test1.insertThis(test1, 3, 3);
	}//end of main method
}//end of LinkedListInsertion class

class MyList{
	int head;
	myList tail;

	//default constructor
	myList(){
		this.head = 0;
		this.tail = null;
	}

	//specific constructor
	myList(int head, myList tail){
		this.head = head;
		this.tail = tail;
	}

	public int getHead(){
		return this.head;
	}
	public myList getTail(){
		return this.tail;
	}
	public void setHead(int head){
		this.head = head;
	}
	public void setTail(myList tail){
		this.tail = tail;
	}

	public void randomInsert(myList myList, int insertThis, int location){
		myList tempList1 = myList;
		int listLength = 0;
		while (tempList1.tail != null){
			listLength += 1;
		}
		tempList1 = myList;
		if (location > listLength || location < 0){
			System.out.println("Invalid index");
		}
		else{
			System.out.println("eyy");
		}
	}
}