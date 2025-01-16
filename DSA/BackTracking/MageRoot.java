package BackTracking;

public class MageRoot {
    public static void main(String[] args) {
        System.out.println(mage(3,3));
         
    }
    static int mage(int r,int c){
        if(r==1 || c==1){
            return 1;
        }

        int left=mage(r-1,c);
        int right=mage(r,c-1);
        return left+right;

    }


}