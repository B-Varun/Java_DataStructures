class LinkedList{
public Node head;

public int size(){
if(head == null)
 return -1;
Node temp = head;
int count = 0;
while(temp!=null){
count++;
temp = temp.next;
}
return count;
}

public void insertBeg(int data){
 if(head == null){
  head = new Node(data);
  return;
 }
 Node temp = new Node(data);
 temp.next = head;
 head = temp;
}

public void insertEnd(int data){
if(head == null){
 head = new Node(data);
 return;
}
Node temp = head;
while(temp.next != null)
 temp = temp.next;
temp.next = new Node(data);
}

public void insertPos(int data, int pos){
if((head == null) && (pos > 1))
 return;
else if(pos < 0)
 return;
else if((pos == 1) && (head == null)){
 Node temp = new Node(data);
 temp.next = head;
 head = temp;
 return;
}
Node temp = head;
int count = 0;
while((++count < (pos-1)) && (temp!=null))
 temp = temp.next;

if((temp == null) || (count != (pos-1)))
 return;

Node newNode = new Node(data);
newNode.next = temp.next;
temp.next = newNode;
}

public int deleteBeg(){
if(head == null)
 return -1;
int data = head.data;
head = head.next;
return data;
}

public int deleteEnd(){
if(head == null)
 return -1;
else if(head.next == null){
 int data = head.data;
 head = null;
 return data;
}
Node temp = head;
while(temp.next.next != null)
 temp = temp.next;

int data = temp.next.data;
temp.next = null;
return data;
}

public int deletePos(int pos){
if(pos < 0)
 return -1;
else if((head == null && pos > 0) || (head == null && pos == 0))
 return -1;
Node temp = head;
int count = 0;
while((++count < (pos -1)) && (temp != null))
 temp = temp.next;

if((temp.next != null) && (count == (pos-1)))
{
 int data = temp.next.data;
 temp.next = temp.next.next;
 return data;
}
else 
 return -1;
}

public void print(){
System.out.println("The elements of the list are : ");
if(head == null){
 System.out.print("Empty");
 System.out.println("\n_________________________");
 return;
}
Node temp = head;
while(temp!=null){
 System.out.print(temp.data + " ");
 temp = temp.next;
 } 
System.out.println("\n_________________________");
}

public void fPrint(){
System.out.print("The elements of the list from front are : ");
frecPrint(head);
}

public void bPrint(){
System.out.print("The elements of the list from back are : ");
brecPrint(head);
System.out.println();
}

public void frecPrint(Node h){
 if(h == null){
  System.out.println();
  return;
 }
 System.out.print(h.data + " ");
 frecPrint(h.next);
}

public void brecPrint(Node h){
 if(h == null)
  return;
 brecPrint(h.next);
 System.out.print(h.data + " ");
}

public void reverse(){
 if(head == null)
  return;
 Node curr = head, prev = null;
 while(curr != null){
  Node next = curr.next;
  curr.next = prev;
  prev = curr;
  curr = next;
 }
 head = prev;
}

public void recReverse(Node prev, Node curr){
 if(curr == null){
  head = prev;
  return;
 }
 recReverse(curr, curr.next);
 curr.next = prev;
}

public void rReverse(){
 recReverse(null, head);
}

}