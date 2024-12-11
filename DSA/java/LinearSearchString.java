class LinearSearchString {
    public static void main(String args[]){
        String name="NandaDinesh";
        char target='h';
        System.out.println(linear(name,target));

    }
    static boolean linear(String str,char target){
        if(str.length() == 0){
        return false;
    }
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
//            if(target.equalsIgnoreCase(Character.toString(str.charAt(i)))){
//                return true;
//            }
            // In the above line u r seeing na That  is also one way to print Strings in linear search.
             }
                return false;
        }
    }