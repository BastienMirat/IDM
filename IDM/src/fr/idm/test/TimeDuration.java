package fr.idm.test;

public class TimeDuration {

	int time ;
	int sec=0;
	int min=0;
	int h=0;
	public TimeDuration(int time) throws BadBadValueException {
		
		this.time = time;
		if(time<0) {
			throw new BadBadValueException();
		}
		
		
		while(time>=3600) {
				this.h++;
				time-=3600;
		}
		while(time>=60) {
				this.min++;
				time-=60;
		}
		this.sec=time;
		
		
		
	}
	@Override
	public String toString() {
		if(h>0) {
			return  h + "h " + min + "m " + sec +"s" ;
		}else if(min>0) {
			return  min + "m " + sec +"s" ;
		}else {
		return  sec +"s" ;
		}
	}
	
	
	
	
	
	
	

}
