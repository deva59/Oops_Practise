 class sdt {

    private int a;
    private String name;

    public void setb(int E_id){
        a=E_id;
    }
    public  int getb(){
        return a;
    }

    public void setname(String Name){
        name=Name;
    }
    public String getname(){
        return name;
    }
}

class Encapsulation{
    public static void main(String[] args) {
        sdt ss = new sdt();
        ss.setb(101);
        System.out.println(ss.getb());
        ss.setname("Devendra");
        System.out.println(ss.getname());
    }
}