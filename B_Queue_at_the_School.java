import java.util.*;
import java.io.*;
public class B_Queue_at_the_School{
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
        int t=s.nextInt();
        char [] ch= s.next().toCharArray();
        while(t-->0){
            for(int i=0;i<n-1;i++){
                if(ch[i]=='B' && ch[i+1]=='G'){
                    char temp= ch[i];
                    ch[i]=ch[i+1];
                    ch[i+1]=temp;
                    i++;
                }
            }
        }
        for(char i :ch)
            System.out.print(i);
    }
}