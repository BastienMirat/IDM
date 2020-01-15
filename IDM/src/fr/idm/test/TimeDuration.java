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
	public void toString() {
		
		if(this.h>0) {
			System.out.println(this.h,"h ",this.min,"m ",this.sec,"s");
			
		}else if(this.min>0){
			System.out.println(this.min,"m ",this.sec,"s");
		}
		else {
			System.out.println(this.sec,"s");
		}
	}
	
	
	
	

}
