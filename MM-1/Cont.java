import java.util.Scanner;

public class Cont {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        if(s.contains(t)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
