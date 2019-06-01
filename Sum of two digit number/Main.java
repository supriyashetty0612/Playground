import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
        Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int extwo_dgt=num%10;
      int last_dgt=(num%100)/10;
      int sum=extwo_dgt+last_dgt;
      System.out.println(sum);
	}
}