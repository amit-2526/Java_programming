import java.util.ArrayList;
import java.util.Scanner;

public class arraylist_input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for(int i = 0; i<n;i++){
            list.add(sc.nextInt());
        }

        System.out.println(list);


    }

    
    
}
