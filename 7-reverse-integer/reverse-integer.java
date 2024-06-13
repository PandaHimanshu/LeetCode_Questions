class Solution {
    public int reverse(int x) {
        int num = x,rem=0;
        long rev=0;
        while(num!=0){
            rem = num%10;
            rev=rev*10+rem;
            num=num/10;
        }
    if(x>Integer. MAX_VALUE ||x<Integer.MIN_VALUE || rev>Integer. MAX_VALUE ||rev<Integer.MIN_VALUE ){
        return 0;
    }
    else{
        return (int)rev;
    }
      
    }
}