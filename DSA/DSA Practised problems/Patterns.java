
public class Patterns {
    public static void main(String[] args) {
        pattern28(5);

    }

    static void pattern1(int n){
        for (int i=0;i<=n;i++){
            //for every row ,run the col.😶‍🌫️
            for(int j=0;j<=i;j++){
                System.out.print(" * ");
            }
            //when one row is printed ,we need to add a new line
            System.out.println( );
        }
    }
    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int r=0;r<=n;r++){
            for(int c=0;c<=n-r;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i=1;i<=n;i++){
            //for every row ,run the col.😶‍🌫️
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
                //here we r printing one to five  numbers .
            }
            //when one row is printed ,we need to add a new line
            System.out.println( );
        }
    }
    static void pattern5(int n){
        for(int row=0;row<2*n;row++){
            int totalColsInRow=row > n ? 2*n -row:row;
            for(int col=0;col<totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for(int row=0;row<2*n;row++){
            int totalColsInRow=row > n ? 2*n -row:row;

            int noOfSpaces = n-totalColsInRow;
            for(int s=0;s< noOfSpaces;s++){
                System.out.println(" ");
            }

            for(int col=0;col<totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}




















