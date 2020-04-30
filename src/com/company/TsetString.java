package com.company;

public class TsetString {
    public static void main(String[] args) {
        String str = "123";
        int n = 0;

        n = Integer.parseInt(str);
        System.out.println(n);

        n = 0;
        n = Integer.valueOf(str).intValue();
        System.out.println("Integer.parseInt(str) : " + n);

        int num = 10;
        String str2 = Integer.toString(num);
        System.out.println("str2:" + str2);

        //分割字符
        String Colors = "Red,Black,White,Yellow,Blue";
        String[] split = Colors.split(",");
        String[] split1 = Colors.split(",", 3);
        for (int i = 0; i<split.length;i++){
            System.out.println(split[i]);
        }
        for (int i = 0; i < split1.length; i++) {
            String s = split1[i];
            System.out.println(s);
        }
    }

}
