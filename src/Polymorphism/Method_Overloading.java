package Polymorphism;

class Method_Overloading {

 public int disp(int a){
     return a;
 }

 public String disp(String name){
        return name;
    }

    public static void main(String[] args) {
        Method_Overloading mm = new Method_Overloading();
        System.out.println(mm.disp(12))
        ;
        System.out.println(mm.disp("Manu"));
    }
}
