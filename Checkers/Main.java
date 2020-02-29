import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Gameboard g=new Gameboard(true);
		Scanner scan=new Scanner(System.in);
		System.out.println(g.toString());
		System.out.println(g.toString());
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		while(x != 26){
			System.out.println(g.kingMe(x, y));
			System.out.println(g.toString());
			x = scan.nextInt();
			y = scan.nextInt();
		}
	}
}
