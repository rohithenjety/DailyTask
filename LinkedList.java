class Node{
    int value;
    Node next;
public Node(int value){
   this.value=value;
}
public Node(int value, Node next) {
    this.value = value;
    this.next = next;
}
 
}
public class LinkedList {
  Node head;
  Node temp;
  public void insertNode(int value){
     Node node=new Node(value);
     node.next=head;
     head=node;
  }

  public void insertNodeLast(int value){
    
    Node node=new Node(value);
    if(head==null){
        head=node;
        return;
    }
    Node temp=head;
    while(temp.next !=null){
    temp=temp.next;
   }
    temp.next=node;  
 }

   public void insertany(int index, int  value){
    Node temp=head;
    Node newNode=new Node(value);

    int  i=0;
    while(temp!=null && i< index-1){
      temp=temp.next;
      i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
   }

   public void deletefirst(){
   int  value=head.value;
    head=head.next;
   System.out.println(value+" ");
   }

   public void deletelast(){
    Node temp=head;
    while(temp.next.next != null){
      temp=temp.next;
    }
    temp.next=null;
   }

   public void deleteany(int index){
    int i=0;
    Node temp =head;
    while(temp !=null && i <index-1){
      temp=temp.next;
      i++;
    }
    System.out.println(temp.next.value+" ");
    temp.next=temp.next.next;
   }


  public void display(){
    Node temp=head;
    while(temp.next !=null){
        System.out.print(temp.value+"-->");
      temp=temp.next;
    }
    System.out.println(temp.value);
    
  }


public static void main(String[] args) {
    LinkedList l=new LinkedList();
    // l.insertNode(7);
   for(int i=0;i<10;i++){
    l.insertNodeLast(i);
   }
   l.insertany(1,17);
   l.insertany(4, 33);
    l.display();
    // l.deletefirst();
    // l.deletelast();
    l.deleteany(5);
    l.display();
    
}
}