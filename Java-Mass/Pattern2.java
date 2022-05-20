public class Pattern2 {
    public static void main(String[] args) {
        int n = 6;
        int start = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == i)
                    System.out.print(start);
                else
                    System.out.print(start + "*");
                start++;
            }
            System.out.println();
        }
        /*
         * 1 0*0+1
         * 2 3 1*1+1
         * 4 5 6 2*2+1
         * 7 8 9 10 3*3+1
         * 11 12 13 14 15 4*4-1
         * 
         * 
         * 
         */
    }
}
