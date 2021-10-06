import java.util.*;
import java.io.*;
public class C_Registration_system{
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
        HashMap<String,Integer> a = new HashMap<>();
        while(n-->0){
            String st=s.next();
            if(!a.containsKey(st)){
                a.put(st,0);
                System.out.println("OK");
            }
            else{
                a.replace(st,a.get(st)+1);
                System.out.println(st+Integer.toString(a.get(st)));
            }     
        }    
    }
    
}