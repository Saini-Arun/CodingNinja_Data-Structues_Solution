public class Solution {
    
    	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
        LinkedListNode<Integer> temp=head;
        int length=0;
        while(temp !=null){
            temp=temp.next;
            length++;
        }
        return length;
	}
	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int i){
        int length = length(head);
        if(i>=length){
            return head;
        }
        if(i==0){
            if(head.next==null){
                return null;
            }
            else{
            return head.next;
        }
        }
        LinkedListNode<Integer> smallAns = deleteNodeRec(head.next , i-1);
        head.next=smallAns;
        return head;
	}
}