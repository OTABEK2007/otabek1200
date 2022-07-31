package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 18;
        int sum = 0;

        for(int i=0; i<=a; i++){
            if( i % 5 == 0){
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
