
public class LLAdd <T>{//T used for generic data type / you can create any type of Link List
    Node head;

    class Node{
        T data; 
        Node next;
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    //Add item at first position 
    void addFirst(T data){
        Node newNode = new Node(data);
        //Checking if the link list is empty or not
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //Add item at last the end of the link list
    void addLast(T data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        //Adding the element at last postion
        currentNode.next = newNode;
    }

    //Printing the link list
    void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        // System.out.println("Null");
        System.out.println("");
    }


    //main 
    public static void main(String[] args) {
        LLAdd<String> list = new LLAdd<>();
        list.addFirst("bk");
        list.addFirst("ak");
        list.printList();

        list.addLast("ck");
        list.printList();

        LLAdd<Integer> inList = new LLAdd<>();
        inList.addLast(5);
        inList.addLast(6);
        inList.addLast(7);
        inList.printList();
        

        
    }
}
