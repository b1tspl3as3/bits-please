import java.util.*;
import java.lang.*;
import java.io.*;

class RemoveDuplicatesAll
{

	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int node_data) 
		{
			data = node_data; 
			next = null; 
		}
	}


	public void add(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	public void display()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}


	public void deleteduplicatesall()
	{
		int data = 0;
		Node prev = null;
		Node temp = head;

		while (temp != null && temp.next != null)
		{
			display();
			if(temp.data == temp.next.data)
			{
				temp.next = temp.next.next;
				data = temp.data;
			}
			else
			{

				if(data == temp.data)
				{
					if(prev == null)
					{
						head = temp.next;
						prev = head;
					}
					else
					{

						prev.next = temp.next;
					}

				}
				else
				{
					prev = temp;
				}
				temp = temp.next;


			}
		}
		if(temp.data == data)
		{
			if(prev != null)
				prev.next = null;
		}
	}



	public static void main (String[] args) throws java.lang.Exception
	{
		RemoveDuplicatesAll list = new RemoveDuplicatesAll();
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(4);
		list.add(4);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(1);
		list.add(1);
		list.display();
		list.deleteduplicatesall();
		list.display();
	}
}

