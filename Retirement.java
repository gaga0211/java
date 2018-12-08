import java.util.*;
public class Retirement{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("How much money do you need to retire?");
		double goal = in.nextDouble();

		System.out.print("How much will you contribute every year?");
		double payment = in.nextDouble();

		System.out.print("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		while (balance < goal){
			balance += payment;
			double Interest = balance * interestRate / 100;
			balance += Interest;
			years++;
		} 
		System.out.println("You can retire in " + years + " years.");

		System.out.println("请输入年份：");
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if (((year % 4 == 0) & (year % 100 != 0))|(year % 400 == 0)){
      System.out.println(year + "是闰年");
    }
    else{
      System.out.println(year + "不是闰年");
    }
  }
}