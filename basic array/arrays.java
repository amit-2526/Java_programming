import java.util.Scanner;





//Take an array as input from the user.
//Search for  given no x and print the index at which it occurs.
public class arrays {
    

    public static void main(String [] args) {

        

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
       

        int [] arr = new int[n];

       // System.out.println(n);//

        for(int i = 0; i<n; i++){

            arr[i]=sc.nextInt();
        }


        System.out.println("Enter the searching no");

        int f = sc.nextInt();

         for(int i=0; i<n; i++){
            if(arr[i]==f){
                System.out.println("x is found at : "+ i);
            }
         }

          

        }
        
    }

