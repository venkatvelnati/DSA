import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
public class Remove_One_Element{
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
            int n=s.nextInt();
            long fsum=0,ssum=0;
            int [] a = new int[n]; 
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
                fsum+=a[i];
            }
            for(int i=0;i<n-1;i++)
                ssum+= s.nextInt();
            Arrays.sort(a);
            int i=1,f=0;
            while(true)
            {
                for(int j=0;j<n;j++)
                {
                    if((fsum-a[j]) +((n-1)*i) == ssum)
                        {
                            f=1;
                            break;   
                        }
                }
                if(f==1)
                    break;
                i++;
            }
            System.out.println(i);
        }
    }
}