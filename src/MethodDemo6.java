
public class MethodDemo6 {
	public static void main(String[] args) {
		int [] array = new int[] {5,9};
		System.out.println("Before swap : a="+array[0]+",b ="+array[1]);
		swap(array);
		System.out.println("After swap : a="+array[0]+",b ="+array[1]);
	}
	static void swap(int [] array) {
		System.out.println("In method, before swap : c ="+array[0]+",d="+array[1]);
		int temp = array[0]; array[0]=array[1]; array[1]= temp;
		System.out.println("In method, after swap : c ="+array[0]+",d="+array[1]);
	}
}

