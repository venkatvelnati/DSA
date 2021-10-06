import java.util.*;
import java.io.*;
public class Min_Max_Riddle{
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
        int n =s.nextInt();
        int [] a = new int [n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int w=i+1;
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> brr = new ArrayList<>();
            for(int j=0;j<w;j++)
                arr.add(a[j]);
            brr.add(Collections.min(arr));

            for(int j=w;j<n;j++)
            {   
                arr.remove(0);
                arr.add(a[j]);
                brr.add(Collections.min(arr));
            }
            
            System.out.print (Collections.max(brr)+" ");
        }
    }
}