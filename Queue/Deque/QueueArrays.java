package QueueArray;

public class QueueArrays<T> {
	
	
	
	int front;
	int rear;
	int size;
	
	T[] a;
	

	public QueueArrays() {
		super();
		this.front = 0;
		this.rear = -1;
		this.size = 5;
		this.a = (T[]) new Object[5];
	}
	
	
	public void Queuefull() {
		
		T[] n = (T[])new Object[a.length*2];
		
		for(int i=0;i<a.length;i++) {
			
			n[i]=a[i];
		}
		
		a=n;
		size=a.length;
	}
	
	
	public void enqueue(T value) {
		
		if(rear==size-1) {
			
			Queuefull();
			rear++;
			a[rear]=value;
		}else {
			
			rear++;
			a[rear]=value;
		}
	}
	
	public T dequeue() {
		
		if(rear==-1) {
			System.out.println("Queue is empty");
		}
			
		
			return a[front++];
			
			
	}
	
	public void display() {
		
		if(rear==-1) {
			
			System.out.println("Queue is Empty");
		}
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
	}
	
	public String toString() {
		
		StringBuffer b = new StringBuffer();
		
		b.append("[");
		for(int i=0;i<=rear;i++) {
			
			if(i==rear) {
				
				b.append(a[i]);
				
			}else {
				
				b.append(a[i]+",");
			}
		}
		b.append("]");
		
		return new String(b);
	}



	public static void main(String[] args) {
		
		
		QueueArrays<Integer> a = new QueueArrays<Integer>();
		
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		a.enqueue(4);
		a.enqueue(5);
		a.enqueue(6);
		a.enqueue(7);
		a.enqueue(8);
		a.enqueue(9);
		a.enqueue(10);
		a.enqueue(11);
		System.out.println(a);

	}

}
