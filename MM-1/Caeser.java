import java.util.*;

public class Caeser {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<s.length();i++){
             int v=(((s.charAt(i)-'a')+3)%26);
             char ch=(char)('a'+v);
             ss.append(ch);

        }
        System.out.println(ss.toString());

    }
}
