public class TestDogs {
	
	public static void main(String[] args) {
		
		System.out.println("---------------------------------------------------- ");
		
		DogTriathlonParticipant dog1 = new DogTriathlonParticipant("Bowser", 2, 85, 89, 0);
		dog1.display();
		System.out.println("---------------------------------------------------- ");

		
		DogTriathlonParticipant dog2 = new DogTriathlonParticipant("Lowser", 3, 75, 79, 80);
		dog2.display();
		System.out.println("---------------------------------------------------- ");

		
		DogTriathlonParticipant dog3 = new DogTriathlonParticipant("Mowser", 1, 90, 99, 100);
		dog3.display();
		System.out.println("---------------------------------------------------- ");

	}
}