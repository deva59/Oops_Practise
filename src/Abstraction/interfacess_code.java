package Abstraction;


interface car{
    public void Tata();
}
public class interfacess_code implements car {
    @Override
    public void Tata() {
        System.out.println("Tata car has best..");
    }

    public static void main(String[] args) {
        interfacess_code cc = new interfacess_code();
        cc.Tata();
    }
}
