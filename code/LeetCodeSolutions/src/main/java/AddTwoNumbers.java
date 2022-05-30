import java.util.Arrays;
import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode input1 = getLinkedList(Arrays.asList(2,4,3));
        ListNode input2 = getLinkedList(Arrays.asList(5,6,4));
        printListNode(input1);
        printListNode(input2);
        ListNode output = addTwoNumbers(input1,input2);
        printListNode(output);


    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode out = new ListNode(-1);
        ListNode prev = out;
        int carry=0;

        while (l1!=null || l2!=null){
             int val1 = (l1 == null)?0:l1.val;
             int val2 = (l2 == null)?0:l2.val;

             int total = carry + val1+ val2;
             carry = total/10;
             ListNode node = new ListNode(total%10);
             out.next=node;
             out=out.next;
             if (l1!=null) l1= l1.next;
            if (l2!=null) l2= l2.next;

        }
        if (carry >0){
            ListNode node = new ListNode(carry);
            out.next=node;
            out=out.next;
        }
        return prev.next;
    }

    private static void printListNode(ListNode input) {
        System.out.println("\n");
        while (input!=null){
            System.out.print( input.val+ " ");
            input=input.next;
        }
    }

    private static ListNode getLinkedList(List<Integer> asList) {
        ListNode node = new ListNode(-1);
        ListNode prev = node;
         for (int i: asList){
             ListNode val = new ListNode(i);
             node.next = val;
             node = node.next;
         }

        return prev.next;

    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    '}';
        }
    }
}
