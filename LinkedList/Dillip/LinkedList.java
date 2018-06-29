import java.util.*;
import java.lang.*;
import java.io.*;

class LinkedList
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


	public void reverse()
	{
		Node temp = head;
		Node prev = null;
		Node next = null;
		while (temp != null)
		{

			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		head = prev;
	}



	public static void main (String[] args) throws java.lang.Exception
	{
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.display();
		list.reverse();
		list.display();
	}
}
