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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    
    {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode track1 = list1;
        ListNode track2 = list2;
        while(track1!=null && track2!=null)
        {
            if(track1.val<=track2.val)
            {
                tail.next = track1;
                track1 = track1.next;
            }
            else{
                tail.next = track2;
                track2 = track2.next;
            }
            tail = tail.next;
        }
        if(track1!=null)
        tail.next = track1;

        else
        tail.next = track2;


        return dummy.next;           
        
    }
}