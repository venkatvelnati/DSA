import java.util.*;
import java.io.*;
public class B_Shifting_Sort{
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
            int [] a= new int[n];
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
            int c=0;
            ArrayList<Integer> positions = new ArrayList<>();
            for(int i=0;i<n;i++){
                if(!isSorted(a,i)){
                    for(int j=0;j<=i;j++){
                        if(a[j]>a[i]){
                            positions.add(j+1);
                            positions.add(i+1);
                            shift(a,j,i);
                            positions.add(i+j%n);
                            break;
                        }
                    }
                    c++;
                }
            }
            System.out.println(c);
            for(int i=0;i<positions.size();i+=3){
                System.out.println(positions.get(i)+" "+positions.get(i+1)+" "+positions.get(i+2));
            }
        }
    }
    public static void shift(int a[],int j ,int i){
        int t=a[i];
        for(int k=i;k>j;k--){
            a[k]=a[k-1];
        }
        a[j]=t;
    }
    public static boolean isSorted(int [] a,int pos){
        if(pos==0)
            return true;
        for(int i=0;i<pos;i++){
            if(a[i]>a[i+1])
                return false;
        }
        return true;
    }
}