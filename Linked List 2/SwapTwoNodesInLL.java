public class Solution {
	public static  LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head,int index1,int index2){
            LinkedListNode<Integer> prev1 = null;
            LinkedListNode<Integer> curr1 = null;
            LinkedListNode<Integer> prev2 = null;
            LinkedListNode<Integer> curr2 = null;
            LinkedListNode<Integer> temp = head;
        
        if(index1 == 0 && index2-index1==1){
              
            head=temp.next;
            LinkedListNode<Integer> temp2 = head.next;
            head.next=temp;
            temp.next=temp2;
            return head;
            
        }
        //added this similar to the above condition
        //but as specified that index1 can be greater than index2 also 
        // so check this
        else if(index2 == 0 && index1-index2==1){
              
            head=temp.next;
            LinkedListNode<Integer> temp2 = head.next;
            head.next=temp;
            temp.next=temp2;
            return head;
            
        }
         else if(index1 == 0 || index2 == 0){
           LinkedListNode<Integer> temp2=head.next;
            for(int i=0;i<index2;i++){
            prev2 = temp;
            temp = temp.next;
            curr2 = temp;
        }
            head.next=curr2.next;
            prev2.next=head;
            curr2.next=temp2;
            head = curr2;
            return head;
        }
        
        else{
            
        for(int i=0;i<index1;i++){
            prev1 = temp;
            temp = temp.next;
            curr1 = temp;
        }
        temp = head;
        for(int i=0;i<index2;i++){
            prev2 = temp;
            temp = temp.next;
            curr2 = temp;
        }
        
        prev1.next=curr2;
        prev2.next=curr1;
        LinkedListNode<Integer> temp2=curr1.next;
        curr1.next=curr2.next;
        curr2.next=temp2;
        
        
        return head;
        }
		
	}
}