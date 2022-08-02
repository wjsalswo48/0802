
public class Practice1 {
	public static void main(String[] args) {
		int []result = {1,2,3,4,1,2,3,4,1,2};
		int[][] re = {{1,2,2,4,2,2,3,4,1,2},
				{1,2,3,4,1,1,1,4,1,1},
				{1,2,3,4,1,2,3,4,1,2},
				{1,3,3,3,3,3,3,3,1,2},
				{1,2,3,4,1,2,3,1,1,2}
		};
		String [] name = {"한지민","박지민","홍지민","신지민","김지민"};
		
		Student []list = new Student[5];
		int [] count = new int[5];
		for(int i = 0 ; i<list.length;i++) {
			list[i] = new Student();
			list[i].name = name[i];
			for(int j = 0; j<10; j++) {
				list[i].result[j] = re[i][j];
				if(result[j]==list[i].result[j]) {
					list[i].OX[j]='O';
					count[i]++;
				}
				else list[i].OX[j]='X';
			}
		}

		for(int i = 0; i<re.length;i++) {
			for(int j = 0; j<10; j++){
				System.out.print(list[i].OX[j]);
			}
			System.out.print("\t"+(count[i]*10));
			System.out.println();
		}
		
	}
}
