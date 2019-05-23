class Item
{
String name;
int price;
int quantity;
Item(String nm,int p,int q)
{
	name=nm;
	price=p;
	quantity=q;
}
void show()
{
System.out.println("Name is "+name);
System.out.println("Price is "+price);
System.out.println("N. of items are  "+quantity);
}
int amount()
{
return price*quantity;
}

}

class Itemtest
{
public static void main(String args[])
{Item i[]=new Item[3];
i[0]=new Item("Tamatar",40,12);
i[1]=new Item("onion",50,8);
i[2]=new Item("Cucumber",23,12);

for(int j=0;j<i.length;j++)
{	i[j].show(); 
}
for(Item e:i)
{e.amount();
}
 }
 }