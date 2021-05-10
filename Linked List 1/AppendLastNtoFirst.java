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
    
    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        
        LinkedListNode<Integer> initialHead=head;
	    LinkedListNode<Integer> temp=head;
        int length=length(head);
        if(n<=0 || n>length){
            return head;
        }
        int i=0;
        while(i<length-1){
            if(i==(length-n)-1){
                
                head=temp.next;
                temp.next=null;
                temp=head;
                i++;
            }
            else{
                temp=temp.next;
                i++;                
            }            
        }
        temp.next=initialHead;
        return head;          
    }    
}