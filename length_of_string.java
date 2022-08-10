import java.util.Scanner;

public class length_of_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int toLength = 0;

        String [] arr = new String[s];

        for(int i=0; i<s; i++){
            arr[i]=sc.nextLine();
            toLength += arr[i].length();
        }

        System.out.println(toLength);
    }
    
}
