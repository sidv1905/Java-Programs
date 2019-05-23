class Student
{
int rollno;
String name;
String course;
int phy;
int chem;
int maths;
int eng;
int cs;

void setdata(int r,String n,String co,int p,int ch,int m,int e,int c)
{
rollno=r;
name=n;
course=co;
phy=p;
chem=ch;
maths=m;
eng=e;
cs=c;
}
void show()
{
	System.out.println("name is   "+name);
	System.out.println("roll no  "+rollno);
	System.out.println("persuing   "+course);
	
}	
double percentage()
{
return (phy+chem+maths+eng+cs)/5;
}
}

class Sest
{
public static void main(String[]args)
{

Student s1=new Student();
Student s2=new Student();

s1.setdata(98,"pappu","be",87,89,67,98,54);

s1.show();
double p=s1.percentage();
System.out.println("percentage is"+p);

System.out.printf("%-15d %5s %5s %10d %10d %10d %10d %10d %10.2f",s1.rollno,s1.name,s1.course,s1.phy,s1.chem,s1.maths,s1.eng,s1.cs,p);
}}