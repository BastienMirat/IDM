package fr.idm.test;

import java.util.HashMap;
import java.util.Map;

public class RaceResults {
	
	private HashMap< TimeDuration,String > results = new HashMap<  TimeDuration ,String>(); 
	
	
	public HashMap returnHashM() {
		return results;
	}
	
	public void onNewResult(String tag, TimeDuration time) {
		results.put(time , tag);
		
		//System.out.println(results);
	}
	
	public void printResult() {
		
		for(Map.Entry oneResult : results.entrySet()) {
			
	          System.out.println("Tag: "+oneResult.getKey() + " & time: " + oneResult.getValue());
		}
		
	}
	
	

}
