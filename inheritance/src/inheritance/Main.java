package inheritance;

public class Main {

	public static void main(String[] args) {

		Person pereson = new Person("Adrian").withLastName("Baran");
		pereson.setSalary(0L);
		System.out.println(pereson);

		
		Manager manager = new Manager("Lidia","Kaleta", 1000L, 250L);
		System.out.println(manager.toString());
		
		HasName manager2 = manager;
		System.out.println(manager2.getName());
	}

}
