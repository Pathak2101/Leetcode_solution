//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here
	n= n-1;
	m=m-1;
	int i =0,j =-1, count =0;
	    while(count<=k){
	                j++;
	                for(int f = j; f<=m; f++){
	                    count++;
	                    //System.out.println("top"+A[i][f]);
	                    if(count == k){
	                        return A[i][f];
	                    }
	                }
	                
	                i++;
	                
	                for(int f = i; f<=n; f++){
	                    count++;
	                    //System.out.println("right"+A[f][m]);
	                    if(count == k){
	                        return A[f][m];
	                    }
	                }
	                
	                m--;
	                for(int f = m; f>=j; f--){
	                    count++;
	                     //System.out.println("down"+A[n][f]);
	                    if(count == k){
	                        return A[n][f];
	                    }
	                }
	                
	                n--;
	                for(int f = n; f>=i; f--){
	                    count++;
	                    //System.out.println("left"+A[f][j]);
	                    if(count == k){
	                        return A[f][j];
	                    }
	                }
	    }
        return 0;
    }
}