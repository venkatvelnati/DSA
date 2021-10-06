import java.util.*;
import java.io.*;
public class A_Amusing_Joke{
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
        char [] st=(s.next()+s.next()).toCharArray();
        char [] r=s.next().toCharArray();

        Arrays.sort(st);
        Arrays.sort(r);
        if(st.length!=r.length)
            System.out.println("NO");
        else{
            int f=0;
            for(int i=0;i<r.length;i++){
                if(st[i]!=r[i]){
                    System.out.println("NO");
                    f=1;
                    break;
                }
            }
            if(f==0)
                System.out.println("YES");
        }        
    }
}