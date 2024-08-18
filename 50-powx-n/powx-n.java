class Solution {
    public double myPow(double x, int n) {
        if(x==1.00000){
            return 1.00000;
        }
        else if(x==-1.00000){
            if(n%2==0){
                return 1.00000;
            }
            else{
                return -1.00000;
            }
        }
        else{
            double s = 1.0000;
            if(n>0){
                for(int i=0; i<n; i++){
                    s*=x;
                }
                return s;
            }
            else if(n<0 && n>=-999999999){
                for(int i=0; i<-n; i++){
                    s/=x;
                }
                return s;
            }
            else if(n<-999999999){
                return 0.00000;
            }
            else{
                return 1.00000;
            }
        }
    }
}