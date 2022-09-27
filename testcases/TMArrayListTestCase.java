import com.thinking.machines.util.*;

class TMArrayListTestCase 
{
public static void main(String gg[])
{
TMArrayList list=new TMArrayList();
list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
list.add(60);
list.add(70);
list.add(80);
list.add(90);
list.add(100);
list.add(110);
list.add(120);
for(int e=0;e<list.size();e++) System.out.println(list.get(e));

System.out.println("Inserting 130 at inde=2");
list.add(2,130);
for(int e=0;e<list.size();e++) System.out.println(list.get(e));


list.removeAt(1);
System.out.println("After removing from index=1");
for(int e=0;e<list.size();e++) System.out.println(list.get(e));

System.out.println("Updating data at index=3");
list.update(3,1008);
for(int e=0;e<list.size();e++) System.out.println(list.get(e));

list.clear();
System.out.println("Clearing list");
for(int e=0;e<list.size();e++) System.out.println(list.get(e));


}
}