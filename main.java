import java.util.*;
public class main{
	public static void main(String[] args){
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the value of 'n': ");
		int n = x.nextInt();
		System.out.println();
		//Main loop
		for(int i=1; i<=n; i++){
		    //spaces
		    for(int j=1; j<=n-i; j++){
		    	System.out.print(" ");
		    }
			//pattern
			for(int j=1; j<=i; j++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
