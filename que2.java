import java.util.Scanner;
public class que2
{
    class node{
        int data;
        node next;        
        node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    node head;
    public void printList(){
        if(head==null)
        {
            System.out.println("empty");
            return;
        }
        node ptr=head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }
    public void addLast(int data){
        node newnode=new node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        node currentnode=head;
        while(currentnode.next!=null)
        {currentnode=currentnode.next;}
        currentnode.next=newnode;   
    }    
    public void deleteList(int n){
        node current=head;
        int c=0,m=1;
        for(int i=1;i<=n;i++)
        {
            if(current.data>25)
            {
                if(m==i)
                {
                    current=current.next;
                    head=head.next;
                    c++;
                    m++;
                }
                else if(i==n)
                {                     
                    if(head == null){
		                  	System.out.println("The list is empty");
	                }	
                    if(head.next == null){
	                    	head = null;
                    }
                    else{
		                node secondLast = head;
		                node lastNode = head.next;
	                	while(lastNode.next != null){
		                   	lastNode = lastNode.next;
		                	secondLast = secondLast.next;			
	                	}
	                	secondLast.next = null;
                    }
                }
                else
                {
                    current=current.next;
                    node now=head;
                    node prev=null;
                    int j=1;
                    while(j< i-c){
		              	prev = now;
		            	now = now.next;
		             	j++;
	             	}
		            prev.next = now.next;
		            now.next = null;
		            c++;
                }
            }
            else
            current=current.next;
    }
}
	public static void main(String[] args) {
	    Scanner x=new Scanner(System.in);
	    que2 Linklist=new que2();
	    System.out.println("how many no. = ");
	    int n=x.nextInt();
	    System.out.println("enter no.s between 1 to 50 = ");
	    for(int i=0;i<n;i++)
	    {
	        int m=x.nextInt();
	        Linklist.addLast(m);
	    }
	    Linklist.deleteList(n);
	    Linklist.printList();	    
	}
}
