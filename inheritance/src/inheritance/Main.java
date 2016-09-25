package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Person pereson = new Person("Adrian").withLastName("Baran");
		pereson.setSalary(0L);
		
		Person person2 = new Person("Lukasz","Jackowski", 2700L);

		List<Person> personList = new ArrayList<>();
		personList.add(person2);
		personList.add(pereson);

		for (int i = 0; i < personList.size(); i++) {
			System.out.println(personList.get(i).getFirstName());

		}
		
		for (Person p : personList) {
			System.out.println(p.getLastName());
		}

	//	System.out.println(pereson);

		//
		// Manager manager = new Manager("Lidia","Kaleta", 1000L, 250L);
		// System.out.println(manager.toString());
		//
		// HasName manager2 = manager;
		// System.out.println(manager2.getName());
		//

	}

}
