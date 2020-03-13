package ex1.io;
import java.util.Scanner;

public class Program {
	static Scanner scan = new Scanner(System.in);
	static int sumof(int[]a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.print("요소의 수 : ");
		int n=scan.nextInt();//요소의 수
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();//a배열의 요소 값 입력하기
		}
		System.out.println("배열 요소 수의 합은 "+sumof(a));
	}

}

