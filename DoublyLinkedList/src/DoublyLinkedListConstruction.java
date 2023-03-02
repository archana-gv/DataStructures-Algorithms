
public class DoublyLinkedListConstruction {
    public static <LinkedListNode> void main(String[] args) {


    }

    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            if(this.head == null){
                this.head = node;
                this.tail = node;
                return;
            }
            insertBefore(this.head, node);
        }

        public void setTail(Node node) {
            if(this.tail == null){
                this.tail = node;
                this.head = node;
                return;
            }
            insertAfter(this.tail,node);
        }

        public void insertBefore(Node node, Node nodeToInsert) {
            if(nodeToInsert == this.head && nodeToInsert == this.tail)return;
            remove(nodeToInsert);
            nodeToInsert.prev = node.prev;
            nodeToInsert.next = node;
            if(node.prev == null){
                this.head = nodeToInsert;
            }else{
                node.prev.next = nodeToInsert;
            }
            node.prev = nodeToInsert;
        }

        public void insertAfter(Node node, Node nodeToInsert) {
            if(nodeToInsert == this.head && nodeToInsert == this.tail) return;
            remove(nodeToInsert);
            nodeToInsert.prev = node;
            nodeToInsert.next = node.next;
            if(node.next == null){
                this.tail = nodeToInsert;
            }
            else {
                node.next.prev = nodeToInsert;
            }
            node.next = nodeToInsert;
        }

        public void insertAtPosition(int position, Node nodeToInsert) {
            if(position ==1){
                setHead(nodeToInsert);
                return;
            }
            Node node = head;
            int currentPosition = 1;
            while (node!= null && currentPosition++ != position) node = node.next;
            if(node != null){
                insertBefore(node, nodeToInsert);
            }
            else {
                setTail(nodeToInsert);
            }
        }

        public void removeNodesWithValue(int value) {
            Node currentNode = this.head;
            while (currentNode != null){
                Node nodeToRemove = currentNode;
                currentNode = currentNode.next;
                if(nodeToRemove.value == value) remove(nodeToRemove);
            }
        }

        public void remove(Node node) {
            if(node == this.head) this.head = this.head.next;
            if(node == this.tail) this.tail = this.tail.prev;
            if(node.prev != null) node.prev.next = node.next;
            if(node.next != null) node.next.prev = node.prev;
            node.next = null;
            node.prev = null;
        }

        public boolean containsNodeWithValue(int value) {
            Node currentNode = this.head;
            while (currentNode != null){
                if(currentNode.value == value) return true;
                else currentNode = currentNode.next;
            }
            return false;
        }
    }

    // Do not edit the class below.
    static class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}