
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle();
		
		System.out.println("The circle has radius of: " + c1.getRadius() + "and areaa of: " + c1.getArea()); 

		Circle c2 = new Circle(2.0);
		
		System.out.println("The overriden circle has radius of: " + c2.getRadius() + "and areaa of: " + c2.getArea() + c2.getMole()); 
	}

}
