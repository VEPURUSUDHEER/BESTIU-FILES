package org.tns.capgemini.c2tc.LambdaExpression;

@FunctionalInterface    
interface Drawable{  
    public void draw();  
}  
public class withLambdaExp {  
    public static void main(String[] args) {  
        int width=10;    
        //with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw();  
    }  
}  
