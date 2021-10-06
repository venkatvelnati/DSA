import java.util.*;
import java.io.*;
public class Javelin_Qualification{
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
            int m=s.nextInt();
            int x=s.nextInt();
            
            int [] a = new int[n];
            ArrayList<Integer> q = new ArrayList<>();
            HashMap<Integer,Integer> pos = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
                if(a[i]>=m)
                    q.add(i+1);
                pos.put(a[i],i+1);
            }
            Arrays.sort(a);
            int i=n-1-q.size();
            while(q.size()!=x)
            {
                if(i>=0 && !q.contains(a[i]))
                {
                    q.add(pos.get(a[i]));
                    i--;
                }
            }
            for(i=0;i<q.size();i++)
                System.out.print(q.get(i)+" ");
            System.out.println("");
        }
    }
}