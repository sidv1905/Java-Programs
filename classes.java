class A
{void outputA()
{
System.out.println("True CLASS A");
}}
class B
{void outputb()
{
System.out.println("True CLASS B");
}}

class Test
{
public static void main(String args[])
{
A a1=new A();
B b1=new B();

a1.outputA();
b1.outputb();
}}