package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Person pereson = new Person("Adrian").withLastName("Baran");
		pereson.setSalary(0L);

		Person person2 = new Person("Lukasz", "Jackowski", 2700L);
		Manager manager2 = new Manager("Lukasz", "Polubinski", -1000L);
		Dog dog = new Dog("Szarik");

		List<HasName> personList = new ArrayList<>();
		personList.add(person2);
		personList.add(pereson);
		personList.add(manager2);
		personList.add(dog);

		// for (int i = 0; i < personList.size(); i++) {
		// System.out.println(personList.get(i).getFirstName());
		//
		// }

		for (HasName p : personList) {
			if (p instanceof Person) {
				System.out.print("Human ");
			} else if (p instanceof Dog) {
				System.out.print("Animal ");
			}

			System.out.println(p.getName());

		}

		// System.out.println(pereson);

		//
		// Manager manager = new Manager("Lidia","Kaleta", 1000L, 250L);
		// System.out.println(manager.toString());
		//
		// HasName manager2 = manager;
		// System.out.println(manager2.getName());
		//

	}

}
