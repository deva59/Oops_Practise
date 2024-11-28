import java.util.ArrayList;

public class ArrayList_Addtion {
    public static void main(String[] args) {
        ArrayList<Integer> aa = new ArrayList<Integer>();

        aa.add(1);
        aa.add(2);
        aa.add(3);
        aa.add(4);
        aa.add(5);

        int sum = 0;


//        while (i < aa.size()) {
//            sum += aa.get(i);
//            i++;
//        }


        for(int num: aa){
            sum += num;
        }
//
//        for(int i=0; i<aa.size();i++) {
//            sum + = aa.get(i);
//        }

        System.out.println(sum/aa.size());
    }
}
