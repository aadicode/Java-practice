package LinkedList;



//Java program to count number of nodes in a linked list



//Linked List class
class LinkedListIntro {
	static Node head; // head of list
	
	/* Linked list Node*/
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* Returns count of nodes in linked list */
	public int getCount()
	{
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	static void print()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		/* Start with the empty list */
		LinkedListIntro llist = new LinkedListIntro();
		llist.push(1);
		llist.push(2);
		llist.push(3);
		llist.push(4);
		llist.push(5);
        print();
        System.out.println(); 
		// Function call
		System.out.println("Count of nodes is "
						+ llist.getCount());
	}
}

