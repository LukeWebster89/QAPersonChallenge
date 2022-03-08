package personChallenge;



public class Runner {

	public static void main(String[] args) {
		Person personOne = new Person("Luke", 32, "Software Developer");
		Person personTwo = new Person("Leah", 26, "Nail Artist");
		Person personThree = new Person("Jackie Shneckle", 100, "Unknown");
				
		addToList newPeople = new addToList();
		
		newPeople.addPerson(personOne);
		newPeople.addPerson(personTwo);
		newPeople.addPerson(personThree);
		
//		newPeople.printList();
		
//		newPeople.printListStream();
		
//		newPeople.findByNameStream("luke");

		

	}

}
