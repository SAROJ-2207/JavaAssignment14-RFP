
import java.io.*;

class QueueData {
	int[] queue;
	int rear;
	int front;
	int size;
	
	QueueData (int size) {
		this.size = size;
		rear = -1;
		front = -1;
		queue = new int[size];
	}
	
	//Insert item 
	void insert_q (int item) {
		if(rear == size-1) {
			System.out.println("Queue Is Full");
			return;
		}
		if(front == -1) {
			rear = 0;
			front = 0;
		}else {
			rear = rear+1;
		}
		queue[rear] = item;
	}
	
	// Delete Item
	void delete_q () {
		if(front == -1) {
			System.out.println("Queue is Empty");
			return;
		}
		int item = queue[front];
		System.out.println("Delete Item = "+item);
		
		if(front == rear) {
			front = -1;
			rear = -1;
		}else {
			front = front+1;
		}
 }
	
	//Display Item
	void display_q() {
		if(front == -1) {
			System.out.println("Queue is Empty");
			return;
		}else {
			for(int i = front; i<= rear; i++) {
				System.out.println(queue[i]+ " ");
			}
		}
		
	}
}

public class Queue_Datastructure {

	public static void main(String[] args) throws IOException {
		BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));
		String opt = "y";
		
		System.out.print("Enter Queue Size :- ");
		int q_size =Integer.parseInt(bb.readLine()); 
		QueueData qd = new QueueData(q_size);
		
		while(opt.equalsIgnoreCase("y")) {
			System.out.println(" 1 - Insert Queue" + "\n 2 - Delete Queue" + "\n 3 - Display Queue"+"\n=======================");
			System.out.print("Enter Your Choice :- ");
			
			int ch = Integer.parseInt(bb.readLine()); 
			
			switch (ch) {
			case 1:
				System.out.println("Enter Item :- ");
				int item = Integer.parseInt(bb.readLine());
				qd.insert_q(item);
				qd.display_q();
				break;
			case 2:
				qd.delete_q();
				qd.display_q();
				break;
			case 3:
				qd.display_q();
				break;
			default:
				System.out.println("Wrong Input Try Again.....");
			}
		System.out.println("Any More Y/N");
		opt = bb.readLine();
		}
	}
}
