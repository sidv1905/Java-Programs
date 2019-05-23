import java.util.Scanner;
class Bank
{
static double minbal;
String name;
int accno,ac;
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
if(balance>minbal)
System.out.println("Account Created");
 else{
	System.out.println("enter a value more than minimum balance");
 balance=sc.nextDouble();
}
System.out.println("Account Created");

}
void showlist()
{System.out.println("Name       accno               balance ");
System.out.printf("-%5s %10d %10.2f",name,accno,balance);
}

/*Bank showacc(Bank b)
{


}*/
double withdrawal(Scanner sc)
{double amount;

System.out.println("how much to withdraww");

amount=sc.nextDouble();

if(balance<amount)
System.out.println("Insufficient balance");
else
{balance=balance-amount;}
if(balance<minbal)
{System.out.println("Amount cannot be withdrawn");}
else
{System.out.println("amount withdrawn");}
return balance;
}

double updateminbal(Scanner sc)
{System.out.println("ENTER MINBAL");
	double minbal=sc.nextDouble();
return minbal;
}

static double showminbal()
{System.out.println("Minimum balance is  :  "+minbal);
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
int cnt=0;
int i;
for(i=0;i<n;i++)
		{b[i]=new Bank();}
i=0;

do{
	System.out.println("     **********BANK MENU***************");
System.out.println("1.Create New acc \n"+"2.Show acc \n"  +"3.Show accounts list    \n  "+"4.Withdraw amount \n "+"5.Depsoit amount\n"+"6.Show Minbal \n"+"7.Update minimum balance  \n"+"8.exit" );
System.out.println("Enter Choice :  ");
c=sc.nextInt();

switch(c)
{
	case 1:
		
	b[i].newacc(sc);
	cnt++;
	i++;
	
	break;
	
	case 2:System.out.println("enter acc no");
	b[i].accno=sc.nextInt();
	for(i=0;i<cnt;i++)
	{
	 
System.out.println("Name          "+"account no       "+"balance           ");
System.out.printf("-%5s %10d %10.2f",b[i].name,b[i].accno,b[i].balance);
	}
	break;
	
	case 3:for(i=0;i<cnt;i++)
		b[i].showlist();
	break;
	case 4:{System.out.println("enter acc no");
	b[i].accno=sc.nextInt();
	for(i=0;i<cnt;i++)
	b[i].withdrawal(sc);
	}break;
	
	
	case 5:{System.out.println("enter accno.");
	b[i].accno=sc.nextInt();
	for(i=0;i<cnt;i++)
	
	
	b[i].deposit(sc);}	
	break;
	
	
	case 6:
	Bank.showminbal();
	break;
	case 7:System.out.println("enter accno.");
	for(i=0;i<cnt;i++)
	{b[i].accno=sc.nextInt();
	
	b[i].updateminbal(sc);
	}
	break;
	case 8:
	
	
	default:
	System.out.println("Please enter Correct option ");
}}while(c!=8);

}
}	
	
	
	
	
	
	