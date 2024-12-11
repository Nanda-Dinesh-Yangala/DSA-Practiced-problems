public class Maximum {
    public static void main(String args[]){
        int num[]={24,46,63,23,532,2};

        System.out.println(max(num));
    }
    static int max(int num[]){
        int ans=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>ans){
                ans=num[i];
            }
        }return ans;
    }
}
