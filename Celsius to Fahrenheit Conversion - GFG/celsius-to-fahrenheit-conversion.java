// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(String.format("%.2f", ob.celciusToFahrenheit(N)));
        }
    }
}// } Driver Code Ends


class Solution{
    static double celciusToFahrenheit(int c)
    {
        return (c*(1.8)+32);
    }
}