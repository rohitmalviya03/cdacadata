package Assignment_2;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int flag=0;
		// TODO Auto-generated method stub\
		Scanner abc = new Scanner(System.in);
		System.out.println("enter a integer");
		int x= abc.nextInt();
     int y=x/2;
     for(int i=2; i<y; i++) {
    	 if(x%i==0) {
    		 System.out.println(x+" is not prime");
    		 flag=1;
    		 break;
    	 }
    	 
    	
     }
     if(flag==0) {
		 System.out.println(x+" is prime");
		 
	 }
	}

}
