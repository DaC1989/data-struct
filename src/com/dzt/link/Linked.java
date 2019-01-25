package com.dzt.link;

public class Linked<T> {
	
	public Linked() {}
	
	private Node<T> first;
	
	private Node<T> last;
	
	private int size;
	
	/**
	 * 添加链表元素
	 * @param t
	 */
	public void add(T t) {
		Node<T> node = new Node<>(t);
		if(first == null) {
			node.setIndex(0);
			first = node;
			last = node;
		} else {
			node.setIndex(last.getIndex() + 1);
			last.setNext(node);
		}
		size++;
	}
	
	/**
	 * 根据下标查找元素
	 * @param index
	 * @return
	 */
	public Node<T> get(int index) {
		if(index < 0) return null;
		return getByIndex(first, index);
	}
	
	private Node<T> getByIndex(Node<T> node, int index) {
		if(node == null) return null;
		if(node.getIndex() == index)
			return node;
		else 
			return getByIndex(node.getNext(), index);
	}
	
	private class Node<T> {
		private T t;
		
		private Node<T> next;
		
		private int index;
		
		public Node(T t) {
			this.t = t;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public int getIndex() {
			return this.index;
		}
		public void setNext(Node<T> next) {
			this.next = next;
		}
		public Node<T> getNext() {
			return this.next;
		}
	}

}
