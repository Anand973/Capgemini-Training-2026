import java.util.*;
public class Cnv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int u=0;
        int l=0;
for(char ch:s.toCharArray()){
    if(Character.isUpperCase(ch)){
u++;
    }
    else{
l++;
    }
}
 if(u>l){
        System.err.println(s.toUpperCase());
    }
    else{
        System.out.println(s.toLowerCase());
    }
    }
   
}
