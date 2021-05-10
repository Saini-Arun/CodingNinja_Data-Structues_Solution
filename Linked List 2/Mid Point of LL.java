public class Solution {
	public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        LinkedListNode<Integer> ans = head;
        if(head==null){
            return null;
        }
        if(slow.next==null){
            return slow;
        }
        while(fast != null){
            if(fast.next == null){
                return slow;
            }
            ans=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return ans;
    }
}