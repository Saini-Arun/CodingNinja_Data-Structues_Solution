public class Solution {

	public static void printReverse(LinkedListNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
        LinkedListNode<Integer> newHead=root.next;
        printReverse(newHead);
        System.out.print(root.data+" ");
	}

}