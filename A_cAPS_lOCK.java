import java.util.*;
import java.io.*;
public class A_cAPS_lOCK{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() { return Integer.parseInt(next()); }
        
        long nextLong() { return Long.parseLong(next()); }
        
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String args[]) {
        FastReader s = new FastReader();
        String st=s.next();
        String t=st.substring(1);

        if(st.length()==1){
            if(Character.isLowerCase(st.charAt(0)))
                System.out.println(st.toUpperCase());
            else
                System.out.println(st.toLowerCase());
        }
        
        else if(t.toUpperCase().equals(st.substring(1))){
            if(Character.isLowerCase(st.charAt(0)))
                System.out.print(Character.toUpperCase(st.charAt(0)));
            else
            System.out.print(Character.toLowerCase(st.charAt(0)));
            System.out.println(st.substring(1).toLowerCase());
        }
        else
            System.out.println(st);
    }
}
