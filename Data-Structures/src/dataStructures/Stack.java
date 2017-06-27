package dataStructures;
import java.util.*;


/**
 * A generic implementation of a Stack
 * @author diego
 *
 */
public class Stack {
	
	private List stack;
	
	public Stack(){
		stack = new ArrayList<>();
	}
	
	public void push(Object input){
		stack.add(0, input);
	}
	
	public Object pop(){
		if (stack.isEmpty()){
			return null;
		}
		return stack.remove(0);
	}
	
	public Object peek(){
		return stack.get(0);
	}
	
	public String toString(){
		String result = "[ ";
		for(Object s: stack){
			result += s.toString() + " ";
		}
		result += "]";
		return result;
	}
}
