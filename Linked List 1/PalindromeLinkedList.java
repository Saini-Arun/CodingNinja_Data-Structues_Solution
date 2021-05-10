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
    
    	public static LinkedListNode<Integer> ReverseLinkedList(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> next = null;
		LinkedListNode<Integer> current = head;
	        while (current != null) { 
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	        } 
	        head = prev; 
	        return head;
	}
 

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Your code goes here
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer> head1=head;
        LinkedListNode<Integer> head2=head;
        int length=length(head);
        if(length==0 || length==1){
            return true;
        }
        int i=0;
        while(i<length/2){
            temp=temp.next;
            head2=temp;
            i++;
        }
        head2=ReverseLinkedList(head2);
        i=0;
        while(i<length/2){
            if(head1.data != head2.data){
                return false;
            }
            head1=head1.next;
            head2=head2.next;
            i++;
        }
        return true;
	}

}