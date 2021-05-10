public class Solution {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here0
                LinkedListNode<Integer> temp=head;
        int length=0;
        while(temp !=null){
            if(length==i){
                System.out.println(temp.data);
            }
            temp=temp.next;            
            length++;
        }
	}
}