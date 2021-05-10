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

	public static int findNode(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        LinkedListNode<Integer> temp = head;
        int length=length(head);
        int i=0;
        
        while(i<length){
            if(temp.data==n){
                return i;
            }
            temp=temp.next;
            i++;
        }
        
        return -1;
	}
}