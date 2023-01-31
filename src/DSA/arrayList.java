package DSA;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> name= new ArrayList<>();
        name.add("Rajesh");
        name.add("Brind sir");
        name.add("Vishwajeet");
        name.add("ranjeet pandey");
        name.add("Satya");
        // System.out.println("Size of Array :: " + name.size());
        // System.out.println("Use of Loop :: ");
        // for(int i=0; i<name.size(); i++){
        //     System.out.print(name.get(i)+" ");
        // }
        // System.out.println();
        // System.out.println(name);
        System.out.println(name.get(0));
        System.out.println("After changing : ");
        name.set(0,"Indrajeet");
        name.set(1,"Brind");
        System.out.println(name);
        name.remove(0);
        name.remove(2);
        System.out.println("After removing index :: ");
        System.out.println(name);
        name.clear();
        System.out.println("After erasing :: ");
        System.out.println(name);
        System.out.println(name.size());
    }
}
