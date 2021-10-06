import java.util.*;
import java.io.*;
public class B_Scenes_From_a_Memory{
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
            int k=s.nextInt();
            String st=s.next();
            int f=0;
            for(int i=0;i<st.length();i++)
            {
                if((st.charAt(i)-'0'%2==0)|| (i!=0 && st.charAt(i)=='5') )
                {
                    System.out.println(st.length()-i+1);
                    System.out.println(st.substring(0,i+1));
                    f=1;
                    break;
                }
            }
            
        }
    }
}