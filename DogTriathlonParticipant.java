public class DogTriathlonParticipant {
	//not static because it is different for each dog
	private final int NUM_EVENTS;
	
	//not final because its value increases as each dog participates in the triathlon, 
	//but it is static because at any moment in time, it is the same for all participants
	private static int totalCumulativeScore=0;
	
	private String name;
	private int obedienceScore;
	private int conformationScore;
	private int agilityScore;
	private int total;
	private double avg;
	
	public DogTriathlonParticipant(String name, int numEvents, int score1, int score2, int score3){
		
		this.name=name;
		NUM_EVENTS=numEvents;
		obedienceScore=score1;
		conformationScore=score2;
		agilityScore=score3;
		
		//the constructor calculates the total score for the participant 
		//and the participant’s average score
		total=obedienceScore+agilityScore+conformationScore;
		
		//the result of the division is cast to a double
		avg=(double)total/NUM_EVENTS;
		
		//add the participant’s total score to the cumulative score for all participants
		totalCumulativeScore=totalCumulativeScore+total;
		
	}
	
	//method that displays the data for each triathlon participant
	public void display() {
		
		System.out.println(name+ " participated in "+NUM_EVENTS+ " events and has an average score of " + avg);
		System.out.println(" " +name+ " has a total score of " + total + " bringing the total cumulative score to " + totalCumulativeScore);
		
	}
	
	
}