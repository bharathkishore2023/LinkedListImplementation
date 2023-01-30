
public class LinkedList {
	Node head;
	
	public void insert(int data) {
		Node node=new Node(); // create a new node
		node.data=data;			// add value to node
		node.next=null;			// make node address as null
		if(head==null) {       // if current node is header
			head=node;
		}
		else {
			Node n =head;		// if current node is not header
			while(n.next!=null) { 
				//here we run loop,until address becomes null
				n=n.next;
			}
			n.next=node; 
		}
	}
	public void show() {
		Node node=head;
		
		while(node.next!=null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println(node.data);
	}
	
	public void insertAtStart(int data) {
		
		Node node=new Node(); // create a new node
		node.data=data;   // add value to node
	/*	node.next=null;*/
		node.next=head;   // make this node as head
		head = node;
	}
	
	
	public void insertAt(int index,int data) {
		Node node=new Node(); 
		node.data=data;			
		node.next=null;			
		if(index==0) {
			insertAtStart(data);
		}
		else {
		Node n = head;
		for(int i=0;i<index-1;i++){
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
		}
	}
	public void delete(int index) {
		if(index==0) {
			head=head.next;
		}
		else {
			Node n=head;
			Node n1=null;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
		}
	}
}
