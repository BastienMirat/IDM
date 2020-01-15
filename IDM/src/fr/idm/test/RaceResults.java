package fr.idm.test;

import java.util.HashMap;
import java.util.Map;

public class RaceResults {
	
	HashMap<String , TimeDuration> results;
	
	
	
	public void onNewResult(String tag, TimeDuration time) {
		results.put(tag , time);
	}
	
	public void printResult() {
		
		for(Map.Entry oneResult : results.entrySet()) {
			
	          System.out.println("Tag: "+oneResult.getKey() + " & time: " + oneResult.getValue());
		}
		
	}
	
	

}
