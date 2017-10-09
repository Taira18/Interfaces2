
public abstract class Animal {
	 protected int legs;
	public Animal (int leg) {
		legs = leg;
	}
	public Animal() {}
	public abstract String eat();
	
	public String walk() {
		return	"The animal walks with " +legs+" legs";	
	}
}