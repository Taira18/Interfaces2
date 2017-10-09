
public class Cat extends Animal implements Pet {
private String Name;
	public Cat(String n) {
		super(4);
		Name = n;
	}
	
	public Cat() {
	}

	public String getName() {
		
		return Name;
	}

	public String setName(String name) {
		legs = 4;
		Name = name;
		return Name;
	}
	
	public String walk() {
		return "The cat walks";
	}

	public void play() {
		System.out.println("The cat plays");

	}

	public String eat() {
		return "It's Eating";
}

	@Override
	public String setName() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
