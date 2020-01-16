package fr.idm.test;

public class TimeDuration {

	private int time ;
	private int sec=0;
	private int min=0;
	private int h=0;
	
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
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
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
