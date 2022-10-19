package Day2_linkedlist;

public class linkedList {

    public class Node
        {
            int data;
            Node nextNode;
            Node prevNode;
        
            Node(int data)
            {
                this.data = data;
            }
        
        }
    
        static Node head = null;
        static Node tail = null;
        static int sizeOfLinkedList = 0;
    
        // created addNewNode function to add new nodes to the tail of linked list.
        public void addNewNode(int data)
        {
            // creating new node to add at the tail.
            Node newNode  = new Node(data);
    
            if(head == null)
            {
                head = newNode;
                tail = newNode;
    
                // this is to tell that it is the start of linked list.
                head.prevNode = null;
                tail.nextNode = null;
            }
            else
            {
                // this part of the code add newNode to the end/tail of linked list.
                tail.nextNode = newNode;
                newNode.prevNode = tail;
                tail = newNode;
                tail.nextNode = null;
            }
            
            sizeOfLinkedList++;
    
        }
    
        public boolean isPresentNode(Node head,int data)
        {
            // temp node is to traverse in linked list without changing the address of the original head.
            Node temp = head;
    
            while(temp != null)
            {
                if(temp.data == data)
                {
                    return true;
                }

                temp = temp.nextNode;
    
            }
    
            return false;
    
        }

        public void deleteNodeAtLocation(int position){  
  
            
            if(head == null || position > sizeOfLinkedList) 
            {  
                System.out.println(position +"th position is not available");  
            }  
           
            else 
            {  
                if(position == 1){  
                       
                    head = head.nextNode;                 
                    sizeOfLinkedList--;  
                      
                }
                else if(position == sizeOfLinkedList)
                {  
                    tail = tail.prevNode;
                    sizeOfLinkedList--;  
                      
                }
                else
                {  
                      
                    Node current = head;  
                                  
                    for(int i = 1; i < position; i++){    
                        current = current.nextNode;    
                    }   
                                        
                    current.nextNode.prevNode = current.prevNode;  
                    current.prevNode.nextNode = current.nextNode;  
                    
                }  

            }  

        }  

        // this function is to print the element in the linked list.
        public void showLinkedList()
        {
            Node tmp = head;
            // this while loop will print all the nodes present in doubly linked list
            System.out.print("Nodes present in Doubly Linked List are :- ");
            while(tmp != null)
            {
                System.out.print(tmp.data+" ");
                tmp = tmp.nextNode;
            }
            System.out.println();
        }

        public static void main(String[] args) 
        {
        
            linkedList obj = new linkedList();

            obj.addNewNode(45);
            obj.addNewNode(12);
            obj.addNewNode(25);
            obj.addNewNode(18);
            obj.addNewNode(13);
            obj.addNewNode(27);

            obj.showLinkedList();
       

            // this will give us the boolean value of whether the node with given 
            boolean nodePresentOrNot = obj.isPresentNode(head, 6);
            System.out.println(nodePresentOrNot);

            // this part of the code will delete the node at that position and print the updated list after deletion.
            obj.deleteNodeAtLocation(4);
            obj.showLinkedList();

        }
}
