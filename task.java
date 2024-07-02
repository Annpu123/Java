package day;

import java.util.ArrayList;

public class task {
   public static void main(String[] arge){
    ArrayList<Integer> L1= new ArrayList<Integer>();
    L1.add(0,1);
    L1.add(0,2);
    L1.add(0,3);
    L1.add(0,4);
    L1.add(0,5);

    System.out.println(L1);

    //size
    System.out.println(L1.size());

    //add
L1.add(0,6);

System.out.println(L1);

//remove
L1.remove(2);
System.out.println(L1);


   } 



}
