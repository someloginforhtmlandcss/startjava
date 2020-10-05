// 1. Создать класс WolfTest.
// 2. Создать объект Wolf.
// 3. Задать значения атрибутам сеттерами.
// 4. Считать значения атрибутов геттерами и вывести.

public class WolfTest {

	public static void main(String[] args){

		Wolf wolf01 = new Wolf();
		
		wolf01.setSex("male");
		String sex = wolf01.getSex();

		wolf01.setNickname("Wolfy");
		String nickname = wolf01.getNickname();		
		
		wolf01.setColor("grey");
		String color = wolf01.getColor();		
		
		wolf01.setWeight(60.3f);
		float weight = wolf01.getWeight();		

		wolf01.setAge(6);
		int age = wolf01.getAge();

		System.out.println("Sex - " + sex);
		System.out.println("Nickname - " + nickname);
		System.out.println("Color - " + color);
		System.out.println("Weight - " + weight);
		
		if (age != -1){
			System.out.println("Age - " + age);	
		} else {
			System.out.println("Incorrect age!");
		}

		System.out.println();

		wolf01.go();
		wolf01.sit();
		wolf01.run();
		wolf01.cry();
		wolf01.hunt();

	}
}