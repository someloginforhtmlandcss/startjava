// 1. Создать класс Person.
// 2. Создать поля с атрибутами человека - пол, имя, рост, вес, возраст.
// 3. Задать значения полям.
// 4. Создать методы с описанием навыков - ходьба, сидение, бег, разговор, учёба Java.

public class Person {

	String sex = "Мужской";
	String name = "Николай";
	float height = 1.92f;
	float weight = 73.5f;
	int age = 36;

	void walk(){
		System.out.println("Ходить");
	}

	void sit(){
		System.out.println("Сидеть");
	}

	void run(){
		System.out.println("Бежать");
	}

	void talk(){
		System.out.println("Говорить");
	}

	void studyJava(){
		System.out.println("Учить Java");
	}				

}