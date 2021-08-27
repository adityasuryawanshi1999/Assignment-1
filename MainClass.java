package com.lti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.lti.Converter;
import com.lti.Helper;


public class MainClass{
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Converter c = new Converter() {
			
			@Override
			public void convert(double val, String currency1, String currency2) {
				double res = 0;
				if(currency1.equals("INR")) {
					//logic1
				}
				else if(currency2.equals("INR")) {
					//logic2
				}
				else {
					double ratio1 = Helper.currencyMap.get(currency1)*val;
					res = ratio1/Helper.currencyMap.get(currency2);
				}
				System.out.println("Currency in "+currency2+" is:"+res);
				
			}
		};
		
		/*
		 * while(true) { int a = bf.read(); String b = bf.readLine(); String d =
		 * bf.readLine(); c.convert(a, b, d); }
		 */
		
		c.convert(45, "USD", "AUD");

	}

}
