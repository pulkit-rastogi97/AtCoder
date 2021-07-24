import java.util.Scanner;

public class ProblemA {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		double C = ((A - B) % 3 );
		
		if(C == 0) {
			int result = ((A - B) / 3 ) + B;
			System.out.print(result);
		}else {
			C = A - B;
			C /= 3;
			C += B;
			System.out.print(C);
		}
	}
}
