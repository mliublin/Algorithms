//package algorithms;

class  ReverseInteger_7 {

    public static void main(String[] args) {

        int res = reverse (-2147483648);
        System.out.print(res);
        
    }

    public static int reverse(int x) {
        
        if (x == 0) 
            return x;
        
        long abs = x > 0 ? x : -1*x;
        int sign = x > 0 ? 1 : -1;

                                  
        if ( x / 10 == 0) 
            return x;
       
        long result = 0;
        
        while (abs > 0)
        {
            long newAbs = abs/10;
                        
            result = result * 10 + (abs - 10 * newAbs);
                        
            if (result < -2147483648 || result > 2147483647)
                return 0;
            
            abs = newAbs;
        }
    
        return sign*(int)result;
    }
}