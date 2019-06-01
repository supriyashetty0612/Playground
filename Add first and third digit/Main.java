import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int num1=num/100;
      int num2=num%10;
      int add=num1+num2;
      System.out.println(add);
	}
}