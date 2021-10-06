import java.util.*;
import java.io.*;
public class A_Expression{
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
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        ArrayList<Integer> l= new ArrayList<>();
        l.add(a+b+c);
        l.add(a+(b*c));
        l.add((a*b)+c);
        l.add((a+b)*c);
        l.add(a*b*c);
        l.add(a*(b+c));
        
        Collections.sort(l);
        System.out.println(l.get(l.size()-1));
    }   
}