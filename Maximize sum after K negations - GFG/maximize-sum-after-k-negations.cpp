//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
    public:
    long long int maximizeSum(long long int a[], int n, int k)
    {
        // Your code goes here
           sort(a, a+n);
        int neg= 0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                neg +=1;
            }
        }
        
        if(neg>=k){
            for(int i=0;i<k;i++){
                a[i] = -a[i];
            }
        }
        else{
            for(int i=0;i<neg;i++){
                a[i] = -a[i];
            }
            sort(a, a+n);
         k = k-neg;
         if(k%2==1){
             a[0] = -a[0];
         }
        }
        long long int sum = 0;
        for(int i=0;i<n;i++){
            sum +=a[i];
        }
        return sum;
    }
};

//{ Driver Code Starts.
int main()
 {
     int t;
     cin>>t;
     while(t--)
     {
         int n, k;
         cin>>n>>k;
         long long int a[n+5];
         for(int i=0;i<n;i++)
         cin>>a[i];
         Solution ob;
         cout<<ob.maximizeSum(a, n, k)<<endl;
     }
	
	return 0;
}
// } Driver Code Ends