import java.util.Scanner;
public class que1
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
     public void indexOf(int k,int n){
        node current=head;
        for(int i=1;i<=n;i++)
        {
            if(current.data==k)
            {
                System.out.println("Index= "+i);
                return;
            }
            current=current.next;
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
   
	public static void main(String[] args) {
	    Scanner x=new Scanner(System.in);
	    que1 Linklist=new que1();
	    System.out.println("How many no. = ");
	    int n=x.nextInt();
	    System.out.println("Enter no. = ");
	    for(int i=0;i<n;i++)
	    {
	        int m=x.nextInt();
	        Linklist.addLast(m);
	    }
	    System.out.println("Index of which no. = ");
	    int k=x.nextInt();
	    Linklist.indexOf(k,n);
	}
}
