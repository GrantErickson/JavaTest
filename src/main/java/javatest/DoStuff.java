package javatest;

public class DoStuff {
    int x;
    int y;
    
    public DoStuff() {
        x=1;
        y=2;
    }
    
    public DoStuff(int a, int b) {
        x=a;
        y=b;
    }

    public int multiply(){
        return x*y;
    }

    
    public int add(){
        return x+y;
    }
}