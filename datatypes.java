class datatype{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();

    for (int i = 0; i < T; i++) {
        try {
            long n = sc.nextLong();
            System.out.println(n + " can be fitted in:");
            if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                System.out.println("* byte\n* short\n* int\n* long");
            else if (n>=-32768 && n <= Short.MAX_VALUE)
                System.out.println("* short\n* int\n* long");
            else if (n>=-2147483648 && n <= Integer.MAX_VALUE)
                System.out.println("* int\n* long");
            else
                System.out.println("* long");
        }  
        catch (Exception e) {
        
        System.out.println(sc.next() + " can't be fitted anywhere.");
        }
    }

    sc.close();

}
}
