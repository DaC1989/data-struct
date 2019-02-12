package com.dzt.link;

/**
 * 单链表的反转
 * 链表中环的检测
 * 两个有序的链表的合并
 * 删除链表倒数第n个节点
 * 求链表的中间节点
 * @param <T>
 */
public class Linked<T> {
	
	private Node<T> first;
	
	private Node<T> last;
	
	private int size = 0;
	
	/**
	 * 添加链表元素
	 * @param t
	 */
	public void add(T t) {
		Node<T> node = new Node<>(t);
		if(first == null) {
			first = node;
			last = node;
		} else {
			last.setNext(node);
			last = node;
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
		return null;
	}
	
	private class Node<T> {
		T t;

		Node<T> next;

		Node(T t) {
			this.t = t;
		}
		void setNext(Node<T> next) {
			this.next = next;
		};
	}

}
