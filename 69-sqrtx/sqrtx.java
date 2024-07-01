class Solution {
    public int mySqrt(int x) {

                    //It is in Binary search
        long start = 1;
        long end = x;
        long ans = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long val = mid * mid;
            if (val == x) {
                ans = (int) mid;
                break;
            } else if (val < x) {
                start = mid + 1;
                ans = (int) mid;
            } else {
                end = mid - 1;
            }
        }
        return (int) ans;


                    //It is in Linear Search
        // long ans =1;
        // for(int i=1;i<=x;i++){
        //     if(i*i<=x){
        //         ans=i;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // return (int) ans;
    }
}