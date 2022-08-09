import java.util.Scanner;

public class arr_ques_1 {

    public static void main(String[] args) {
        

       

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String [] str = new String[size];

        for(int i=0; i<size; i++){
            str[i] = sc.next();
        }

        

        System.out.println("names are");

        for(int i=0; i <size; i++){
            System.out.println(str[i]);
        }



        
    }
    
}
