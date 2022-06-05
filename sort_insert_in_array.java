import java.util.Arrays;
import java.util.Scanner;

//Insert eleent at the end of an array than sort it.

public class sort_insert_in_array{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        //Input a number to be inserted
        int given_no = sc.nextInt();

        int array [] = {4,8,3,7,9,23,54,89};
        
        //new Array
        int new_array [] = new int[array.length + 1];

        //Copy the Element to new Array
        for(int i = 0; i<array.length; i++){
            new_array[i] = array[i];
        }
        
        //Element Insertion
        new_array[new_array.length-1] = given_no;

        //Sort function

        Arrays.sort(new_array);

        for(int i = 0; i<new_array.length; i++){

        System.out.print(" "+ new_array[i]);
    }

}
}
