
/* 
Input = 14
output = 6
Explanation :
 step 1) 14 is even: divided by 2 and obtain 7. 
 step 2) 7 is odd: subtract by 1 and obtain 6. 
 step 3) 6 is even: divided by 2 and obtain 3. 
 step 4) 3 is odd: subtract by 1 and obtain 2. 
 step 5) 2 is even: divided by 2 and obtain 1.  
 step 6) 1 is odd: subtract by 1 and obtain 0. 
*/
public class StepsCount {
    public static void main(String[] args) {
        System.out.println(steps(14));
    }
    static int steps(int n){
        return helper(n, 0);
    }
    private static int helper(int n, int steps) {
        if (n==0) {
            return steps;
        }
        if (n%2==0) {
            return helper(n/2, steps+1);
        }
        return helper(n-1, steps+1);
    }
}
