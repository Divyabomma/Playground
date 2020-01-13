import java.util.Scanner;
class Main
{
	public static void main (String[] args) 
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int fd_n1 = n/100;
      int ld_n2 = n%10;
      int sum = fd_n1 + ld_n2;
      System.out.println(sum);
	}
}