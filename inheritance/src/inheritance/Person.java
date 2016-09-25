package inheritance;

public class Person {

	private String firstName;
	private String lastName;
	private Long salary;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + "]";
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getLastName() {
		return lastName;
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
	
	
	

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Person withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	
	

}

