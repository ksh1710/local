package src;

public class Ques2 {

	public static void main(String[] args) {
		
		Dog d1 = new Dog("tommy","Shiba inu");
		
		Dog d2 = new Dog("kalu","desi");

		System.out.println(d1.getDog());

		System.out.println(d2.getDog());
		
		d1.setDog("pony","new breed");
		
		System.out.println(d1.getDog());

	}
}

class Dog{
	private String Name;
	private String Breed;
	
	Dog(String name,String breed){
		this.Breed =breed;
		this.Name = name;
	}
	
	public String getDog() {
		return (Name +" "+ Breed);
	}
	
	public void setDog(String newName,String newBreed) {
		this.Name =newName;
		this.Breed = newBreed;
}
}
