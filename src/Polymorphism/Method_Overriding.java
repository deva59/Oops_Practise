package Polymorphism;





class abc{
    public int disp(int a, int b){
        return a+b;
    }
}
class Method_Overriding extends abc {
    public int disp(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Method_Overriding mm = new Method_Overriding();
        System.out.println(mm.disp(12,16));
        System.out.println(mm.disp(45,23));
    }
}
