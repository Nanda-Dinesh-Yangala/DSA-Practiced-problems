import java.util.*;
public class nestedSwitch {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int emp_Id=in.nextInt();
        String Department=in.next();
        switch(emp_Id){
            case 1:
                System.out.println("nanda Dinesh");
                break;
            case 2:
                System.out.println("dinesh");
                break;
            case 3:
                switch(Department){
                    case "computer":
                        System.out.println("Computer science ");
                        break;
                    case "Ece":
                        System.out.println("electronical engineering");
                        break;
                    default:
                        System.out.println("enter vaild num:-");
                }
            default:
                System.out.println("Enter valid number raa");




        }

    }
}
