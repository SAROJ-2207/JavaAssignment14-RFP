package com.datastructure;
import java.io.*;

	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	 class LinkedList {
		public Node head = null;
		public Node tail = null;
		
		public void addNode (int data) {
			Node new_node = new Node(data);
			
			if(head == null) {
				head = new_node;
				tail = new_node;
			}else{
				tail.next = new_node;
				tail = new_node;
			}
		}	
		
		public void display() {
			Node p;
			/*if(head == null) {
				System.out.print(" It Is Empty");
				return;
			}*/
			p = head;
			while(p!=null) {
				System.out.print(p.data+" ");
				p = p.next;
			}
		}
	}
	
public class LinkedListDS {
	public static void main (String[] args) throws IOException {
		BufferedReader obj = new BufferedReader (new InputStreamReader(System.in));
		
		String opt = "y";
		int data;
		LinkedList list = new LinkedList();
		do {
			System.out.print("Enter the Data For the Node :- ");
			data = Integer.parseInt(obj.readLine());
			list.addNode(data);
			System.out.print("Enter Any more node Y/N ");
			opt = obj.readLine();
		} while(opt.equalsIgnoreCase("y"));
		System.out.println();
		list.display();
	}	
}
