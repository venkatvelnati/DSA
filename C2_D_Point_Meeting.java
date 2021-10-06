import java.util.*;
import java.io.*;
public class C2_D_Point_Meeting{
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

    static class Point{
        int x,y;
        Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static void main(String args[]) {
        FastReader s = new FastReader();
        int t=s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int [] x = new int [n];
            int [] y = new int [n];
            
            ArrayList<Point> org= new ArrayList<>();

            ArrayList<Point> ym= new ArrayList<>();
            ArrayList<Point> xm= new ArrayList<>();

            ArrayList<Point> xpyp= new ArrayList<>();
            ArrayList<Point> xpym= new ArrayList<>();
           
           
            for(int i=0;i<n;i++)
                x[i]=s.nextInt();
            
            for(int i=0;i<n;i++)
                y[i]=s.nextInt();

            for(int i=0;i<n;i++){
                org.add( new Point(x[i], y[i]) );

                ym.ad
            }
        }
    }
}