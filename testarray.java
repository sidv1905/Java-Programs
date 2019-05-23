import java.util.Scanner;
import java.util.*;
class Testarray
{public static void main(String args[])
{ Scanner sc=new Scanner(System.in);
System.out.println("enter no of rows");
int i,j;
int r=sc.nextInt();
System.out.println("enter no of columns");
int c=sc.nextInt();
int m[][]=new int[r][c];

System.out.println("enter nos");
for(i=0;i<r;i++)
{for(j=0;j<c;j++)
{
m[i][j]=sc.nextInt();
}
}
for(int[]x:m)
{for(int e:x)
System.out.println(e+"\t");
}
}}