import java.util.*;
public class main{
    public static int pattern(int n){
    	for(int i=1; i<=n; i++){
    		for(int j=1; j<=n-i; j++){
    			System.out.print(" ");
    		}
    		for(int j=1; j<=i; j++){
    			System.out.print(" *");
    		}
    		System.out.println();
    	}
    	return n;
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 'n': ");
		int n = sc.nextInt();
		System.out.println();
		
		pattern(n);
	}
}
