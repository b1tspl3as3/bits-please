import java.util.*;
import java.lang.*;
import java.io.*;

class RemoveDuplicates
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


	public void deleteduplicates()
	{
		Node temp = head;
		while (temp != null && temp.next != null)
		{
			if(temp.data == temp.next.data)
				temp.next = temp.next.next;
			else
				temp = temp.next;
		}
	}



	public static void main (String[] args) throws java.lang.Exception
	{
		RemoveDuplicates list = new RemoveDuplicates();
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
		list.deleteduplicates();
		list.display();
	}
}

