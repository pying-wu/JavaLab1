package inner;

public class ClassA {

	private double weight;
	private double height;

	public ClassA(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	public void printBMI() {
		InnerClass inner = new InnerClass();
		double bmi = inner.calcBMI(); //alt+shift+L
		System.out.println(bmi);
	}
	private class InnerClass{
		public double calcBMI() {
			return weight / ( height * height);
		}
		
	}
	
}
