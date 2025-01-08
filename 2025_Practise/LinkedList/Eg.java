class Eg
{
public static void main(String... args){
LinkedList list = new LinkedList();
list.print();
list.insertBeg(10);
list.insertBeg(5);
list.insertEnd(200);
list.insertEnd(500);
list.insertEnd(1000);
list.insertPos(100, 3);
list.insertPos(90, 3);
list.insertBeg(4);
list.insertEnd(1100);
list.insertPos(80, 4);
list.insertPos(70, 4);
list.print();
list.insertPos(3, 1);
list.print();
System.out.println("The size of the list is : "+list.size());
list.insertPos(1200, 12);
list.print();
System.out.println("The size of the list is : "+list.size());

list.reverse();
list.print();

list.rReverse();
list.print();

list.fPrint();
list.bPrint();

System.out.println("\n_______________________________________");

System.out.println("Before Deletion");
list.print();
list.deleteBeg();
list.deleteEnd();

list.deletePos(6);
list.deletePos(7);
list.deletePos(8);

list.print();
System.out.println("The size of the list is : "+list.size());

}
}