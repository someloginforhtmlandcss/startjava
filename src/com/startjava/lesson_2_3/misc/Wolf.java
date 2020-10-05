// 1. Создать поля - пол, кличка, вес, возраст, окрас.
// 2. Создать методы идти, сидеть, бежать, выть, охотиться.
// 3. Задать поля как private.
// 4. Задать методы как public.
// 5. Создать геттеры и сеттеры для полей.
// 6. В сеттере age проверять возраст. Если больше 8, то вывести сообщение об ошибке.

public class Wolf {
	
	private String sex;
	private String nickname;
	private String color;
	private float weight;
	private int age;

	public String getSex(){
		return sex;
	}

	public void setSex(String sex){
		this.sex = sex;
	}

	public String getNickname(){
		return nickname;
	}

	public void setNickname(String nickname){
		this.nickname = nickname;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public float getWeight(){
		return weight;
	}

	public void setWeight(float weight){
		this.weight = weight;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		
		if (age <= 0 | age > 8){
			this.age = -1;
		} else {
			this.age = age;
		}
	}	

	public void go(){
		System.out.println("Go");
	}

	public void sit(){
		System.out.println("Sit");
	}

	public void run(){
		System.out.println("Run");
	}

	public void cry(){
		System.out.println("Cry");
	}

	public void hunt(){
		System.out.println("Hunt");
	}										
}