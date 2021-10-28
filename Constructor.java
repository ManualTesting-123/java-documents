package session2;

public class Constructor {

int area;
Constructor(int height , int width)
{
	area=height * width;
	System.out.println("area of the rectangle:"+area);
}
public static void main(String[] args)
{
	Constructor a1=new Constructor(12,23);
	
}
}
