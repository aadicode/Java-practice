package LinkedList;


public class Addatindex {

	class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next =null;
		}
	}
	static Node head;
	void insert(int d,int index)
	{
		
		Node temp=new Node(d);
		if(index==0)
		{
			head=temp;
		}
		Node ptr=head;
		for(int i=0;i<index;i++)
		{
		   ptr=ptr.next;
		   
		}
		temp.next=ptr.next;
		ptr.next=temp;
	}
	
	static void print()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		Addatindex l= new Addatindex();
		l.insert(5,1);
		l.insert(4,2);
		l.insert(3,3);
		l.insert(2,4);
		l.insert(1,5);
        print();
	}

}
