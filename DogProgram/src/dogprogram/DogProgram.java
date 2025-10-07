package DogProgram;

public class DogProgram {
	
	public static void main(String[] args) {
		Dog theDog = new Dog() ;

		
		theDog.name = "Frodo";
		theDog.gender = 'M' ;
		
	
		theDog.bark();
		theDog.detailDisplay();
	}

}

