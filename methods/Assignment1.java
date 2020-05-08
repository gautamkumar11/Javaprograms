class Assignment1{

	public static double simpleintrest(int p, int r, int t){
		double SI;
		SI = (p*r*t)/100;

		return SI;

	}

  	public static double circumfaranceofcircle(int r){
  		double circumfarance;
		circumfarance= 2*3.14*r;
		return circumfarance;
  	}


  	public static double areaofrhombus(int d1, int d2){
  		double area;
		area= (d1*d2)/2;
		 
		 return area;
  	}

  	public static double volumeofcylender(int r, int h)
  	{
  		double volume;
	volume= 3.14 * r * r * h;

	return volume;
  	}

  	public static double surfaceareaofcube(int a){
  		double surfacearea;
		surfacearea= 6* a * a;
		return surfacearea;
		
  	}


	public static void main(String args[]){

		double SI;
		SI= simpleintrest(200, 8, 2);
		System.out.println("Simple Intrest = "+SI);

		double circumfarance;
		circumfarance= circumfaranceofcircle(5);
		System.out.println( "circumfarance of circle= "+circumfarance);


		double area;
		area= areaofrhombus(7,5);
		System.out.println("area of rhombus="+area);


  		double volume;
		volume= volumeofcylender(5,8);
		System.out.println("volume of a cylinder= "+volume);

		double surfacearea;
		surfacearea= surfaceareaofcube(5);
		System.out.println("surface area of a cube is "+surfacearea);
	}
}