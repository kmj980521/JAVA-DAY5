package ex1.io;
import java.util.Scanner;
public class Program {
	static int max(int a,int b,int c)
	{
		int max=a;
		if(max<b) max=b;
		if(max<c) max=c;
		
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("세 정수 입력 : ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		System.out.println("세 정수의 최댓값은 "+max(a,b,c)+"입니다.");
		
	}

}

