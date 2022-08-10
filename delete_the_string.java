import java.util.Scanner;

public class delete_the_string {


    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String email = sc.nextLine();
        String g ="";

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i)=='@'){
                break;
            }else{
                g += email.charAt(i);
            }
        }

        System.err.println(g);   
    
    }
    
}
