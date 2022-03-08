package personChallenge;

import java.util.ArrayList;
import java.util.List;


public class addToList {
		
		List<Person> people = new ArrayList<>();
		
		
		public addToList() {
			super();
		}


		public addToList(List<Person> people) {
			super();
			this.people = people;
		}
		
		public void addPerson(Person person) {
			people.add(person);
		}
		
		public void printList() {
			for(Person p:people) {
				System.out.println(p);
			}
		}
		
		public void printListStream() {
			this.people.stream()
			.forEach(p -> System.out.println(p));
		}
		
		public void findByNameStream(String name) {
			this.people.stream().forEach(p -> {if(p.getName().equalsIgnoreCase(name))System.out.println(p);});
		}
		
																					
	}	








