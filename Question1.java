package assignment05;

public class Question1{
	private long[] array;
	public Question1(int n){
		if(n<0){
			this.array = new long[0];
		}
		else{
			this.array = new long[n];
		}
	
	}
	
	public void insert(long[] some){
		int stop = 0;
		if(some!=null && some.length!= 0){
			if (some.length>array.length){
				stop = array.length;
			}
			else {
				stop = some.length;
			}
			for (int i = 0;i<stop;i++){
				array[i]=some[i];
			}
		}
	}
	/**
	*Multiples method receives param 'n' and goes through the original
	*array and looks for numbers that are exact multiples of 'n' and 
	*copies those numbers into a new array and returns the new array.
	*
	*@param n - the number that the method uses to look for exact 
	*multiples of
	*/
	public long[] multiples(int n){
		int multipleCount = 0;
		long[] multiplesArray;
		if(n!=0){
			for(int i=0; i<array.length; i++){
				if(array[i]%n==0){
					multipleCount++;
				}
			}
			multiplesArray = new long[multipleCount];
			int multipleIndex = 0;
			for(int i = 0; i<array.length;i++){
				if(array[i]%n==0){
					multiplesArray[multipleIndex] = array[i];
					multipleIndex++;
				}
			}
		}
		else{
			multiplesArray = new long[0];
		}
		return multiplesArray;
		
	}
}