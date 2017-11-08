/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode reverseBetween(ListNode a, int m, int n) {
	    ListNode reverse = null, prev = null, first = null, placeholder=a;
	    int i = 0;
	    for( i = 1; i < m;i++){
	        prev = a;
	        a = a.next;
	    }
	    first = a;
	    for(;i<=n;i++){
	        ListNode tmp = a.next;
	        a.next = reverse;
	        reverse = a;
	        a = tmp;
	    }
	    if(prev != null)
	    prev.next = reverse;
	    first.next = a;
	    if(m == 1)return reverse;
	    return placeholder;
	}
}
