/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Maximise_the_Subsequence_Sum
{
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
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader sc = new FastReader();
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    
		  
            int [] a = new int[n];
            int sum=0;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            Arrays.sort(a);
            for(int i=0;i<n;i++)
            {
                if(i<k && a[i]<0)
                    sum+=a[i]*(-1);
                else if(a[i]>0)
                    sum+=a[i];
            }
		    System.out.println(sum);
		}
	}
}
