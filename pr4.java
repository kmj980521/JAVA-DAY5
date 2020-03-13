package ex1.io;
import java.util.Scanner;

public class HowAreYou1 {
	static Scanner scan = new Scanner(System.in);
	static int aryRmv(int[]a,int idx)
	{
		for(int i=idx;i<a.length-1;i++) {
		a[i]=a[i+1];
		}
		if(idx==a.length-1) //배열 요소의 마지막을 삭제하려면 0으로 초기화
		{
			a[idx]=0;
		}
		return 0;
	}
	static boolean find(int[]a,int n)
	{
		int k=n;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
				return true;
		}
		return false;
	}
	static int findidx(int[]a,int n)
	{
		int k=n;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.print("배열 요소의 수: ");int num=scan.nextInt();
		int[]a=new int[num]; //입력받은 수만큼 배열 생성.
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		do {
		System.out.print("삭제하고 싶은 값: ");int num2=scan.nextInt();
		if(find(a,num2))
		{
			System.out.println("삭제하려는 값이 존재합니다. 삭제를 진행하겠습니다.");
			int idx=findidx(a,num2); //삭제하려는 값의 인덱스 값을 받음.
			aryRmv(a,idx);
			break;
		}
		else
			System.out.println("삭제하려는 값이 존재하지않습니다. 재실행 해주세요.");
		}while(true);
		System.out.println("삭제된 배열의 결과입니다 ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}

