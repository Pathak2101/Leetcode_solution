//{ Driver Code Starts
// C++ program to check if two strings are isomorphic


#include<bits/stdc++.h>


using namespace std;
#define MAX_CHARS 256

// } Driver Code Ends
class Solution
{
    public:
    //Function to check if two strings are isomorphic.
    bool areIsomorphic(string str1, string str2)
    {
        int n=str1.length();
        int m=str2.length();
        // base case
        if(n!=m) return false;
        
        int m1[256]={0};
        int m2[256]={0};
        
        for(int i=0;i<n;i++){
            //mapping 1st char of str s1 with str2 
            if(!m1[str1[i]] and !m2[str2[i]]){
                m1[str1[i]]=str2[i];
                m2[str2[i]]=str1[i];
            }
            else if(m1[str1[i]]!= str2[i])
            return false;
        }
        return true;
    }
};

//{ Driver Code Starts.

// Driver program
int main()
{
    int t;
    cin>>t;
    string s1,s2;
    while (t--) {
        cin>>s1;
        cin>>s2;
        Solution obj;
        cout<<obj.areIsomorphic(s1,s2)<<endl;
    }
    
    return 0;
}
// } Driver Code Ends