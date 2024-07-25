class doublyList{

    class Node{

        int data;
        Node lptr;
        Node rptr;

        public Node(int data){
            this.data=data;
            this.lptr=null;
            this.rptr=null;
        }
       
    }
    Node First=null;
    Node last=null;
    public void insertAtFirst(int data){
        Node newNode=new Node(data);
        if(First==null){
            First=newNode;
            last=newNode;            
            return;
        }
        newNode.rptr=First;
        First.lptr=newNode;
        First=newNode;
    }

    public void insertAtLast(int data){
        Node newNode=new Node(data);
        if(First==null){
            First=newNode;
            last=newNode;            
            return;
        }
        newNode.lptr=last;
        last.rptr=newNode;
        last=newNode;

    }

    public void insertAtOrder(int data){
        Node newNode=new Node(data);
        if(First==null){
            First=newNode;
            last=newNode;
            return;
        }
        if(data<=First.data){
           insertAtFirst(data);
            return;
        }
        Node temp=First;
        while(temp.rptr!=null && temp.rptr.data<data){
            temp=temp.rptr;
        }
        if(temp.rptr==null){          
            insertAtLast(data);
            return;
        }
        newNode.lptr=temp;
        newNode.rptr=temp.rptr;
        temp.rptr=newNode;
        temp.rptr.lptr=newNode;
    }

    public void display(){
        if(First==null){
            System.out.println("Your list is Empty!!");
            return;
        }
        Node temp=First;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.rptr;
        }
    }

    public void delete(int data){ 
        if(last.data==data){
            last.lptr.rptr=null;
            last=last.rptr;
            return;
        }
        if(First.data==data){
            First.rptr.lptr=null;
            First=First.rptr;
            return;
        }
        Node temp=First;
        
        while(temp.rptr!=null && temp.rptr.data!=data){
            temp=temp.rptr;
        }
        if(temp.rptr==null){
            System.out.println("Your Data is not present in list");
            return;
        }
        temp.rptr=temp.rptr.rptr;
        temp.rptr.lptr=temp;
        
    }
    boolean flag=false;
    public void deleteAlt(){
        Node temp=First;
        while (temp!=null) {
            if(flag==false){
                flag=true;
            }else{
                this.delete(temp.data);
                flag=false;
            }
            temp=temp.rptr;
        }
    }
}
public class list{
    public static void main(String[] args) {
        doublyList a=new doublyList();
        a.insertAtOrder(10);
        a.insertAtOrder(20);
        a.insertAtOrder(30);
        a.insertAtOrder(40);
        a.insertAtOrder(50);
        a.insertAtOrder(60);
        a.insertAtOrder(70);
        
        a.deleteAlt();

        a.display();

    }
}