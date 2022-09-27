import com.thinking.machines.util.*;

class ForEachTestCase
{
public static void main(String gg[])
{
TMList<Integer> list1=new TMArrayList<Integer>();
list1.add(10);
list1.add(20);
list1.add(30);
list1.add(40);
list1.forEach((m)->{
System.out.println(m);
});

System.out.println("**********************************");

TMList<Integer> list2=new TMLinkedList<Integer>();
list2.add(1000);
list2.add(2000);
list2.add(3000);
list2.add(4000);
list2.forEach((p)->{
System.out.println(p);
});

}
}