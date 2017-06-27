package dataStructures;

import dataStructures.LinkedList.Node;

public class DoubleLinkedList {
	
	private Node start;
	private Node last;

	public class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int data) {
			this.data = data;
		}

		public boolean equals(Node other) {
			return other.data == this.data && other.next == this.next && other.prev == this.prev;
		}

		public String toString() {
			return "Node: " + data;
		}

	}

	public DoubleLinkedList(int start, int last) {
		this.start = new Node(start);
		this.last = new Node(last);
		this.start.next = this.last;
		this.last.prev = this.start;
	}
	
	/**
	 * Insert an element at the beginning of the double linked list
	 * @param data
	 */
	public void insert(int data){
		Node temp = new Node(data);
		temp.next = start;
		start.prev = temp;
		start = temp;
	}
	
	/**
	 * Insert an element at the end of the double linked list
	 * @param data
	 */
	public void insertLast(int data){
		Node temp = new Node(data);
		temp.prev = last;
		last.next = temp;
		last = temp;
	}
	
	/**
	 * Deletes first element of the double linked list
	 */
	public void deleteFirst(){
		if(start.next == null){
			start = null;
			return;
		}
		else {
			start = start.next;
			start.prev = null;
		}
	}
	
	/**
	 * Deletes last element of the double linked list
	 */
	public void deleteLast(){
		if(last.prev == null){
			last = null;
			return;
		}
		else {
			last = last.prev;
			last.next = null;
		}
	}
	
	/**
	 * Searches for a number in the double linked list
	 * @param data
	 * @return
	 */
	public Node search(int data){
		Node loop = start; 
		while(loop.data != data){
			if(loop.next != null){
				loop = loop.next;
			} else {
				return null;
			}
		}
		return loop;
	}
	
	/**
	 * Inserts an element after an index
	 * @param input
	 */
	public void insertNext(int input, Node index){
		Node i = this.search(index.data);
		if(i.equals(null)){
			return;
		}
		if(i.next.equals(null)){
			i.next = new Node(input);
			i.next.prev = i;
		} else {
			i.next.data = input;
		}
	}
	
	/**
	 * deletes a specific number from the Double linked list
	 * @param data
	 */
	public void delete(int input){
		Node toDelete = this.search(input);
		Node prev = toDelete.prev;
		Node next = toDelete.next;
		if (prev != null){
			prev.next = next;
		}
		if(next != null){
			next.prev = prev;
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
