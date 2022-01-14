package myCode;
import java.util.*;

public class NewPassword {
	static String GeneratePassword(int len) {
		String capLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetter="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String symbols="!@#$%^&*()_-<>/*-+?/";
		String expression=capLetter+smallLetter+numbers+symbols;
		Random random=new Random();
		//char[] password=new char[len];
		String password="";
		for(int i=0;i<len;i++) {
			password=password+expression.charAt(random.nextInt(expression.length()));
			
		}
		
		return password;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Password Length => ");
		int length=sc.nextInt();
		System.out.println("Your New Password Suggestions are => ");
		for(int i=0;i<3;i++) {
			System.out.println();
			System.out.println("\t"+(i+1)+"). "+GeneratePassword(length));
		}
		

	}

}
