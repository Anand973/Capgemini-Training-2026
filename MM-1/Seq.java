import java.util.*;
public class Seq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder st=new StringBuilder();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                int vi=c-1;
                char cc=(char) ('A'+vi);
                st.append(cc);
                c=0;
            }
            else{
                c++;
            }
        }

        System.out.println(st.toString());

    }
}
