package inheritance;

public abstract class BasePerson implements HasName {

	protected String firstName;
	protected String lastName;
	protected Country country;

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String getName() {
		return firstName + "-" + lastName;
	}

	public abstract String getMyDescription();

}
