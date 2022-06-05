import java.util.Scanner;

public class sum_of_array {

    //Sum of an given array one dimension

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int array[] = new int[5];

        for(int i = 0 ; i<5; i++){

            //user input 

            array[i] = sc.nextInt();

        }
        
        //passing an array to a method
        sum(array);
    
    }

    public static void sum(int[] array){

        int sum = 0;

        for(int i = 0; i<array.length;i++){
            sum+=array[i];

            System.out.println("sum of an array " +sum);
        }
    }
    
}
