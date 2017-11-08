/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        if(A == null || A.next == null)return 1;
        ListNode fast = A, slow = A;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            if(fast != null)
                slow = slow.next;
        }
        fast = slow.next;
        slow.next = null;
        // now reverse fast
        ListNode reverse = null;
        while(fast != null){
            ListNode tmp = fast.next;
            fast.next = reverse;
            reverse = fast;
            fast = tmp;
        }
        // now check, if equal
        while(A != null && reverse != null){
            if(A.val != reverse.val)
                return 0;
            A = A.next;
            reverse = reverse.next;
        }
        return 1;
    }
}
