public class hasNext_func {

    //use of hasNext function
  //Formatting of String

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        for(int i = 1; scan.hasNext()== true; i++){
            System.out.println(i + " " + scan.nextLine());

        }
    }

}
