package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class JavaEight {

	public void employeeTest() {

		Employee employee0 = new Employee();
		employee0.setFirstName("Abhishek");
		employee0.setLastName("Sharma");
		employee0.setAge(29);
		Address address0 = new Address();
		address0.setLine1("aaaaaaaaaa");
		address0.setLine2("aaaaaaaaaa");
		address0.setCity("Harda");
		address0.setState("MP");
		address0.setPincode(461331);
		employee0.setAddress(address0);

		Employee employee1 = new Employee();
		employee1.setFirstName("Rahul");
		employee1.setLastName("Yadav");
		employee1.setAge(29);
		Address address1 = new Address();
		address1.setLine1("aaaaaaaaaa");
		address1.setLine2("aaaaaaaaaa");
		address1.setCity("Indore");
		address1.setState("MP");
		address1.setPincode(463156);
		employee1.setAddress(address1);

		Employee employee2 = new Employee();
		employee2.setFirstName("Kapil");
		employee2.setLastName("Sharma");
		employee2.setAge(50);
		Address address2 = new Address();
		address2.setLine1("aaaaaaaaaa");
		address2.setLine2("aaaaaaaaaa");
		address2.setCity("Pune");
		address2.setState("MH");
		address2.setPincode(462331);
		employee2.setAddress(address2);

		Employee employee3 = new Employee();
		employee3.setFirstName("Deepti");
		employee3.setLastName("Raguwanshi");
		employee3.setAge(28);
		Address address3 = new Address();
		address3.setLine1("aaaaaaaaaa");
		address3.setLine2("aaaaaaaaaa");
		address3.setCity("Pune");
		address3.setState("MH");
		address3.setPincode(463631);
		employee3.setAddress(address3);

		List<Employee> employees = Arrays.asList(employee0, employee1, employee2, employee3);

		List<Employee> onlyPune = employees.stream()
				.filter(employee -> employee.getAddress().getCity().equalsIgnoreCase("Pune"))
				.collect(Collectors.toList());

		for (Employee employee : onlyPune) {
			System.out.println(employee.getFirstName() + " " + employee.getLastName() + " --------- "
					+ employee.getAddress().getCity());
		}

		List<Employee> ageFilter = employees.stream().filter(employee -> employee.getAge() > 30)
				.collect(Collectors.toList());

		for (Employee employee : ageFilter) {
			System.out.println(
					employee.getFirstName() + " " + employee.getLastName() + " --------- " + employee.getAge());

			System.out.println("The stream after applying " + "the function is : ");

			// Creating a list of Strings
			List<String> list = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ", "Computer", "Science", "gfg");

			// Using Stream map(Function mapper) and
			// displaying the length of each String
			list.stream().map(str -> str.length()).forEach(System.out::println);

			list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

		}
	}
}
