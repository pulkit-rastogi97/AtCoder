import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProblemB {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String[] str = new String[4];
		for(int i = 0; i < str.length; i++) {
			str[i] = scan.next();
		}
		
		String isGoodString;
		
		//1st Approach Using Space
		isGoodString = UsingExtraSPace(str);
		
		//2nd Approach Without Space
		isGoodString = WithoutSpace(str);
		
		System.out.println(isGoodString);
	
	}

	private static String UsingExtraSPace(String[] str) {
		Set<String> hashSet = new HashSet<String>();
		for (int i = 0; i < 4; i++) {
			if (hashSet.add(str[i]) == false) {
				return "No";
			}
		}
		return "Yes";
	}

	private static String WithoutSpace(String[] str) {
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str.length; j++) {
				if(i != j && str[i] == str[j])
					return "No";
			}
		}
		return "Yes";
	}
}
