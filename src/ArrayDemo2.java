import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int [][]array= {
				{1,2,3,4,5},
				{10,9,8,7,6,5,4,3,2,1}
		};
		System.out.println("Before Swapping");
		System.out.println("<<0층>>");
		System.out.println(Arrays.toString(array[0]));
		
		System.out.println("<<1층>>");
		System.out.println(Arrays.toString(array[1]));
		int []swap;
		swap = array[0];
		array[0] = array[1];
		array[1] = swap;
		
		System.out.println("After Swapping");
		System.out.println("<<0층>>");
		System.out.println(Arrays.toString(array[0]));
		
		System.out.println("<<1층>>");
		System.out.println(Arrays.toString(array[1]));
	}
}
