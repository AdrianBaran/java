package inheritance;

public class Manager extends Person {
	
	private Long extraSalary;

	public Long getExtraSalary() {
		return extraSalary;
	}

	public void setExtraSalary(Long extraSalary) {
		this.extraSalary = extraSalary;
	}

	public Manager(String firstName, String lastName, Long salary) {
		super(firstName, lastName, salary);
	}

	public Manager(Long extraSalary) {

		this.extraSalary = extraSalary;
	}

	public Manager(String firstName, String lastName, Long salary, Long extraSalary) {
		super(firstName, lastName, salary);
		this.extraSalary = extraSalary;
	}

	public Manager() {
	}

	@Override
	public String toString() {
		return "Manager [extraSalary=" + extraSalary + ", getFirstName()="
				+ getFirstName() + ", getSalary()=" + getSalary()
				+ ", getLastName()=" + getLastName() + "]";
	}
	
	
	
	
	
	

}
