package ex1.io;
import java.util.Scanner;
import java.util.Random;
public class Program {
	static Scanner scan = new Scanner(System.in);
	static boolean retry()
	{
		int num;
		do
		{
			System.out.print("다시 한 번 ? <yes-1/no-0 : ");
			num=scan.nextInt();
		}while(num!=0&&num!=1);
			return num==1;
	}
	public static void main(String[] args) {
		Random rand=new Random();
		
		System.out.println("암산 트레이닝!! ");
		do {
		int x=(rand.nextInt(900)+100);//100~999
		int y=(rand.nextInt(900)+100);
		int z=(rand.nextInt(900)+100);
		int quest=rand.nextInt(4); // 0~3나오게끔
		while(true)
		{
			if(quest==0)
			{
				System.out.print(x+"+"+y+"+"+z+"=");int a1=scan.nextInt();
				if(a1==(x+y+z))break;
				
				System.out.println("틀렸습니다!!");
			}
			else if(quest==1)
			{
				System.out.print(x+"+"+y+"-"+z+"=");int a2=scan.nextInt();
				if(a2==(x+y-z))break;
					
				System.out.println("틀렸습니다!!");
			}
			else if(quest==2)
			{
				System.out.print(x+"-"+y+"+"+z+"=");int a3=scan.nextInt();
				if(a3==(x-y+z))break;
					
				System.out.println("틀렸습니다!!");
			}
			else
			{
				System.out.print(x+"-"+y+"-"+z+"=");int a4=scan.nextInt();
				if(a4==(x-y-z))
					
				System.out.println("틀렸습니다!!");
			}
		}
		}while(retry());
	}

}

