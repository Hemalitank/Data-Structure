class Node {

    int data;
    Node link;

    public Node(int data){
        this.data=data;
        this.link=null;
    }
    Node first=null;

    public void Insert(int data){
        Node newNode=new Node(data);

        if(first==null){
            first=newNode;
        }

        Node temp=first;
        first=newNode;
        newNode.link=temp;

    }

    public void display(){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data);
        }
    }
}
public class InsertAtFirst {
    public static void main(String[] args) {

        Node n1=new Node(10);
        n1.Insert(20);
        n1.Insert(30);
        n1.display();

    }
}
