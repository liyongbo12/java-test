package com.company;

import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {
        System.out.println("请输入");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int sun = 1;
        switch (i){
            case 1:
                switch (sun){
                    case 0:
                        System.out.println("1");
                        break;
                    case 1:
                        System.out.println("2");
                        break;
                    case 2:
                        System.out.println("3");
                        break;
                }
        }
    }


}
