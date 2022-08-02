
public class ArrayDemo4 {
	public static void main(String[] args) {
		//java Array mango banana apple
//		for(int i = 0; i<args.length;i++) {
//			System.out.println(args[i]+i);
//		}
//		char ch1;
//		char ch2;
//		int count = 0;
//		int []array = new int[2];
//		for(int i = 0 ; i<args.length;i++) {
//			if('0'<=args[i].charAt(0)&&args[i].charAt(0)<='9') {
//				ch1 = args[i].charAt(0);
//				ch2 = args[i].charAt(1);
//				array[count] = (ch1-'0')*10+(ch2-'0');
//				count++;
//			}
//		}
//		int sum = array[0]+array[1];
//		System.out.println(sum);
		
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[2]);
		switch(args[1]) {
		case "+":System.out.printf("%d + %d = %d\n",first,second,(first+second)); break;
		case "-":System.out.printf("%d - %d = %d\n",first,second,(first-second)); break;
		case "x":System.out.printf("%d x %d = %d\n",first,second,(first*second)); break;
		case "/":System.out.printf("%d / %d = %d\n",first,second,(first/second)); break;
		case "%":System.out.printf("%d %% %d = %d\n",first,second,(first%second)); break;
		default: System.out.println("그런 연산자는 없습니다.");
		}
	}
}
