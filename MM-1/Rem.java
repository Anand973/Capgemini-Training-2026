import java.util.*;
public class Rem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> st=new HashSet<>();
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!st.contains(s.charAt(i))){
                ss.append(s.charAt(i));
            }
        }

 System.out.println(ss.toString());
    }
}
