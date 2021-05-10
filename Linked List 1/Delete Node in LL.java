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

	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		//Your code goes here
        int length=length(head);
        if(pos>=length){
            return head;
        }
        if(pos==0){
            return head.next;
        }
        int i=0;
        LinkedListNode<Integer> temp=head;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
	}
}