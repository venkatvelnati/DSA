import java.util.*;
import java.io.*;
public class A_Countdown{
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
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            String st=s.next();
            int c=0;
            if(st.charAt(st.length()-1)!='0'){
                c+=Integer.parseInt(Character.toString(st.charAt(st.length()-1)));
            }
            for(int i=0;i<st.length()-1;i++)
            {
                if(st.charAt(i)!='0'){
                    c+=Integer.parseInt(Character.toString(st.charAt(i)))+1;
                }
            }
            System.out.println(c);
        }
    }
}