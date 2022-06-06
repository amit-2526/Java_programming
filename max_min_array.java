import java.util.Scanner;

public class max_min_array {

    /*An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
Given an array arr[] of size N, find the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0.
     */
        /*  static int getMax(int array[], int n){
             int res = array[0];
             for(int i = 0; i<n; i++){
                 res = Math.max(res, array[i]);
                 return res;
             }
         }*/
    public static void findMax(int arr[]){
        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                //System.out.println(1);
            }
            if(arr[i]<max){
                min = arr[i];

            }

           
        }

        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        findMax(arr);


    }
    
}
