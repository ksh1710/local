package src;

public class Ques1 {

	public static void main(String[] args) {
		Person p1 = new Person("kshitiz",20);
		Person p2 = new Person("new",21);
		System.out.println(p1.name + " " + p1.age);	
		System.out.println(p2.name +" "+ p2.age);
	}

}

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}