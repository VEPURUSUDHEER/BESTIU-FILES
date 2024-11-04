package org.tns.capgemini.c2tc.Scannerclass_BufferReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\sudhe\\OneDrive\\Desktop\\file1.txt"));
		String data="";
		while((data=br.readLine())!=null) 
			{
			System.out.println(data);
			}
		br.close();
}
}