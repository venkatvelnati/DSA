import java.util.*;
import java.io.*;
public class Prefix_Sums{
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
        int t =s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            if(n%2!=0)
                System.out.println("NO");
            else{
                if((n/2)%2!=0)
                    System.out.println("NO");
                else{
                    int sum=(n*(n+1))/2;
                    if(sum%2!=0)
                        System.out.println("NO");
                    else{
                        System.out.println("YES");
                        ArrayList<Integer> a = new ArrayList<>();
                        ArrayList<Integer> b = new ArrayList<>();
                        int i=1;
                        while(a.size()!=n/2 || b.size()!=n/2){
                            if(i%2!=0){
                                a.add(i);
                                a.add(n-i+1);
                            }
                            else{
                                b.add(i);
                                b.add(n-i+1);
                            }
                            i++;
                        }
                        Collections.sort(a);
                        Collections.sort(b);
                        for(Integer x:a)
                            System.out.print(x+" ");
                        System.out.println("");
                        for(Integer y:b)
                            System.out.print(y+" ");
                    }
                }
            }
        }
    }
}