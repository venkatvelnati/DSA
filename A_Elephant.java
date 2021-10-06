import java.util.*;
import java.io.*;
public class A_Elephant{
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
        int x=s.nextInt();
        int c=0;
        while(x>0){
            if(x>=5){
                x-=5;
                c++;
            }
            else if(x>=4){
                x-=4;
                c++;
            }
            else if(x>=3){
                x-=3;
                c++;
            }
            else if(x>=2){
                x-=2;
                c++;
            }
            else if(x>=1){
                x-=1;
                c++;
            }
        }
        System.out.println(c);
    }
}