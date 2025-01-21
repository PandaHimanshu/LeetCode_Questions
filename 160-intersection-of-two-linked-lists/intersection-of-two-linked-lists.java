/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA=0;
        int lengthB=0;
        ListNode temp1=headA;
        ListNode temp2=headB;
        if(temp1==null || temp2==null){
            return null;
        }
        while(temp1 != null){
            lengthA++;
            temp1=temp1.next;
        }
        while(temp2 != null){
            lengthB++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;

        if(lengthA>lengthB){
            int diff=lengthA-lengthB;
            while(diff-- > 0){
                temp1=temp1.next;
            }
        }else if(lengthB>lengthA){
            int diff=lengthB-lengthA;
            while(diff-- > 0){
                temp2=temp2.next;
            }
        }

        while(temp1 != temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }
}