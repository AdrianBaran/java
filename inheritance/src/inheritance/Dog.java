package inheritance;

public class Dog implements HasName {

	private String name;

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog(String name) {
		this.name = name;
	}
	
	
	
	
}
