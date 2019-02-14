package com.dzt.link;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
	
	 public static void main(String[] args) {
    	Solution s = new Solution();
    	ListNode l1 = new ListNode(2);
    	l1.next = new ListNode(4);
    	l1.next.next = new ListNode(5);
    	ListNode l2 = new ListNode(5);
    	l2.next = new ListNode(6);
    	l2.next.next = new ListNode(4);
    	ListNode list = s.addTwoNumbers(l1, l2);
    	System.out.print(list.val);
    	while(list.next != null) {
    		list = list.next;
    		System.out.print(list.val);
    	}
	}
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode first = list;
        int index = 0;
        while(l1 != null || l2 != null) {
            if(list.next == null && index > 0) {
            	list.next = new ListNode(0);
            	list = list.next;
            } else if(index > 0) {
            	list = list.next;
            }
            if(l1 != null) {
                list.val += l1.val;
                l1 = l1.next;
            }     
            if(l2 != null) {
                list.val += l2.val;
                l2 = l2.next;
            } 
            int t = list.val - 10;
            if(t >= 0) {
                list.val = t;
                list.next = new ListNode(1);
            } 
            index++;
        }
        return first;
    }
   
}