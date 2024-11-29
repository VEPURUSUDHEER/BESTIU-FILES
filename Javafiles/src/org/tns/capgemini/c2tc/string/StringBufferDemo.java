package org.tns.capgemini.c2tc.string;

public class StringBufferDemo {      //thread safety

	public static void main(String[] args) {
     StringBuffer buffer=new StringBuffer("start\n");
     Thread thread1=new Thread(()->{
    	 buffer.append("message from thread1\n");
    	 
     });
     Thread thread2=new Thread(()->{
    	 buffer.append("message from thread2\n");
     });
     thread1.start();
     thread2.start();
     
     try {
    	 thread1.join(); //wait here untill thread1 is done
    	 thread2.join(); //wait here untill thread2 is done
     }
     catch(Exception e) {
    	 System.out.println(e);
     }
     System.out.println("final stringbuffer is  "   +buffer.toString());
     
	}
}
     
     