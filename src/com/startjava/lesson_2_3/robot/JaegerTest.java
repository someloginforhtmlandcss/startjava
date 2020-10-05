public class JaegerTest {

	public static void main(String[] args){

		Jaeger jaegerOne = new Jaeger("Nightmare Destroyer", "Mark-3", "Ukraine", 99.3f, 54.9f, 90, 30, 6);

		System.out.println("Model name - " + jaegerOne.getModelName()); 
		System.out.println("Mark - " + jaegerOne.getMark());
		System.out.println("Origin - " + jaegerOne.getOrigin());
		System.out.println("Height - " + jaegerOne.getHeight());
		System.out.println("Weight - " + jaegerOne.getWeight());
		System.out.println("Speed - " + jaegerOne.getSpeed());
		System.out.println("Strength - " + jaegerOne.getStrength());
		System.out.println("Armor - " + jaegerOne.getArmor());

	}
}