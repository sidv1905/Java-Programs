import java.util.Scanner;
class Book
{
String title;
double price;

Book()
{}
void setdata(Scanner sc)
{System.out.println("enter title");
title=sc.next();
System.out.println("enter price");
price=sc.nextDouble();
}
void show()
{System.out.println("title is"+title);
System.out.println("price is"+price);
}
}
class Test
{public static void main(String []args)
{Scanner sc=new Scanner(System.in);
System.out.println("how many books");
int n=sc.nextInt();
Book books[]=new Book[n];
for(int i=0;i<n;i++)
{
books[i]=new Book();
books[i].setdata(sc);
}
for(Book e:books)
{
e.show();
}
}
}

