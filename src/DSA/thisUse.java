package DSA;

import java.util.Scanner;
class cat{
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    
    void sound(){
        System.out.println("Mew mew.");
    }
}
class detail extends cat{

    void input(){
        name=sc.nextLine();
        age=sc.nextInt();
    }
    void get(){
        System.out.println(name);
        System.out.println(age);
    }
}


public class thisUse {
    public static void main(String[] args) {
       detail d = new detail();
    //    d.input();
    //    d.get();
        d.sound();
    }
}
