public class Ex1 {

	public static void main(String[] args) {
		int m[][] = {{2, 3, 5, 7, 11}, {13, 17, 19, 21, 23}, {31, 37, 41, 43, 51}};
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; i < m[i].length; j++) {
				sum += m[i][j];
			}
			
		}
		sum = sum/15;
		System.out.println("Média:" + sum);
	}
}