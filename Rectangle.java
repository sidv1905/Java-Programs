class Rectangle	
{int length;
int breadth;

void setdata(int l,int b)
{
	length=l;
	breadth=b;
}
int perimeter()
{
	return 2*(length+breadth);	
}
int area()
{
	return length*breadth;
}

void show()
{
	System.out.println("Length is "+length);
	System.out.println("Length is "+breadth);
	
}}


