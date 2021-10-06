import java.util.*;
import java.io.*;
public class Maximum_Light_Up{
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
        int t = s.nextInt();
        while(t-->0){
            int p=s.nextInt();
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int x=s.nextInt();
            int y=s.nextInt();


           

            long sum=0,left=0;
            long sum2=0,left2=0;

            int f1=0,f2=0;
            if( b+(x*a) > p && c+(y*a)>p)
                System.out.println("0");
            else{
                
                    sum =(p/(b +(x*a)));

                    left= p- (sum * (b+(x*a)));
        
                    sum+= (left/(c +(y*a)));
                 
                 
                     sum2 = (p/(c +(y*a)));
                     left2= p- (sum2 * (c+(y*a)));
     
                     sum2 = (left2/(b +(x*a)));
                 
                 System.out.println(Math.max(sum,sum2));
                
            }
        }
    }
}