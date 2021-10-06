import java.util.*;
import java.io.*;
public class A_HQ9_{
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
        int f=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='H' ||st.charAt(i)=='Q' ||st.charAt(i)=='9'){
                f=1;
                break;
            }
        }
        if(f==1 )
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}