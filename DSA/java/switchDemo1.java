import java.util.Scanner;

//import java.util.Scanner;
//
//class switchDemo1{
//    public static void main (String args[]){
//       Scanner in=new Scanner(System.in);
//       int Days=in.nextInt();
//       switch(Days) {
//           case 1:
//               System.out.println("monday");
//               break;
//           case 2:
//               System.out.println("Tuesday");
//               break;
//           case 3:
//               System.out.println("wednesday");
//               break;
//           case 4:
//               System.out.println("Thrusday");
//               break;
//           case 5:
//               System.out.println("Friday");
//               break;
//           case 6:
//               System.out.println("Saturday");
//               break;
//           case 7:
//               System.out.println("Sunday");
//               break;
//           default:
//           }
//               System.out.println("Enter a valid number:- ");
//
//       }
//
//    }
class switchDemo{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int Days=in.nextInt();
        switch(Days){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
        }
    }
}