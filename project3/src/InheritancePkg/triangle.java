package InheritancePkg;

public class triangle extends Shape{
	public void Tri_Area (){
		System.out.println("Area of a triangle:Child");		
		
	}
	
		public static void main (String[]args) {
			triangle t1 = new triangle();
			t1.Area();
			t1.Tri_Area();
	}
}
	
	
	

