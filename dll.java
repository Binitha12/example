import java.util.*;


public class dll {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
        }}


        Node head=null;
        Node tail=null;

        public void startnode(int data)
        {
            Node newnode=new Node(data);
            if( head==null){
                head=newnode;
                tail=newnode;
                head.prev=null;
                tail.next=null;
                newnode.data=data;
            }
            else{

                head.prev=newnode;
                newnode.next=head;
                newnode.prev=null;
                head=newnode;
                newnode.data=data;
            }
        }
        public void endnode(int data)
        {
            Node newnode=new Node(data);

            if(tail==null)
            {
                tail=newnode;
                head=newnode;
                tail.next=null;
                tail.prev=null;
                newnode.data=data;

            }

            else{
     tail.next=newnode;
     newnode.prev=tail;
     newnode.next=null;
     newnode=tail;
     newnode.data=data;
            }

            }

            public void anynode(int data,int pos)
            { 
                Node newnode=new Node(data);
                Node current=head;
                while(current!=null)
{
  if(current.data==pos)
  {
    newnode.next=current.next;
    
     newnode.prev=current;
     current.next=newnode;
     newnode =current.next.prev;

     newnode.data=data;
  }

}
            }



public void display()
{
  Node current=head;
  while(current!=null)
  {
  System.out.println(current.data+"->");
  current=current.next;
  }

}

public static void main(String args[])
{
    int choice=0;
    int data;
    int pos;
 Scanner sc=new Scanner(System.in);

 dll d1=new dll();
while(choice!=5)
{
 System.out.println("1.startnode\n2.endnode\n3.anynode\n4.display");
 choice=sc.nextInt();
 switch(choice)
 {

    case 1:System.out.println("Enter the data");
          data=sc.nextInt();
          d1.startnode(data);
          break;
   case 2: System.out.println("Enter the data");
          data=sc.nextInt();
          d1.endnode(data);
          break;
   case 3:System.out.println("Enter the data");
          data=sc.nextInt();
          System.out.println("Enter current data");
          pos=sc.nextInt();
          d1.anynode(data,pos);
          break;


    case 4:d1.display();
           break;

 }
}



}
            }

    
    
        
