package com.datastructure;

import java.io.*;

class StackInitialize {
	int[] stack;
	int top;
	int size;
	
	StackInitialize (int size) {
		this.size = size;
		top = -1;
		stack = new int[size];
	}
	
	//Insert item 
	void push(int item) {
		if(top == size-1) {
			System.out.println("Stack Is Full");
			return;
		}
		top = top + 1;
		stack[top] = item;
	}
	
	//Remove the item
	void pop() {
		if( top == -1) {
			System.out.println("Stack Is Empty");
			return;
		}
		int item = stack[top];
		System.out.println("The Popped Item is : "+item);
		top = top-1;
	  }

	//Display Item
	void display() {
		if(top == -1) {
			System.out.println("Stack Is Empty");
			return;
		}
		for(int i = top; i>=0 ; i--) {
			System.out.println(stack[i]+" ");
		}	
	  }
}
public class StackDs {

	public static void main (String[] args) throws IOException {
		BufferedReader bb = new BufferedReader (new InputStreamReader(System.in));
		
		String opt = "y";
		
		StackInitialize stk = new StackInitialize(5);
		while(opt.equalsIgnoreCase("y")) {
			System.out.println("1 = Push"+"\n2 = Pop"+"\n3 = Display");
			System.out.print("Enter Your Choice :- ");
			
			int ch = Integer.parseInt(bb.readLine());
			
			switch (ch) {
			case 1: 
				System.out.println("Enter The Item :- ");
				int item = Integer.parseInt(bb.readLine());
				stk.push(item);
				stk.display();
				break;
			case 2:
				stk.pop();
				stk.display();
				break;
			case 3:
				stk.display();
				break;
			default:
				System.out.println("Wrong Choice..");
			}
			System.out.println(" Any More Y/N");
			opt = bb.readLine();
		}
	}
}
