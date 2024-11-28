package Abstraction;

interface phone{
   void show();
}
interface Smartphone{
    void disp();
}
public class mobile implements phone,Smartphone {
    @Override
    public void show() {
        System.out.println("Hello Word");
    }

    public static void main(String[] args) {

        mobile mm = new mobile();
        mm.show();
        mm.disp();
    }

    @Override
    public void disp() {
        System.out.println("The India Is Smart Country");
    }
}
