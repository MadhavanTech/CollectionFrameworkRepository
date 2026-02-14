package LInkedList_inplimantation;

public class Node<T> {
	
	T data;
	Node<T> next;
	Node<T> pre;
	public Node(T data) {
		super();
		this.data = data;
		this.next = null;
		this.pre=null;
	}

}
