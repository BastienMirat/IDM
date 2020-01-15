package fr.idm.test;



public class Main {

	public static void main(String[] args) throws BadBadValueException {
		// TODO Auto-generated method stub
		
		System.out.println(new TimeDuration(832).toString());
		
		
		
		RaceResults race= new RaceResults();
		
		race.onNewResult( "BLA",new TimeDuration(8000));
		
		race.onNewResult( "JKL",new TimeDuration(5000));
		
		
	}

}
