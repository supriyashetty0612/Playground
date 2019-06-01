import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
        Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int extwo_dgt=num%100;
      int finfirst_dgt=extwo_dgt/10;
      System.out.println(finfirst_dgt);
	}
}