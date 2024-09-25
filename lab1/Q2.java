class p2{
    public static int cntBits(int[] A)
    {
        int mod=10000000;
        int n=A.length;
        long ans=0;
        for(int i=0;i<32;i++){
            long count=0;
            for(int j=0;j<n;j++){
                if((A[j]& (1<<i))!=0){
                    count++;
                }
              
            }
            ans+=(count*(n-count)*2)%mod;

        }
        return (int)ans;
    }
}