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
         ListNode dummy=new ListNode(0);
        ListNode dp=dummy;
        int sum=0;
        int c=0;
        
      while(l1!=null||l2!=null||c!=0)

      {
        sum=c;
        if(l1!=null)
        {
            sum+=l1.val;
            l1=l1.next;
        }
        if(l2!=null)
        {
            sum+=l2.val;
            l2=l2.next;
        }

        int num=sum%10;
         c=sum/10;
        dp.next=new ListNode(num);
        dp=dp.next;
      }
  return dummy.next;
        
    }
}