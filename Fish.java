
public class Fish extends Animal implements Pet{
	String Name;
	public Fish() {
		super(0);
		Name = "Piscene";
	}
	
	public String getName() {
		
		return Name;
	}

	public String setName(String name) {
		Name = name;
		return Name;
	}

	public void play() {
		System.out.println("The Fish is playing");

	}
	
	public String walk() {
		return "Fish cannot walk";
	}

	public String eat() {
		return "It's Eating";
}

	public String setName() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
