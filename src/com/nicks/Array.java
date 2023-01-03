package com.nicks;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int [] num = {6,1,1,2,3,3,4,5,0,5,8,4,5,6,110,4,2,4,1,2};
        int sum =0;
        int temp=num[0];
        int smallest=num[0];
        Arrays.sort(num);
        // Find the duplicate in array
        for (int i = 0; i < num.length; i++) {
            int count=0;
            for (int j=i+1; j <num.length ; j++) {
                if(num[i]==num[j]){
                    count++;
                }
            }
            if(count!=0){
                System.out.println(num[i] + " is repeated " + count + " times");
            }
            if(temp<num[i]){
                temp=num[i];
            }
            if (smallest>num[i]) {
                smallest=num[i];
            }
            //find the sum of the array
            sum += num[i];
        }
        System.out.println(temp);
        System.out.println(smallest);
        System.out.println("The sum of the array is " + sum);
    }

}
