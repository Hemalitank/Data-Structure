class Node {
    int info;
    Node link;

    Node(int data) {
        this.info = data;
        this.link = null;
    }
}

class LinkedList {
   public Node first=null;
    // Method to append a node to the end of the linked list
    void append(int value) {
        Node new_node = new Node(value);
        if (first == null) {
            first = new_node;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
    }

    // Method to print the linked list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to copy the linked list
    LinkedList copy() {
        if (first == null) {
            return null;
        }

        LinkedList copiedList = new LinkedList();
        Node originalCurrent = first;
        Node copiedCurrent = null;

        while (originalCurrent != null) {
            Node newNode = new Node(originalCurrent.info);

            if (copiedCurrent == null) {
                copiedList.first = newNode;
                copiedCurrent = copiedList.first;
            } else {
                copiedCurrent.link = newNode;
                copiedCurrent = copiedCurrent.link;
            }

            originalCurrent = originalCurrent.link;
        }

        return copiedList;
    }

    public static void main(String[] args) {
        // Create a sample linked list
        LinkedList originalList = new LinkedList();
        originalList.append(1);
        originalList.append(2);
        originalList.append(3);
        originalList.append(4);

        // Print the original linked list
        System.out.println("Original linked list:");
        originalList.printList();

        // Copy the original linked list
        LinkedList copiedList = originalList.copy();

        // Print the copied linked list
        System.out.println("Copied linked list:");
        copiedList.printList();
    }
}

         
