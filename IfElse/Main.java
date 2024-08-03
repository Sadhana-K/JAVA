import java.util.Scanner;

 public class Main {
	public static void main (String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("has medical cause");
	   String cause=scanner.nextLine();
		if(cause=="yes"){
		    System.out.println("not Allowed ");
		}
		else
	    	System.out.print("Allowed to sit in exam hall");
	}
 }