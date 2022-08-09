import java.util.Scanner;

public class max_minvalues_arr {

    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;


        for(int i = 0; i<arr.length; i++){

            if(arr[i]<min){
                min = arr[i];
            }

            if(arr[i]>max){
                max = arr[i];
            } 

        }

        System.out.println(min);

        System.out.println(max);
        

       
    }
    
}
