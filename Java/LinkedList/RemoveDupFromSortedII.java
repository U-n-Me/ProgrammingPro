/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode deleteDuplicates(ListNode a) {
	    if(a == null || a.next == null)return a;
	    ListNode head = null, last = null;
	    while(a != null){
	        int val = a.val;
	        if(a.next == null || val != a.next.val){
	            if(head == null){
	                head = a;
	                last = head;
	            }
	            else {
	                last.next = a;
	               last =a;
	            }
	            a = a.next;
	        }
	        else
	            while(a != null && a.val == val)a = a.next;
	    }
	    if(last != null)
	    last.next = null;
	    return head;
	}
}
