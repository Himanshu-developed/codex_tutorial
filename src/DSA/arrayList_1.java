package DSA;

import java.util.*;

public class arrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        for(int i=0; i<a.size(); i++){
            System.out.print(a.get(i)+" ");
        }
        System.out.println();

    }
}
