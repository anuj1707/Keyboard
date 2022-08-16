import com.anuj.joshi.util.*;
class Main
{
public static void main(String gg[])
{
Keyboard k=new Keyboard();
String a;
System.out.print("Enter a string : ");
a=k.getString();
String b;
b=k.getString("Enter another string  : ");
char c;
System.out.print("Enter a character : ");
c=k.getCharacter();
char d;
d=k.getCharacter("Enter another character : ");
long e;
System.out.print("Enter a long type value : ");
e=k.getLong();
int f;
System.out.print("Enter a int type value : ");
f=k.getInt();
short g;
System.out.print("Enter a short type value : ");
g=k.getShort();
byte h;
System.out.print("Enter a byte type value : ");
h=k.getByte();
float i;
System.out.print("Enter a float type value : ");
i=k.getFloat();
double j;
System.out.print("Enter a Double type value : ");
j=k.getDouble();
boolean m;
System.out.print("Enter a boolean type value : ");
m=k.getBoolean();
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);
System.out.println(i);
System.out.println(j);
System.out.println(m);
}
}