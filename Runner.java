
public class Runner {

	public static void main(String[] args) {
	LinkedList list=new LinkedList();
	list.insert(5);
	list.insert(7);
	list.insert(8);
	list.insert(9);
	
	list.insertAtStart(25);
	list.insertAt(2, 67);
	list.delete(4);
	list.show(); 
	}

}
