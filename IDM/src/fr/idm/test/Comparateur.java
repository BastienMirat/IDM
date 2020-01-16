package fr.idm.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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