package ArrayList.copy;

public class MyArrayList {

	private Object[] data;
	private int size;
	public MyArrayList() {
		data=new Object[10];
		size=0;
	}
	
	public void ensurecapacty() {
		
		if(size==data.length) {
			
			int newsize = data.length*2;
			
			Object[] newArray = new Object[newsize];
			
			for(int i=0;i<size;i++) {
				newArray[i]=data[i];
			}
			
			data=newArray;
		}
	}
	
	public void add(Object Element) {
		
		ensurecapacty();
		
		data[size++]=Element;
		
	}
	
	public Object get(int index) {
		
		if(index<0||index>=size) {
			throw new IndexOutOfBoundsException("Index :"+index);
		}
		
		ensurecapacty();
		
		return data[index];
	}
	
	public Object remove(int index) {
		
		if(index<0||index>=size) {
			throw new IndexOutOfBoundsException("Index :"+index);
		}
		
		Object remove = data[index];
		for(int i=index;i<size-1;i++) {
			data[i]=data[i+1];
		}
		size--;
		return remove;
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		
		StringBuffer s = new StringBuffer();
		for(int i=0;i<size;i++) {
			
			if(i==0) {
				s.append('[');
			}
			s.append(data[i]+", ");
			if(i==size-1) {
				s.append(']');
			}
		}
		
		return new String(s);
	}
	
	public static void main(String[] args) {
		
		 MyArrayList bag = new MyArrayList();
		 bag.add(10);
		 bag.add(20);
		 bag.add(30);
		 bag.add(40);
		 bag.add(50);
		 bag.add(60);
		 System.out.println(bag);
		 bag.remove(2);
		 System.out.println(bag);
	}
	
	

}

