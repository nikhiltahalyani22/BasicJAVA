package com.nicks;

public class FOO {

    public static void main(String[] args) {
        System.out.println("Hello World");
        ABC obj1 = new ABC();
        int c = obj1.sum(10,20);
        System.out.print(c);

    }
}

class ABC{

    int c;
    public int sum(int a , int b){
        int c=a+b;
        return c;
    }
}
