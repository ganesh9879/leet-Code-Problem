// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N)
    {
          int count = 0;
        int maxCount = 0;
        while(N>0){
            if(N%2==1){
                count++;
            }
            else{
                maxCount = Math.max(maxCount,count);
                count = 0;
            }
            N = N/2;
        }
        maxCount = Math.max(maxCount,count);
        return maxCount;
      }
        
    
    
}



// { Driver Code Starts.

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//input n
		    
		    Solution obj = new Solution();
		    
		    //calling maxConsecutiveOnes() function
		    System.out.println(obj.maxConsecutiveOnes(n));
		}
	}
}


  // } Driver Code Ends