class Solution {
    public boolean isHappy(int n) {
        int slow=squareVal(n);
        int fast=squareVal(squareVal(n));
        while(slow!=fast)
        {
            slow=squareVal(slow);
            fast=squareVal(squareVal(fast));
        }
        return slow==1;
    }
    public int squareVal(int num)
    {
        int sum=0;
        while(num>0)
        {
            int digit=num%10;
            sum+=Math.pow(digit,2);
            num=num/10;
        }
        return sum;
    }
}