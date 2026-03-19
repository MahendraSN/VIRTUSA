import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

class NumbersAll {

    public static void main(String[] args) {

        // 1. Largest number
        int a = 10, b = 20;
        System.out.println("Largest: " + Math.max(a, b));

        // 2. Second largest
        int[] arr = {10, 30, 20};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        System.out.println("Second Largest: " + second);

        // 3. Even or Odd
        int n = 7;
        System.out.println(n % 2 == 0 ? "Even" : "Odd");

        // 4. Sum of digits
        int num = 123, sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);

        // 5. Reverse digits
        temp = num;
        int rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reverse: " + rev);

        // 6. Alternate digits
        temp = num;
        System.out.print("Alternate digits: ");
        while (temp > 0) {
            System.out.print(temp % 10 + " ");
            temp /= 100;
        }
        System.out.println();

        // 7. Prime or Composite
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        System.out.println(count == 2 ? "Prime" : "Composite");

        // 8. Perfect square
        int sq = 25;
        int root = (int)Math.sqrt(sq);
        System.out.println(root * root == sq ? "Perfect Square" : "Not");

        // 9. Fibonacci check
        int fib = 13, x = 0, y = 1;
        while (y < fib) {
            int t = x + y;
            x = y;
            y = t;
        }
        System.out.println(y == fib ? "Fibonacci" : "Not");

        // 10. Discount
        double price = 1000, discount = 10;
        System.out.println("Final Price: " + (price - price * discount / 100));

        // 11. % increase/decrease
        double oldVal = 100, newVal = 120;
        System.out.println("Percent: " + ((newVal - oldVal) / oldVal * 100));

        // 12. Age from DOB
        LocalDate dob = LocalDate.of(2002, 6, 13);
        System.out.println("Age: " + Period.between(dob, LocalDate.now()).getYears());

        // 13. Days between dates
        LocalDate d1 = LocalDate.of(2020, 1, 1);
        System.out.println("Days: " + ChronoUnit.DAYS.between(d1, LocalDate.now()));

        // 14. Kth largest
        int[] arr2 = {3,2,1,5,6};
        int k = 2;
        Arrays.sort(arr2);
        System.out.println("Kth Largest: " + arr2[arr2.length - k]);

        // 15. Majority element
        int[] arr3 = {2,2,1,2};
        int candidate = 0, c = 0;
        for (int val : arr3) {
            if (c == 0) candidate = val;
            c += (val == candidate) ? 1 : -1;
        }
        System.out.println("Majority: " + candidate);

        // 16. Max sum subarray
        int[] arr4 = {-2,1,-3,4,-1,2,1,-5,4};
        int max = arr4[0], curr = 0;
        for (int val : arr4) {
            curr = Math.max(val, curr + val);
            max = Math.max(max, curr);
        }
        System.out.println("Max Subarray Sum: " + max);

        // 17. Max submatrix → (concept only)

        // 18. Missing number
        int[] arr5 = {0,1,3};
        int size = 3, total = size*(size+1)/2, s = 0;
        for (int val : arr5) s += val;
        System.out.println("Missing: " + (total - s));

        // 19. Nth divisible by a & b
        int A = 2, B = 3, nth = 5, count2 = 0, num2 = 1;
        while (count2 < nth) {
            if (num2 % A == 0 && num2 % B == 0) count2++;
            num2++;
        }
        System.out.println("Nth (AND): " + (num2 - 1));

        // 20. Nth divisible by a or b
        count2 = 0; num2 = 1;
        while (count2 < nth) {
            if (num2 % A == 0 || num2 % B == 0) count2++;
            num2++;
        }
        System.out.println("Nth (OR): " + (num2 - 1));

        // 21. GCD & LCM
        int p = 12, q = 18;
        int t1 = p, t2 = q;
        while (t2 != 0) {
            int temp2 = t2;
            t2 = t1 % t2;
            t1 = temp2;
        }
        int gcd = t1;
        int lcm = (p * q) / gcd;
        System.out.println("GCD: " + gcd + " LCM: " + lcm);

        // 22. Prime factorization
        int pf = 36;
        System.out.print("Prime Factors: ");
        for (int i = 2; i <= pf; i++) {
            while (pf % i == 0) {
                System.out.print(i + " ");
                pf /= i;
            }
        }
    }
}
