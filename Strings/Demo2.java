package com.java2novice.algos;
 
import java.util.Scanner;
import java.util.Stack;
 
public class Demo2 {
 
    public static void main(String arg[]) {
 
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
 
        Scanner snr = new Scanner(System.in);
        int n = snr.nextInt();
        for(int i=0;i<n;i++) {
            int input = snr.nextInt();
            switch (input){
                case 1:
                    int x = snr.nextInt();
                    stack.push(x);
                    if(maxStack.isEmpty() || x >= maxStack.peek()) {
                        maxStack.push(x);
                    }
                    break;
 
                case 2:
                    int popVl = stack.pop();
                    if(popVl == maxStack.peek()) {
                        maxStack.pop();
                    }
                    break;
 
                case 3:
                    System.out.println(maxStack.peek());
                    break;
 
                default: break;
            }
        }
        snr.close();
    }
}