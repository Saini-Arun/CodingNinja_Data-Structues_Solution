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
    

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		//Your code goes here
        LinkedListNode<Integer> temp=head;
        int length=length(head);
        int i=0;
        while(i<length-1){
            if((temp.data).equals(temp.next.data)){
                temp.next=temp.next.next;
                i++;
            }
            else{
                temp=temp.next;
                i++;
            }
        }
        
       return head; 
	}
   
}