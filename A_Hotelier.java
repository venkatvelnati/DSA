import java.util.*;
import java.io.*;
public class A_Hotelier{
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
        int [] a = {0,0,0,0,0,0,0,0,0,0,};
        int n=s.nextInt();
        String st=s.next();
        for(int i=0;i<n;i++)
        {
            char c=st.charAt(i);
            if(c=='L')
            {
                for(int j=0;j<10;j++)
                {
                    if(a[j]==0)
                    {
                        a[j]=1;
                        break;
                    }
                }
            }
            else if(c=='R')
            {
                for(int j=9;j>=0;j--)
                {
                    if(a[j]==0)
                    {
                        a[j]=1;
                        break;
                    }
                }
            }
            else
            {
                int p=Integer.parseInt(String.valueOf(c));
                a[p]=0;
            }
        }
        for(int i=0;i<10;i++)
            System.out.print(a[i]);      
    }
}