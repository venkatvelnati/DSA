import java.util.*;
import java.io.*;
public class CountingPrime{
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
        int [] a =new int [n];
        int [] b =new int [n];
 
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        for(int i=0;i<n;i++)
            b[i]=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int j=i-1;
            int count=0;
            ArrayList<Integer> pf=fun(a[i]);
            System.out.print(pf);
            for(int x=0;x<b[i];x++,j--)
            {
                if(j>=0)
                {
                    for(int k:pf)
                    {
                        if(a[j]%k==0 || a[j]%a[i]==0)
                        {
                            count++;
                        }
                    }
                }
            }
 
            System.out.print(count+" ");
 
        }
 
    }
    public static ArrayList<Integer> fun(int n)
    {
        int n1=n;
         ArrayList<Integer> a = new ArrayList<>();
         if(n==1)
         {
            a.add(1);
             return a;
         }
         while(n%2==0)
         {
             a.add(2);
             n/=2;
         }
         for(int i=3;i<=Math.sqrt(n);i++)
         {
             while(n%i==0)
             {
                 a.add(i);
                 n/=i;
             }
         }
         if(n>2)
            a.add(n);
        if(a.size()>1)
            a.add(n1);
        ArrayList<Integer> b = new ArrayList<>();
        for(Integer i : a)
        {
            if(!b.contains(i))
                b.add(i);
        }
        return b;
    }
}