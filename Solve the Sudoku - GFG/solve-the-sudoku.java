//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int grid[][] = new int[9][9];
            for(int i = 0; i < 9; i++)
            {
                for(int j = 0; j < 9; j++)
                grid[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            if(ob.SolveSudoku(grid) == true)
                ob.printGrid(grid);
            else
                System.out.print("NO solution exists");
            System.out.println();
            
        }
    }
}




// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean isSafe(int row, int col, int val, int[][] g)
    {
       for(int i=0;i<9;i++)
       {
           if(g[row][i]==val) return false;
           if(g[i][col]==val) return false;
           if(g[3*(row/3)+(i/3)][3*(col/3)+(i%3)]==val) return false;
       }
       return true;
    }
    static boolean SolveSudoku(int grid[][])
    {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==0)
                {
                    for(int v=1;v<=9;v++)
                    {
                        
                        if(isSafe(i,j,v,grid))
                        {
                            grid[i][j]=v;
                            boolean pos=SolveSudoku(grid);
                            if(pos) return true;
                            else
                            {
                                grid[i][j]=0;
                            }
                        }
                        
                    }
                    return false;
                }
                
            }
        }
        return true;
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int[] g: grid)
        {
            for(int x: g) System.out.print(x+" ");
        }
        
    }
}
