package session2;

public class C1 {
	int height;
	int width;
	int area;
	public void retangle()
	{
		 
		area=height * width;
		System.out.println("area of the rectangle is :"+area);
		
	}
	public static void main(String[] args)
	{
		C1 a=new C1();
		a.height=12;
		a.width=23;
		a.retangle();
		
	}

}
