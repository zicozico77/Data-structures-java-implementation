package dataStructures;

import java.util.ArrayList;
import java.util.List;


/**
 * A generic implementation of a Queue
 * @author diego
 *
 */
public class Queue {
	
	private List queue;
	
	public Queue(){
		queue = new ArrayList<>();
	}
	
	public void push(Object input){
		queue.add(0, input);
	}
	
	public Object pop(){
		if (queue.isEmpty()){
			return null;
		}
		return queue.remove(queue.size()-1);
	}
	
	public Object peek(){
		return queue.get(0);
	}
	
	public String toString(){
		String result = "[ ";
		for(Object s: queue){
			result += s.toString() + " ";
		}
		result += "]";
		return result;
	}
}
