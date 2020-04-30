package com.company;

public class Test10 {
    public static void main(String[] args) {
        // 定义存储新闻标题的数组
        String[] news = new String[] { "如何快速掌握Java", "听老王剖析Java中的运算符", "学习Java的十大忠告", "你所不知道的java网络编程技巧大全", "Java面试题大全" };
        String title = "************* 新闻列表 *************";
        System.out.println(title.substring(10, 30));
        System.out.println("----------------------------------------------");
        /*
         * 循环遍历数组截取数组元素中的前10个字符作为列表展示
         */
        for (int i = 0; i < news.length; i++) {
            // 判断数组元素的长度是否大于10，如果大于，则截取，否则全部显示
            if (news[i].length() > 10) {
                System.out.println(news[i].substring(0, 10) + "…");
            } else {
                System.out.println(news[i]);
            }
        }
    }
}
class Test11{
    public static void main(String[] args) {
        String words = "hello java,hello php";
        System.out.println("原始字符串是'"+words+"'");
        System.out.println("replace(\"l\",\"D\")结果："+words.replace("l","D"));
        System.out.println("replace(\"hello\",\"你好\")结果："+words.replace("hello","你好 "));
        words = "hr's dog";
        System.out.println("原始字符串是'"+words+"'");
        System.out.println("replace(\"r's\",\"is\")结果："+words.replace("r's","is"));
    }
}
