class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data2){
        this.data = data2;
        this.next = null;
    }
}

public class ReversedLL {

    public static Node reverseLL(Node head){
        Node temp = head;
        Node prev = null;

        // we are reversing the pointer from fwd to bwd 2 -> 3 to  1 <- 2
        while(temp != null){

            // before reversing <- , I need to remember the next node i.e '3'
            // so first, we preserve next node in 'front'
            Node front = temp.next;

            // next, we reverse the pointer to prev i.e 1 <- 2
            temp.next = prev;

            // to move fwd, we preserve prev first
            prev = temp;
            // later I moved temp to fwd 2 -> 3(temp)
            temp = front;
        }
        return prev;
    }

    public static void printList(Node head) {
        Node current = head; // Start from the head
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // Indicate the end of the list
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        Node head = null; // Initialize head of the linked list

        // Construct the linked list from the array
        for (int i = arr.length - 1; i >= 0; i--) {
            head = new Node(arr[i], head); // Create a new node and link to head
        }

        // Print the original linked list
        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list
        head = reverseLL(head);

        // Print the reversed linked list
        System.out.println("Reversed Linked List:");
        printList(head);
    }   
    
    
}
