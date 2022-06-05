import java.sql.Array;

public class Default_values_of_array {

    public static void main(String [] args){
        String str[] = new String[1];
        int array[] = new int[1];
        boolean bool[] = new boolean[1];
        double dou[] = new double[1];
        Array ud[] = new Array[1];
        

        for(String s : str){
            System.out.println("Array of strings");
            System.out.println(s);
        }

        for(int i : array){
        System.out.println("Integer array");
        System.out.println(i);
        }

        for(double d : dou){
        System.out.println("Boolean array");
        System.out.println(d);
        }

        for(boolean b : bool){
        System.out.println("Double array");
        System.out.println(b);
        }

        
        for(Array val : ud){
        System.out.println("User Defined Array");
        System.out.println(val);
        }

    }
    
}
