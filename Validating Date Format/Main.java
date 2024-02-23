import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int b=UserMainCode.validateDate(s1);
        if(b==1){
        System.out.println("Valid date format");
        }
        else{
        System.out.println("Invalid date format");
        }
        sc.close();
    }
}

