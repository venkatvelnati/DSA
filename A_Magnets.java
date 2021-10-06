import java.util.*;
import java.io.*;
public class A_Magnets{
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
        ArrayList<Integer> a= new ArrayList<>();
        while(t-->0){
            int x=s.nextInt();
            a.add(x%10);
            a.add(x/10);
        }
        int c=0;
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i)==a.get(i+1))
                c++;
        }
        System.out.println(c+1);
    }
}