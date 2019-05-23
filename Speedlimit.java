import java.util.Scanner;
class Speed
{
static int minspeed;
int speed;
Speed()
{}

void setdata(Scanner sc)
{

speed=sc.nextInt();
}
void show()
{System.out.println("minspeed is"+minspeed);
System.out.println("speed is"+speed);
}
void checkspeed()
{
	if(speed>minspeed)
{
	System.out.println("Drive slow someone cares");
}
else
{
	System.out.println("Economy speed is");
}
}}
class Speedlimit
{public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Speed s=new Speed();
s.minspeed=40;
System.out.println("minspeed is"+s.minspeed);

s.setdata(sc);
s.checkspeed();
s.show();

}}