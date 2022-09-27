import com.thinking.machines.util.*;
class TMIteratorTestCase
{
public static void main(String gg[])
{
TMLinkedList<Integer> list1=new TMLinkedList<>();
list1.add(10);
list1.add(20);
list1.add(30);
list1.add(40);
TMArrayList<String> list2=new TMArrayList<>();
list2.add("Ujjain");
list2.add("Indore");
list2.add("Goa");

System.out.println("Iterating on linked list");
TMIterator<Integer> iterator1=list1.iterator();
Integer x;
while(iterator1.hasNext())
{
x=iterator1.next();
System.out.println(x);
}

System.out.println("Iterating on array list");
TMIterator<String> iterator2=list2.iterator();
String y;
while(iterator2.hasNext())
{
y=iterator2.next();
System.out.println(y);
}
}
}