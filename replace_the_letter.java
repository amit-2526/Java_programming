import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class replace_the_letter {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String g = "";

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='e'){
                g +='i';
            }else{
                g += s.charAt(i);
            }

           
        }

        System.out.println(g); 
       }
    
}
