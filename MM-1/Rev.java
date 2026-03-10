import java.util.*;

public class Rev {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     Stack<Integer> st=new Stack<>();
   int n=sc.nextInt();
    for(int i=0;i<n;i++){
        int v=sc.nextInt();
        if(v!=0){
            st.push(v);
        }

    }

    while(!st.isEmpty()){
        System.out.print(st.pop()+" ");
    }



     
 }   
}
