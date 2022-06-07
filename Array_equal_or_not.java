public class Array_equal_or_not {


    static void matchArray(int a[] , int b[] , int n){
      
      
      //Firstly sort the both array

        Arrays.sort(a);
        Arrays.sort(b);
      

        int c = 1;
        for(int i = 0; i<n; i++){
          //Compare two arrays equal or not
            if(a[i]!=b[i]){
                c = 0;
            }
        }
      
      //If equal then print

            if(c == 0){
                System.out.println(" Not Equal");
            }

            else{
                System.out.println("Equal"); 
            }

           
        }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];


        System.out.println("Enter the elements of first array");

        for(int i= 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.err.println("Enter the elements of second array");

        for(int i = 0; i<n; i++){
            b[i] = sc.nextInt();
        }
      
      //Call the function

        matchArray(a, b, n);

    }
    
}
