public class DynamicLLAdd<AK> {//T used for generic data type / you can create any type of Link List
    Node head; //Node can store 2 value. 1) value 2) address of next node

    class Node {
        AK data;
        Node next;

        Node(AK data) {
            this.data = data;
            this.next = null;
        }
    }

    // Adding data at first position
    public void addFirst(AK data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Adding data at the last position
    public void addLast(AK data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Adding at any index position
    public void add(int i, AK data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        
        if (i == 0) {
            newNode.next = head;
            head = newNode;
        } 
        else {
            Node currNode = head;
            for (int j = 0; j < i - 1; j++) {
                currNode = currNode.next;
            }

            newNode.next = currNode.next;
            currNode.next = newNode;
        }
    }

    // Printing the link list
    public void printLL() {
        if (head == null) {
            System.out.println("The list is empty !");
            return;
        }

        // using the head we will traverse all the node of the list
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    // main function
    public static void main(String[] args) {
        DynamicLLAdd<String> list = new DynamicLLAdd<>();

        list.addFirst("Abdullah ");
        list.printLL();
        list.addFirst("AK ");
        list.addLast("Khan ");

        list.printLL();

        list.add(0, "No ");
        list.add(1, "1 ");

        list.printLL();
    }

}
