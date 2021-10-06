import java.util.*;
import java.io.*;
public class B_Two_Tables{
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
        while(t-->0)
        {
            int w=s.nextInt();
            int h=s.nextInt();

            int x1=s.nextInt();
            int y1=s.nextInt();
            int x2=s.nextInt();
            int y2=s.nextInt();
            
            int sw=s.nextInt();
            int sh=s.nextInt();

            if((x2-x1)+sw >=w || (y2-y1)+sh>=h)
                System.out.println("-1");
            else
            {

            }

        }
    }
}