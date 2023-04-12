class Linklist{
	class Node{
		int data;
		Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
		}
	}
	Node head;
		public void printList(){
		if(head == null){
			System.out.println("empty");
			return;
		}
		Node curr = head;
		while(curr != null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}	
	}
	public void addAtIndex(int data,int index){
	    Node ptl=new Node(data);
	    Node p=head;
	    int i=0;
        while(i!=index-1)
        {
          p=p.next;
          i++;
        }
        ptl.data=data;
        ptl.next=p.next;
        p.next=ptl;
	}
	public void addFirst(int data){
		Node newNode = new Node(data);
		
		if(head == null)
		{
				head = newNode;
				return;
		}
		newNode.next = head;
		head = newNode;
	}	
	public void addLast(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			return;
		}
		
		Node curr = head;
		while(curr.next != null){
			curr = curr.next;
		}
		curr.next = newNode;
	}	
	public void deleteAtIndex(int index){
          Node now=head;
          Node prev=null;
          int j=1;
          while(j< index){
              prev = now;
	       	  now = now.next;
		      j++;
	             	}
		            prev.next = now.next;
		            now.next = null;
	}	
	public void deleteFirst(){
		if(head == null){
			System.out.println("empty");
			return;
		}
		head = head.next;
	}	
	public void deleteLast(){
	if(head == null){
			System.out.println("empty");
			return;
		}
	if(head.next == null){
		head = null;
		return;
	}
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null){
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}	
	public static void main(String args[]){
		Linklist list = new Linklist();
	    list.addFirst(10);
	    list.addAtIndex(30,1);
	    list.printList();
	    System.out.println();
	    list.addFirst(50);
	    list.printList();
	    System.out.println();
	    list.deleteLast();
	    list.printList();
  	}
}