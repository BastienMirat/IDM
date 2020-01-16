package fr.idm.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws BadBadValueException {
		// TODO Auto-generated method stub
		
		System.out.println(new TimeDuration(832).toString());
		
		
		
		RaceResults race = new RaceResults();
		
		race.onNewResult( "BLA",new TimeDuration(8000));
		race.onNewResult( "JKL",new TimeDuration(50420));
		race.onNewResult( "mKL",new TimeDuration(5060));
		race.onNewResult( "HKL",new TimeDuration(5400));
		race.onNewResult( "PKL",new TimeDuration(0700));
		//race.onNewResult( "ZKL",new TimeDuration(0500));
		//race.printResult();
		
		
        Comparateur comp =  new Comparateur(race.returnHashM());
        TreeMap<String, TimeDuration> result_apres = new TreeMap(comp);

        
        System.out.println("Avant le tri: "+race.returnHashM());
        result_apres.putAll(race.returnHashM());
        System.out.println("Après le tri: "+result_apres);
		
		
	}

}
class Comparateur implements Comparator {

    Map test;
    public Comparateur(HashMap map) {
        this.test = map;
       
    }

    @Override
    public int compare(Object result1, Object result2) {
    	
       if (((TimeDuration) result1).getH()<((TimeDuration) result2).getH() || (((TimeDuration) result1).getH()==((TimeDuration) result2).getH() && (int)((TimeDuration) result1).getMin()<((TimeDuration) result2).getMin()) || (((TimeDuration) result1).getH()==((TimeDuration) result2).getH() && ((TimeDuration) result1).getMin()==((TimeDuration) result2).getMin() && ((TimeDuration) result1).getSec()<((TimeDuration) result2).getSec())  ) {
          return -1;

       } else {
          return 1;
       }
    }

	
	
}