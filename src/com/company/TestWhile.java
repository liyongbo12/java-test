package com.company;

import java.util.Scanner;

public class TestWhile {
    public static void main(String[] args) {
        int i = 1;
        int n = 1;
        while(i <= 5){
            n = n*i;
            i ++ ;

        }
        System.out.println(n);
    }
}
class Test3{
    public static void main(String[] args) {
        int num = 1;
        int re = 1;
        do {
            re*=num;
             ++num;
        }while (num <=10);
            System.out.println(re);
        }
    }
class Test4{
    public static void main(String[] args) {
        int bookIndex = 1;
        do {
            System.out.println(bookIndex);
            if (bookIndex % 10 == 0){
                System.out.println();
            }
            bookIndex ++;
        }while (bookIndex < 51);

        }
    }
class Test5 {
    //嵌套循环就是把内层循环当成外层循环的循环体。当只有内层循环的循环条件为 false 时，才会完全跳出内层循环，才可以结束外层循环的当次循环，开始下一次循环
    public static void main(String[] args) {
        // 外层循环
        for (int i = 1; i <= 9; i++) {
            // 内层循环
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
class Test6{
    //则 label 标签所代表的最外层循环终止。
    public static void main(String[] args) {
        label:for (int i = 0; i< 10 ;i++){
            for (int j = 0; j<8;j++){
                System.out.println(j);
                if (j % 2 !=0){
                    break label;
                }
            }
        }
    }
}
class Test7{
    public static int num(int x,int y){
        if (y == 1 || y == x){
            return 1;
        }
        int c = num(x - 1,y - 1)+num(x - 1,y);
            return c;
        }

        public static void calculate(int row){
        for (int i = 1;i<row;i++){
            for (int j=1;j<=row - i; j++){
                System.out.println("");
            }
            for (int j = 1; j<=i; j++){
                System.out.println(num(i,j)+"");
            }
            System.out.println();
        }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        calculate(i);

    }
}


