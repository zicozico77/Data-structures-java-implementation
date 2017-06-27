package dataStructures;

public class LinkedList {
	
	private Node start;
	
	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
		
		public boolean equals(Node other){
			return other.data == this.data && other.next == this.next; 
		}
		
		public String toString(){
			return "Node: " + data;
		}

	}
	
	/**
	 * Constructs a new linked list that takes an int as the parameter for the first element
	 * @param root
	 */
	public LinkedList(int root){
		start = new Node(root);
	}
	
	/**
	 * Insert an element at the beginning of the list
	 * @param data
	 */
	public void insert(int data){
		Node temp = new Node(data);
		temp.next = start;
		start = temp;
	}
	
	/**
	 * Deletes first element of the list
	 */
	public void deleteFirst(){
		if(start.next == null){
			start = null;
			return;
		}
		else {
			start = start.next;
		}
	}
	
	/**
	 * Searches for a number in the list
	 * @param data
	 * @return
	 */
	public Node search(int data){
		Node result = start; 
		while(result.data != data){
			if(result.next != null){
				result = result.next;
			} else {
				return null;
			}
		}
		return result;
	}
	
	/**
	 * deletes a specific number from the list
	 * @param data
	 */
	public void delete(Node input){
		Node temp = start; 
		Node prev = null;
		while(!temp.equals(input)){
			prev = temp;
			if(temp.next != null){
				temp = temp.next;
			} else {
				return;
			}
		}
		if (prev == null){
			deleteFirst();
			return;
		}
		if(temp.next != null){
			prev.next = temp.next;
		} else {
			prev.next = null;
		}
	}
	
	public String toString(){
		String result = "";
		Node temp = start;
		while(true){
			result += temp.toString() + " ";
			if(temp.next!= null){
				temp = temp.next;
			} else {
				return result;
			}
		}
	}
}
