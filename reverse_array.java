import java.util.Scanner;

public class reverse_array {


    static void reverse(int arr[], int n){

        int b [] = new int[n];
        int j = n;
        for(int i = 0; i<n; i++){
            b[j-1] = arr[i];
            j= n-1;
        }

        for(int k = 0; k<n; k++){

            System.out.println(b[k]);
        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        reverse(arr, n);
     }
    
}
