import java.util.*;
import java.io.*;
public class A_Stones_on_the_Table{
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
        int n=s.nextInt();
        String st=s.next();
        int c=0;
        while(!isN(st)){
            for(int i=0;i<st.length()-1;i++){
                if(st.charAt(i)==st.charAt(i+1)){
                    st=st.substring(0,i)+st.substring(i+1,st.length());
                    c++;
                } 
            }
        }
        System.out.println(c);
    }

    public static boolean isN(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1))
                return false;
        }
        return true;
    }
}