import java.util.*;
import java.io.*;
public class A_Helpful_Maths{
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
        String st =s.next();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<st.length();i+=2)
            a.add(st.charAt(i)-'0');
        Collections.sort(a);
        for(int i=0;i<a.size()-1;i++)
            System.out.print(a.get(i)+"+");   
        System.out.print(a.get(a.size()-1));
    }
}