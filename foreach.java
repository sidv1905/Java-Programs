import java.util.Scanner;
class foreach
{
public static void main(String args[] ) 
{Scanner sc=new Scanner(System.in);
int a[]=new int[10];

for(int i=0;i<a.length;i++)
{System.out.println("Enter no.");
a[i]=sc.nextInt();
}
System.out.println("no.s are");
for(int e:a)
{
System.out.println(e);
}
}}