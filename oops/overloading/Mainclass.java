class GraphSheet
{
	public void drawPoint()
	{
		System.out.println("draw Point at 0,0");
	}

	public static void drawPoint(int x,int y)
	{
		System.out.println("draw Point at "+x+","+y);
	}

	public int drawPoint(double x,double y)
	{
		System.out.println("draw Point at "+x+","+y);
		return 10;
	}

	protected void drawPoint(int x,double y)
	{
		System.out.println("draw Point at "+x+","+y);
	}
}

class Mainclass
{
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");
       
       GraphSheet g1 = new GraphSheet();
       g1.drawPoint();
       g1.drawPoint(2,3);
       g1.drawPoint(2.4,4.8);
       g1.drawPoint(5.6,1);
       g1.drawPoint(2,3.6);


       System.out.println(10);
       System.out.println(2.5);

	   System.out.println("Program ends...");
	}
}






