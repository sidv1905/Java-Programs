import java.util.Scanner;
class Bank
{
static double minbal;
String name;
int accno;
double balance;

Bank()
{}
void newacc(Scanner sc)
{
System.out.println("Enter Name : ");
name=sc.next();
System.out.println("Enter accno : ");
accno=sc.nextInt();
System.out.println("Enter Balance: ");
balance=sc.nextDouble();
System.out.println("Account Created");
}
void showlist()
{System.out.println("Accounts   :  ");
System.out.printf("-%5s %10d %10.2f",name,accno,balance);
}

void showacc(Scanner sc)
{accno=sc.nextInt();

 
System.out.println("Name          "+"account no       "+"balance           ");
System.out.printf("-%5s %10d %10.2f",name,accno,balance);
}
double withdrawal(Scanner sc)
{double amount;

System.out.println("how much to withdraww");

amount=sc.nextDouble();
if(balance<amount)
System.out.println("Insufficient balance");
else
{balance=balance-amount;
System.out.println("amount withdrawn");}
return balance;
}

double updateminbal(Scanner sc)
{double minbal=sc.nextDouble();
return minbal;
}

static double showminbal()
{System.out.println("Minimum balance is  :  ");
return minbal;
}
double deposit(Scanner sc)
{double deposit;
System.out.println("enter amount to deposit");
deposit=sc.nextDouble();
balance=balance+deposit;
System.out.println("Amount deposited in your account");
return balance;
}
}	
class Banktest
{
	public static void main(String args[])
	{Bank accno=new Bank();
	
Scanner sc=new Scanner(System.in);	
Bank.minbal=2000.00;
int n=sc.nextInt();
Bank b[]=new Bank[n];
int c;

do{
	System.out.println("     **********BANK MENU***************");
System.out.println("1.Create New acc \n"+"2.Show acc \n"  +"3.");
System.out.println("Enter Choice :  ");
c=sc.nextInt();
for(int i=0;i<n;i++)
{b[i]=new Bank();
switch(c)
{
	case 1: 
	b.newacc(sc);
	 break;
	
	
	case 2:
	
	break;
	
	case 3:for(Bank e:b)
		e.showlist();
	break;
	case 4:System.out.println("enter acc no");

	b.accno=sc.nextInt();
		
	b.withdrawal(sc);
	
	break;
	case 5:System.out.println("enter accno.");
	
	b.accno=sc.nextInt();
	b=new Bank();
	b.deposit(sc);
	
	break;
	case 6:
	Bank.showminbal();
	break;
	case 7:System.out.println("enter accno.");
	
	b.accno=sc.nextInt();
	b=new Bank();
	b.updateminbal(sc);
	
	break;
	case 8:
	
	
	default:
	System.out.println("Please enter Correct option ");
}}
}while(c!=7);
}
}	
	
	
	
	
	
	