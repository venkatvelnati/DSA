import java.util.*;
import java.io.*;
public class A_Anton_and_Polyhedrons{
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
        long c=0;
        for(int i=0;i<n;i++){
            String st=s.next();
            if(st.equals("Tetrahedron"))
                c+=4;
            else if(st.equals("Cube"))
                c+=6;
            else if(st.equals("Octahedron"))
                c+=8;
            else if(st.equals("Dodecahedron"))
                c+=12;
            else
                c+=20; 
        }
        System.out.println(c);
    }
}