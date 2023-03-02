import java.util.LinkedList;

public class RemoveDuplicatesFromLinkedList {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList(1);
        LinkedList l2 = new LinkedList(1);
        LinkedList l3 = new LinkedList(3);
        LinkedList l4 = new LinkedList(4);
        LinkedList l5 = new LinkedList(4);
        LinkedList l6 = new LinkedList(4);
        LinkedList l7 = new LinkedList(5);
        LinkedList l8 = new LinkedList(6);
        LinkedList l9 = new LinkedList(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = l9;
        l9.next = null;

        LinkedList result = removeDuplicatesFromLinkedList(l1);

      while (result != null){
          System.out.println(result.value);
          result = result.next;
      }

    }

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }


    }

    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {

        LinkedList currentNode = linkedList;

        while (currentNode != null) {
            LinkedList nextDistinctNode = currentNode.next;

            while (nextDistinctNode != null && currentNode.value == nextDistinctNode.value){
                nextDistinctNode = nextDistinctNode.next;
            }
            currentNode.next = nextDistinctNode;
            currentNode = nextDistinctNode;
        }
        return linkedList;
    }
}
