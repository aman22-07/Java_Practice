class Pattern_Problems_1 {
    public static void main(String[] args) {


        int num=20;
       
        pattern6(num);
    }

    public static void pattern1(int num){
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        System.out.println("-----------Pattern 1--------------");
        for (int row=1; row<=5; row++)
        {
            for (int col=1; col<=row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     public static void pattern2(int num){
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        System.out.println("-----------Pattern 2--------------");
         for (int i=1; i<=5; i++)
        {
            // Inner loop for number of stars in each row
            for (int j=5; j>=i; j--)
            {
                System.out.print("*");
            }
            // Move to the next line after printing stars in each row
            System.out.println();
        }
    }
     public static void pattern3(int num){
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        System.out.println("-----------Pattern 3--------------");
         for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1; i<=4; i++)
        {
            for (int j=4; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     public static void pattern4(int num){
        //         *
        //       * *
        //     * * *
        //   * * * *
        // * * * * *
        System.out.println("-----------Pattern 4--------------");
        for (int row=1; row<=num; row++)
        {
            int spaces=num-row;
            while(spaces>0){
                System.out.print(" ");
                spaces--;
            }
            for (int col=1; col<=row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
     }
        public static void pattern5(int num){
            // * * * * *
            //   * * * *
            //     * * *
            //       * *
            //         *
        System.out.println("-----------Pattern 5--------------");
        for (int row=1; row<=num; row++)
        {
            int spaces=0;
            while(spaces<row){
                System.out.print(" ");
                spaces++;
            }
            for (int col=row; col<=num; col++)
            {
                System.out.print("*");
            }
            
            
            System.out.println();
        }
    }

    public static void pattern6(int num){
        //         *
        //       * *
        //     * * *
        //   * * * *
        // * * * * *
        //   * * * *
        //     * * *
        //       * *
        //         *


        for(int row=1;row<=num;row++){
            int spaces=num-row;
            while(spaces>0){
                System.out.print(" ");
                spaces--;
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for(int row=1;row<=num-1;row++){
            int spaces=0;
            while(spaces<row){
                System.out.print(" ");
                spaces++;
            }
            for(int col=num-1;col>=row;col--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
