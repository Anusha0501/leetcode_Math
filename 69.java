#69. Sqrt(x)

class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int i = 1;
        while (i <= x / i) { // Avoids overflow by using division
            i++;
        }
        return i - 1;
    }
}
