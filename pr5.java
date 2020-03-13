package ex1.io;
import java.util.Scanner;

public class Program {
	static Scanner scan = new Scanner(System.in);
	static int[]arraysearch(int[]a,int x)
	{
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
				count++;
		}
		int[]c= new int[count];
		count=0;
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				c[j]=i;
				j++;
			}
		}
		return c;
	}
	public static void main(String[] args) {
		
		System.out.print("배열 요소의 수 : ");int num1=scan.nextInt(); //a배열 요소수
		int[]a=new int[num1]; //배열 할당
		System.out.println("배열의 요소 값 입력");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.print("찾고싶은 값(해당하는 값의 index가 새로운 배열의 요소의 값으로 바뀝니다.): ");int num2=scan.nextInt();
		int[]result=arraysearch(a,num2); //a배열과 찾고싶은 값num2를 전달
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]);
		}
	}

}


