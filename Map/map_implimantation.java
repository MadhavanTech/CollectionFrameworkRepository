package Map_Implimantation_class;

import java.util.*;

public class map_implimantation<T , T1> {

	
	private List<T> keys = new ArrayList<T>();
	
	private List<T1> values = new ArrayList<T1>();
	
	int top =-1;

	
	public void add(T key,T1 value) {
		
		
		if(keys.contains(key)) {
			
			int index = keys.indexOf(key);
			
			values.set(index, value);
			
		}else {
			
			keys.add(key);
			values.add(value);
		}
		
		
	}
	
	
	public T1 get(T key) {
		
		int index = keys.indexOf(key);
		
		if(index != -1) {
			
			return values.get(index);
		}
		
		return null;
		
	}
	
	public Set<T> getKey() {
		
		return new HashSet<>(keys);
	}
	
	public List<T1> getValue(){
		
		return values;
	}
	
	
	public String toString() {
		
		
		StringBuffer a = new StringBuffer();
		
		a.append('{');
		
		for(int i=0;i<keys.size();i++) {
			
			a.append(keys.get(i)+" ,");
			a.append(values.get(i)+" ,");
		}
		
		a.append('}');
		
		return new String(a);
	}
	
	public static void main(String[] args) {
		
		map_implimantation<Integer,String> map = new map_implimantation<Integer, String>();
		
		map.add(1, "maddy");
		map.add(2, "shakthi");
		map.add(3, "madhvan");
		
		System.out.println(map);
			
	}
	
	
}
