package InheritancePkg;

public class square extends Shape 
   {
	public void square_Area () {
		System.out.println("Area of a square:child");
		}
		
			public static void main (String[]args) {
				square t2 = new square();
				t2.Area();
				t2.square_Area();
		}
		}
		
	
