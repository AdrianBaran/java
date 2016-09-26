package inheritance;

public class Person extends BasePerson {

	private Long salary;

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Person(String firstName, String lastName, Long salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public Person() {

		System.out.println("Wywoluje domyslny konstruktor=");

	}

	public Person(String firstName) {
		this.firstName = firstName;
	}

	public Person withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	@Override
	public String getMyDescription() {
		
		return "I'm person!";
	}

}
