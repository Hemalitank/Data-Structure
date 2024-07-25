public class p_63{
        class node{
            int info;
            node link;
            int field;
            node PTR;
        
            public void node(int data){
                this.info=data;
                this.link=null;

            }
            public node first=null,begin=null,top=null,save=null,prev=null;
                public void nextNode(int n){
                    node newNode=new node();
                     if(first==null){
                        return;
                     }
                     else{
                        top=newNode;
                        top.link=top;
                        newNode.field=first.info;
                        begin=newNode;
                     }
                     save=first;
                     while (save.link!=null) {
                        prev=newNode;
                        save=save.link;
                        
                     }
                }
                public void copy(){
                    node newNode=new node();
                    if(first==null){
                        return;
                        }
                        else{
                             top=newNode;
                             top.link=top;
                             newNode.field=save.info;
                             prev.PTR=newNode;
                   }
                   newNode.PTR=null;
                   return;
        }
}