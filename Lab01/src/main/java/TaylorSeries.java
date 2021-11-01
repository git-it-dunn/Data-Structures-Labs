public class TaylorSeries {
    public static double factorial(int n){
        if (n == 0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    public static double pow(int x, int n){
        if(n == 0){
            return 1;
        }else{
            return x * pow(x,n-1);
        }
    }

    public static double approximateExp(int x, int n){
        double ans = 0;
        double math = 0;

        while(n >=  0){
            math = pow(x,n) / factorial(n);
            ans += math;
            n = n - 1;
        }
        return ans;
    }
}
