package assignment05;
import java.util.Arrays;

public class Tester1{
	public static void main(String[] args){
		long[] array1 = {1,2,3,4,5,6,7,8,9};
		long[] array2 = {};
		long[] array3 = null;
		long[] array4 = {23578L, 500000L,23213L, 232421L};
		
		Question1 qArray1 = new Question1(array1.length);
		Question1 qArray2 = new Question1(array2.length);
		Question1 qArray3 = new Question1(1);
		Question1 qArray4 = new Question1(array4.length);

		qArray1.insert(array1);
		System.out.println(Arrays.toString(qArray1.multiples(2)));
		
		qArray2.insert(array2);
		System.out.println(Arrays.toString(qArray2.multiples(2)));
		
		qArray1.insert(array3);
		System.out.println(Arrays.toString(qArray3.multiples(2)));
		
		qArray4.insert(array4);
		System.out.println(Arrays.toString(qArray4.multiples(2)));
	}
}