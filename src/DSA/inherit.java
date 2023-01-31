package DSA;

import java.util.Scanner;

class A{
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    String name;
    int age;
    String address;
    void get(){
        System.out.println("Enter name ::");
        name = sc1.nextLine();
        System.out.println("Enter address :: ");
        address = sc1.nextLine();
        System.out.println("Enter age :");
        age = sc.nextInt();
    }
    void print(){
        System.out.println("Name = "+ name);
        System.out.println("Age = "+ age);
        System.out.println("Address = "+ address);
    }
}

public class inherit {
    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter number of people to print detail :: ");
        int num = sc1.nextInt();

        A obj[] = new A[num];
        for(int i=0; i<num; i++){
            obj[i]=new A();
            obj[i].get();
           
        }
        System.out.println("Detail are :: ");
        System.out.println();
        for(int i=0; i<num; i++){
            obj[i].print();
        }

    }
}
