package Stack;

public class Stack_temp {
	
	Object[] a;
	int num=-1;
	
	public Stack_temp() {
		
		Object[] a = new Object[10];
		
		this.a=a;
	}
	
	public void Dinamik(Object[] a) {
		
		
		Object[] s = new Object[a.length*2];
		
		for(int i=0;i<a.length;i++) {
			
			s[i]=a[i];
		}
		
		this.a=s;
		
		
	}
	
	
	public void push(Object i) {
		
		if(num==a.length) {
			Dinamik(a);
		}
		
		if(a.length==num) {
			
			System.out.println("Array is full");
			return;
		}
		
		a[++num]=i;
		
	}
	
	public Object pop() {
		
		if(num==-1) {
			System.out.println("stack is Empty");
			return null;
		}
		
		Object temp = a[num];
		
		num--;
		
	    return temp;
		
	}
	
	public Object peek() {
		
		
		if(num==-1) {
			System.out.println("stack is Empty");
			return null;
		}
		
		
			return a[num];
	}
	
	@Override
	public String toString() {
		
		StringBuffer s = new StringBuffer();
		
		s.append('[');
		
		for(int i=0;i<=num;i++) {
			s.append(a[i]+",");
		}
		
		s.append(']');
		
		String s1 = new String(s);
		
		return s1;
	}

}
