class A
{ int a;
int b;
A()
{
System.out.println("no argument constructor ");
}
A(int A)

{
a=A;
System.out.println("argument construcutor ");
}

void show()
{
System.out.println(a);
}
}
class Test
{
public static void main(String args[])
{
A a1=new A();
A a2=new A(10);
a2.show();
}}

