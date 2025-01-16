package subset;

public class Recursion_patterns {
    public static void main(String[] args) {
         triangle(5,0);
    }
    static void triangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            triangle(r,c+1);
            System.out.print("* ");
// here we r printing triangle * using recrusion
        }else{
            triangle(r-1,0);
            System.out.println();

        }
    }
}
