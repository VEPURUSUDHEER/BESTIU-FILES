package org.tns.capgemini.c2tc.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOException {

	public static void main(String[] args) throws FileNotFoundException {
		try {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\sudhe\\OneDrive\\Desktop\\python files.txt"));
		String data = "";
		while((data=br.readLine())!=null)
		{
			System.out.println(data);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}