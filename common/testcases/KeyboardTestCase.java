import com.thinking.machines.util.*;
class KeyboardTestCase
{
public static void main(String gg[])
{
Keyboard keyboard=new Keyboard();
String name;
char gender;
int age;
double salary;
System.out.println("Enter name");
name=keyboard.getString();
System.out.println("Enter gender");
gender=keyboard.getCharacter();
System.out.println("Enter age");
age=keyboard.getInt();
System.out.println("Enter salary");
salary=keyboard.getDouble();

System.out.println(name);
System.out.println(gender);
System.out.println(age);
System.out.println(salary);

}
}