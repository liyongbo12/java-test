package com.company;

public enum Size {

    SMALL("S","小号"),
    MEDIUM("M","dahao"),
    LARGE("O","zhonghao");

    private String addr;
    private String tirle;

    private Size(String abbr,String title){
        this.addr = abbr;
        this.tirle=title;
    }
    public String getAddr(){
        return addr;
    }
    public String getTirle(){
        return tirle;
    }
    //d动态
    public static Size fromAddr(String addr){
        for (Size size : Size.values()){
            if (size.getAddr().equals(addr)){
                return size;
            }
        }
        return null;
    }

}
class SizeTest{
    public static void main(String[] args) {
        Size size = Size.MEDIUM;
        int ordinal = Size.MEDIUM.ordinal();
        System.out.println(size.toString());
        System.out.println(size.name());
        System.out.println(ordinal);

        System.out.println(size.SMALL == Size.valueOf("SMALL"));

        for (Size AllSize : Size.values()){
            System.out.println(AllSize);
        }

        Size s = Size.MEDIUM;
        System.out.println(s.getAddr());
        Size.fromAddr("L");
        System.out.println(s.getTirle());


    }
    static void onChosen(Size size){
        switch (size){
            case SMALL:
                System.out.println("chosen small");
                break;
            case MEDIUM:
                System.out.println("chosen medium");
                break;
            case LARGE:
                System.out.println("chosen large");
                break;
        }
    }
}
