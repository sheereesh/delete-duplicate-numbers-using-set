package deleteduplicate;

import java.util.HashSet;
import java.util.Set;

public class DeleteDuplicate {

	public static void main(String[] args) {
	 int [] array= {12,13,15,13,16,17,12,15,16};
  
  Set<Integer> mapIntegers=new HashSet<Integer>();
  for(int i=0;i<array.length;i++) {
	  mapIntegers.add(array[i]);
  }
	System.out.println(mapIntegers);
	}

}
