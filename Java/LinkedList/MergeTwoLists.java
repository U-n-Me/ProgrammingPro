/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode A, ListNode B) {
	    ListNode head = null, last = null;
        while(A != null && B != null){
            if(A.val < B.val){
                if(head == null){
                    head = A;
                    last = head;
                }else{
                    last.next = A;
                    last = last.next;
                }
                A = A.next;
            }else{
                if(head == null){
                    head = B;
                    last = head;
                }else{
                    last.next = B;
                    last = last.next;
                }
                B = B.next;
            }
        }
        if(A == null)last.next = B;
        else last.next = A;
        return head;
	}
}
