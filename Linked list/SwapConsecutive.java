class List {
    class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public Node First = null;

    public void Insert(int data) {
        Node newNode = new Node(data);

        if (First == null) {
            First = newNode;
            return;
        }

        Node temp = First;
        First = newNode;
        First.link = temp;

    }

    public void display() {
        Node temp = First;
        
        while (temp!=null) {
            System.out.print(temp.data + "->");
           
            temp = temp.link;
        }

    }

    public void swapConsecutive() {
        
       
    }

}

public class SwapConsecutive {
    public static void main(String[] args) {
        List n1 = new List();
        n1.Insert(20);
        n1.Insert(30);
        n1.Insert(40);
        n1.Insert(50);
        n1.Insert(60);
        n1.swapConsecutive();
      
    }
}