package com.company;


//枚举的用法
public class EnumTest{

    public static void main(String[] args) {
        Food.Coffee.BLACK_COFFEE.getData();

        Integer name1 = 3;
        Integer name = Color.getName(3);
        System.out.println(name == name1);

    }
}
 interface Food {
    enum Coffee implements Food{
        BLACK_COFFEE(0,"正确"),DECAF_COFFEE(1,"失败"),LATTE(3,"对"),CAPPUCCINO(2,"错");
        private Integer data;
        private String msg;

        Coffee(Integer data, String msg) {
            this.data = data;
            this.msg = msg;
        }

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

     enum Dessert implements Food{
        FRUIT, CAKE, GELATO;
    }
}
 enum Color {
     RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
     // 成员变量
     private String name;
     private int index;

     Color(String name, int index) {
         this.name = name;
         this.index = index;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getIndex() {
         return index;
     }

     public void setIndex(int index) {
         this.index = index;
     }

     /**
      *  这里可以修改返回枚举名字
      * @param index
      * @return
      */
     public static Integer getName(int index) {
         for (Color c : Color.values()) {
             if (c.getIndex() == index) {
                 return c.index;
             }
         }
         return null;
     }

 }

