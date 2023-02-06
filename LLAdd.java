
public class LLAdd {
    Node head;

    class Node{
        String data; 
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    //Add item at first position 
    void addFirst(String data){
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
    void addLast(String data){
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

        System.out.println("Null");
    }


    //main 
    public static void main(String[] args) {
        LLAdd list = new LLAdd();
        list.addFirst("bk");
        list.addFirst("ak");
        list.printList();

        list.addLast("ck");
        list.printList();

        
    }
}
