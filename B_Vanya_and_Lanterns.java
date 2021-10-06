import java.util.*;
import java.io.*;
public class B_Vanya_and_Lanterns{
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
        int l=s.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(s.nextInt());
        }
        
        Collections.sort(a);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            max=Math.max(max,a.get(i+1)-a.get(i));
        }
        double sum=Math.max(a.get(0)-0,l-a.get(n-1));

        if(sum>(max/2.0)){
            System.out.println(String.format("%.10f",sum));
        }
        else
            System.out.println(String.format("%.10f", max/2.0));
    }
}