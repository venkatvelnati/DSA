import java.util.*;
public class A_Word {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int l=0,u=0;
        String st=s.next();
        for(int i=0;i<st.length();i++){
            if(Character.isLowerCase(st.charAt(i)))
                l++;
            else
                u++;
        }
        if(u>l)
            st=st.toUpperCase();
        else
            st=st.toLowerCase();
        System.out.println(st);
    }
}