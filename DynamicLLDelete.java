

public class DynamicLLDelete <AK> {
    Node head;
    private int size=0;

    public int size(){
        return this.size;
    }
    
    class Node{
        AK data; 
        Node next;

        Node(AK data){
            this.data = data;
            next = null;
        }
    }

    //Add item, no index number requered
    public void add(AK data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            size++;
            return;
        }

        //Same as add last item
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        size++;
        currNode.next = newNode;
    }

    //Add items at any position (index number requered)
    public void add(int i, AK data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            size++;
            return;
        }

        
        if(i==0){
            newNode.next = head;
            head = newNode;
            size++;
        }
        else{
            Node currNode = head;

            for(int j=0; j<i-1; j++){
                currNode= currNode.next;
            }
            newNode.next = currNode.next;
            currNode.next = newNode;
            size++;
        }
    }


    //Deleting function/method
    public void deleteFirst(){
        if(head == null){
            System.out.println("The is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("The is empty");
            return;
        }
        
        //if only one item exist then
        if(head.next == null){
            head = null;
            size--;
        }

        Node lastNode = head.next; //2nd node as last element
        Node secondLast = head; //1st node

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        size--;
    }

    //Delete from anywhere
    public void delete(){
        size--;
        deleteLast();
    }
    public void delete(int i){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        if(i==0){
            size--;
            deleteFirst();
        }
        else{
            size--;
            Node prevNode = head;
            Node afterNode = head.next; // next node of deleted node

            for(int j=0; j<i-1; j++){
                prevNode = prevNode.next;
                afterNode= afterNode.next;
            }
            prevNode.next = afterNode.next;
        
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

    // main 
    public static void main(String[] args) {
        DynamicLLDelete<Integer> list = new DynamicLLDelete<>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(10);
        list.add(11);
        list.add(81);

        list.add(0, 4);

        list.printLL();
        System.out.println("Size of the link list is: " +list.size());

        list.deleteFirst();
        list.printLL();
        System.out.println("Size of the link list is: " +list.size());
        list.deleteLast();
        list.printLL();
        System.out.println("Size of the link list is: " +list.size());
   

        list.delete();
        list.printLL();

        list.delete(2);
        list.printLL();
    }

}
