import java.util.Scanner;

public class spiral_order_matrix {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];


        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("The spiral order matrix is: ");

        int row_start = 0;
        int row_end = n-1;
        int column_start = 0;
        int column_end = m-1;


        while(row_start<=row_end && column_start<=column_end){


            //1
            for(int col=column_start; col<=column_end; col++){
                System.out.print(matrix[row_start][col]+ " ");
            }

            row_start++;

//2

            for(int row=row_start;row<=row_end;row++){
                System.out.print(matrix[row][column_end]+ " ");
            }

            column_end--;

//3

            for(int col=column_end; col>=column_start; col--){

                System.out.print(matrix[row_end][col]+ " ");

            }

            row_end--;


            for(int row=row_end; row>=row_start; row--){
                System.out.print(matrix[row][column_start]+ " ");
            }

            column_start++;

            System.out.println();


        }
    }
    
}
