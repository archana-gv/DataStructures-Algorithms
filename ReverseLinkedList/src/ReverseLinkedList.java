public class ReverseLinkedList {
    public static void main(String[] args) {

        LinkedList node1 = new LinkedList(0);
        LinkedList node2 = new LinkedList(1);
        LinkedList node3 = new LinkedList(2);
        LinkedList node4 = new LinkedList(3);
        LinkedList node5 = new LinkedList(4);
        LinkedList node6 = new LinkedList(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        LinkedList result = reverseLinkedList(node1);

        while (result != null){
            System.out.println(result.value);
            result = result.next;
        }
    }

    public static LinkedList reverseLinkedList(LinkedList head) {

        LinkedList previousNode = null;
        LinkedList currentNode = head;

        while (currentNode != null){
            LinkedList nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;

    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}