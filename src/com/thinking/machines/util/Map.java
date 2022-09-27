import java.util.*;

class Student
{
private int rollNumber;
private String name;
public void setRollNumber(int rollNumber)
{
this.rollNumber=rollNumber;
}
public int getRollNumber()
{
return this.rollNumber;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return this.name;
}
}

class psp
{
public static void main(String gg[])
{
Student s1=new Student();
s1.setRollNumber(101);
s1.setName("Ayan");

Student s2=new Student();
s2.setRollNumber(102);
s2.setName("Arish");

Student s3=new Student();
s3.setRollNumber(103);
s3.setName("Manu");

/*
Creating Map Data Structure 'students' instead of array Data Structure
Map<Key,Value> nameOfMap;
nameOfMap=new HashMap<>();
*/
Map<Integer,Student> students;
students=new HashMap<>();

//put(Key,Value) method to insert key and value in the Map
students.put(new Integer(s1.getRollNumber()),s1);
students.put(s2.getRollNumber(),s2); //autoboxing
students.put(s3.getRollNumber(),s3); //autoboxing

//using containsKey(Key) to check whether this Key exist in the Map or not
System.out.println("101 exists : "+students.containsKey(101)); 
System.out.println("109 exists : "+students.containsKey(109));
System.out.println("103 exists : "+students.containsKey(103));

//Using get(Key) method of Map to get the address of the object corresponding to the key passed
Student s=students.get(102);
System.out.println("Key : "+s.getRollNumber()+","+"Value : "+s.getName());

//removing element corresponding to key 102 from Map 'students'
students.remove(102);
System.out.println("102 exists : "+students.containsKey(102)); 

s=students.get(102); //since no entry exist corresponding to key 102 hence null will be passed
System.out.println(s); //prints null

s=students.get(103);
System.out.println(s); //Object class ki toString chalegi

System.out.println("Iterating on Map 'students' Technique-01");
students.forEach((k,v)->{
System.out.printf("Key : %d , Value : (%d,%s)\n",k,v.getRollNumber(),v.getName());
});

System.out.println("Iterating on Map 'students' Technique-02");
Set<Map.Entry<Integer,Student>> sss;
sss=students.entrySet();
Iterator<Map.Entry<Integer,Student>> it;
it=sss.iterator();
Map.Entry<Integer,Student> entry;

while(it.hasNext())
{
entry=it.next();
System.out.printf("Key : %d , Value:(%d,%s)\n",entry.getKey(),entry.getValue().getRollNumber(),entry.getValue().getName());
}

System.out.println("Iterating on Map 'students' Technique-03");
for(Map.Entry<Integer,Student> et:students.entrySet())
{
System.out.printf("Key : %d , Value:(%d,%s)\n",et.getKey(),et.getValue().getRollNumber(),et.getValue().getName());
}

System.out.println("get all values of map");
Collection<Student> vals=students.values();
for(Student ss:vals)
{
System.out.println(ss.getRollNumber()+","+ss.getName());
}


//practise 
}
}