package info.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tax_Calculation {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Actual Amount");
		int amount = Integer.parseInt(bufferedReader.readLine());
		
		System.out.println("Enter Interst");
		double interst = Double.parseDouble(bufferedReader.readLine());
		
		System.out.println("Enter Duration");
		double time = Double.parseDouble(bufferedReader.readLine());
		
		Double interest=(amount*interst*time)/100;
		
		System.out.println("Total Amount :"+interest);
	}

}
