import java.util.*;
import java.io.*;
public class Odd_GCD{
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
        while(t-->0){
            int n=s.nextInt();
            int odd=0;
            int [] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
                if(a[i]%2!=0)
                    odd++;
            }
            
            ArrayList<Integer> x = new ArrayList<>();
            if(odd==0){
                int f=0;
                for(int i=0;i<n;i++){
                    if((a[i]/2)%2!=0){
                        System.out.println("1");
                        f=1;
                        break;
                    }
                    else{
                        int c=0;
                        int k=a[i];
                        while(true){
                            if(k%2!=0)
                                break;
                            else{
                                k=k/2;
                                c++;
                            }
                        }
                        x.add(c);
                    }
                }
                if(f==0)
                    System.out.println(Collections.min(x));
            }
            else{
                System.out.println("0");
            }
        }
    }
}