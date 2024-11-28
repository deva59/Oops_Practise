package Abstraction;


abstract class xyz{
      abstract  public void disp();
}
class First_Class extends  xyz {
    public void disp(){
    System.out.println("Its Abstraction Concept");
    }
    public static void main(String[] args) {
      First_Class ff = new First_Class();
        ff.disp();
    }
}
