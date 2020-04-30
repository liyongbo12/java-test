package com.company;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("请输入");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int sum = 5;
        switch (i){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            default:
                System.out.println("--------------");
                break;
        }
    }

}
