class Employee
{int id;
String name;
int contact;
int basicsal;
int medical;
int tax;
int dfamt;
int leav;
int hra;

void setdata(int i,String n,int c,int b,int m,int t,int d,int l,int hr)
{id=i;
name=n;
contact=c;
basicsal=b;
medical=m;
tax=t;
dfamt=d;
leav=l;
hra=hr;
}
void show()
{
	System.out.println("Name of person is"+name);
	System.out.println("contact is"+contact);
	System.out.println("basic sal is"+basicsal);
	System.out.println("ID of person is   = "+id);	
}
void calculatesalary()
{
 