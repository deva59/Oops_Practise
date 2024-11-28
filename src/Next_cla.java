import javax.lang.model.element.Name;

class bbc {
    private int roll;
    private String name;

    public void setS(int rollno){
        roll=rollno;
    }
    public int getS(){
        return roll;
    }

    public void setName(String Name){
        name=Name;
    }

    public String getName(){
        return name;
    }
}
class Next_cla{
    public static void main(String[] args) {
        bbc cc = new bbc();
        cc.setS(202);
        System.out.println(cc.getS());
        cc.setName("Raja");
        System.out.println(cc.getName());
    }
}
