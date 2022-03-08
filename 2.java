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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(), nowAns = ans, nowL1 = l1, nowL2 = l2;
        int isCarry = 0;
        boolean isL1Finish = false, isL2Finish = false;
        while(nowL1.next != null || nowL2.next != null){
            int val1 = nowL1.val, val2 = nowL2.val;
            if(isL1Finish){
                val1 = 0;
            }
            if(isL2Finish){
                val2 = 0;
            }
            nowAns.val = (val1 + val2 + isCarry) % 10;
            isCarry = (val1 + val2 + isCarry) / 10;
            nowAns.next = new ListNode();
            nowAns = nowAns.next;
            if(nowL1.next != null){
                nowL1 = nowL1.next;
            }else{
                isL1Finish = true;
            }
            if(nowL2.next != null){
                nowL2 = nowL2.next;
            }else{
                isL2Finish = true;
            }
        }
        int val1 = nowL1.val, val2 = nowL2.val;
        if(isL1Finish){
            val1 = 0;
        }
        if(isL2Finish){
            val2 = 0;
        }
        nowAns.val = (val1 + val2 + isCarry) % 10;
        isCarry = (val1 + val2 + isCarry) / 10;
        if(isCarry > 0){
            nowAns.next = new ListNode(isCarry);
        }
        return ans;
    }
}