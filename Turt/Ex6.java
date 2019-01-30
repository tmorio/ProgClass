import java.util.*;
public class Ex6{
	public static void main(String[] args){
		int n;
		System.out.print("Input Number(Cancel:^C)>>");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		if (n % 2 != 0){
			System.out.println("Odd");
		} else {
			System.out.println("Even");
		}
	}
}
