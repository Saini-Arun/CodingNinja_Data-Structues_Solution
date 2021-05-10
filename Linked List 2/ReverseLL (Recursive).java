public class Solution {
	
	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> newHead=head;
            if(head==null || head.next==null){
                newHead = head;
                return newHead;
        }
        LinkedListNode<Integer> ans=reverseLinkedListRec(head.next);//once you got the head of the reverse link list just go to the last node
        LinkedListNode<Integer> temp=ans;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=head; //attach the head to the last node
        head.next=null;//make last node point to null 
        return ans; //return the head of the reversed link list
	}
}