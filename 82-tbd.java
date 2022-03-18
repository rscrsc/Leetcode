/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode preLast = new ListNode(-101, head), last = head;
        while(last.next != null){
            while(last.next.val == preLast.next.val){
                last = last.next;
            }
            if(preLast.next != last){
                preLast.next = last.next;
            }
            preLast = last;
        }
        return head;
    }
}
