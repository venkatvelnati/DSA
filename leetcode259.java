import java.util.*;
import java.io.*;
public class leetcode259{
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
        int [] a = new int [n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt()    ;
        int x=sumOfBeauties(a);
    }

    public static int sumOfBeauties(int[] nums) {
        int sum=0;

        int [] a = new int [nums.length];
        a[0]=0;
        int max=Integer.MIN_VALUE;       
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                a[i]=0;
                max=nums[i];
            }
            else
                a[i]=1;
        }


        int [] b = new int [nums.length];
        b[nums.length-1]=0;
        int min=Integer.MAX_VALUE;

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<min){
                min=nums[i];
                b[i]=0;
            }
            else
                b[i]=1;
        }


        for(int i=0;i<b.length;i++)
            System.out.println(b[i]);
        


        for(int i=1;i<=nums.length-2;i++){
            if(a[i]==0 && b[i]==0)
                sum+=2;
            else if(nums[i-1]<nums[i] && nums[i]<nums[i+1])
                sum++;
            else 
                sum+=0;
        }
        return sum;
    }
}