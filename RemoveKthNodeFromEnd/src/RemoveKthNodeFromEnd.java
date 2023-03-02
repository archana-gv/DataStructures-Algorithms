public class RemoveKthNodeFromEnd {
    public static void main(String[] args) {

        LinkedList node1 = new LinkedList(0);
        LinkedList node2 = new LinkedList(1);
        LinkedList node3 = new LinkedList(2);
        LinkedList node4 = new LinkedList(3);
        LinkedList node5 = new LinkedList(4);
        LinkedList node6 = new LinkedList(5);
        LinkedList node7 = new LinkedList(6);
        LinkedList node8 = new LinkedList(7);
        LinkedList node9 = new LinkedList(8);
        LinkedList node10 = new LinkedList(9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;

       removeKthNodeFromEnd(node1,4);

       while (node1.next!= null){
           System.out.println(node1.value);
           node1 = node1.next;
       }

    }

    public static void removeKthNodeFromEnd(LinkedList head, int k) {

        LinkedList first = head;
        LinkedList second = head;
        int count = 1;
        while (count <= k){
            second = second.next;
            count++;
        }
        if(second == null){
            head.value = head.next.value;
            head.next = head.next.next;
        }
        while (second.next != null){
            first = first.next;
            second = second.next;
        }
        first.next = first.next.next;

    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}