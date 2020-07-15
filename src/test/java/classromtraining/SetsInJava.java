package classromtraining;

import java.util.HashSet;
import java.util.Set;

public class SetsInJava {

    public static void main(String[] args) {

        Set<Integer> mySetValues=new HashSet<Integer>();
        mySetValues.add(1);
        mySetValues.add(2);
        mySetValues.add(2);
        mySetValues.add(3);
        mySetValues.add(26);
        mySetValues.add(27);


        System.out.println(mySetValues);
//# how to access the values from the set
        System.out.println(mySetValues);
        for (Integer i:mySetValues) {
            System.out.println(i);
        }


    }
}
