import com.thinking.machines.util.*;

class KeyboardTestCases
{
public static void main(String gg[])
{
Keyboard k=new Keyboard();
String a;
System.out.print("Enter a String : ");
a=k.getString();
String j;
j=k.getString("Enter another String : ");
char b;
b=k.getCharacter("Enter a character : ");
long c;
c=k.getLong("Enter long type value : ");
int d;
d=k.getInt("Enter int type value : ");
short e;
e=k.getShort("Enter short type value : ");
byte f;
f=k.getByte("Enter byte type value : ");
double g;
g=k.getDouble("Enter double type value : ");
float h;
h=k.getFloat("Enter float type value : ");
boolean i;
i=k.getBoolean("Enter boolean type value : ");

System.out.println(a);
System.out.println(j);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);
System.out.println(i);


}
}