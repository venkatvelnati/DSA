import java.util.*;
import java.io.*;
public class A_Kefa_and_First_Steps{
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
        int prev=s.nextInt(),c=1,max=0;

        for(int i=1;i<n;i++){
            int x=s.nextInt();
            if(x>=prev){
                c++;
                prev=x;
            }
            else{
                max=Math.max(c,max);
                c=1;
            }
        }
        max=Math.max(c,max);
        System.out.println(max);
    }
}