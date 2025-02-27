package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericStack<T> {

	private ArrayList<T> arrayList;
	
	public GenericStack() {
		arrayList = new ArrayList<T>();
	}
	
	public GenericStack(T[] array) {
		this();
		arrayList.addAll(Arrays.asList(array));
	}
	
	public GenericStack(List<T> inList) {
		this();
		arrayList.addAll(inList);
	}
	
	public void push(T e) {
		arrayList.add(e);
	}
	
	public T pop() {
		if (arrayList.size() > 0) {
			return arrayList.remove(arrayList.size()-1);
		} else {
			return null;
		}
	}
	
	public T peek() {
		if (arrayList.size() > 0) {
			return arrayList.get(arrayList.size()-1);
		} else {
			return null;
		}
	}
	
	public int size() {
		return arrayList.size();
	}
	
	public static void main(String[] args) {
		GenericStack<String> myStringStack = new GenericStack<>();
		myStringStack.push("Hello");
		myStringStack.push("Goodbye");
		
		String s = myStringStack.pop();
	}
}
