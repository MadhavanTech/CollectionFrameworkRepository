package LInkedList_inplimantation;

public class LinkedLIst<T> {

		
		Node<T> head;
		
		public void add(T data) {
			
			Node<T> a = new Node<T>(data);
			
			if(head==null) {
				head=a;
				return;
			}
			
			
			Node<T> temp=head;
			while(temp.next!=null) {
				
				temp=temp.next;
			}
			
			a.pre=temp;
			temp.next=a;
			
		}
		
		public void addfirt(int data) {
			
			Node<T> a= new Node(data);
			a.next=head;
			head=a;
			
		}
		
		public void delete(T key) {
			
			
			if(head==null) {
				return;
			}
			Node<T>temp=head;
			
			if(temp.data==key) {
				
				head=temp.next;
			}
			
			while(temp.data!=key&& temp.next!=null) {
				
				temp=temp.next;
			}
			
			if(temp.next!=null) {
				
				temp.next=temp.next.next;
			}
			
			
			
		}
		
		public void Display() {
			
			Node<T> temp=head;
			
			while(temp!=null) {
				
				System.out.print(temp.data+"->");
				temp=temp.next;
				
			}
			
			System.out.println("null");
		}
		
		public void revers() {
			
			Node<T> temp= head;
			
			while(temp.next!=null) {
				temp=temp.next;
			}
			
			if(temp.next==null) {
				
				
				while(temp.pre!=null) {
					
					System.out.print(temp.data+"->");
					temp=temp.pre;
				}
				
				System.out.println("null");
			}
		}
		
		public static void main(String[] args) {
			
			LinkedLIst<Object> a = new LinkedLIst();
			
			a.add(10);
			a.add(20);
			a.add(50);
			a.Display();
			a.delete(10);
			a.Display();
			a.add(30);
			a.add(10);
			a.add("maddy");
			a.add(2.45);
			a.add('m');
			a.Display();
			a.revers();
			
		}
		
		
		


}
