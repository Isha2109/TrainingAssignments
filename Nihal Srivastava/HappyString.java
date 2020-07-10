class HappyString {
    public String Solution(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        int size = a + b + c;
        int A = 0, B = 0, C = 0;
        for(int i = 0; i < size; i++) {
            if ((a >= b && a >= c && A != 2) || (B == 2 && a > 0) || (C == 2 && a > 0))  {
                sb.append("a");
                a--;
                A++;
                B = 0;
                C = 0;  
            } else if ((b >= a && b >= c && B != 2) || (A == 2 && b > 0) || (C == 2 && b > 0)) {
                sb.append("b");
                b--;
                B++;
                A = 0;
                C = 0;
            } else if ((c >= a && c >= b && C != 2) || (B == 2 && c > 0) || (A == 2 && c > 0)) {
                sb.append("c");
                c--;
                C++;
                A = 0;
                B = 0;  
            }
        }
        return sb.toString();
    }
}

//1
//https://leetcode.com/problems/longest-happy-string/
//3-
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
	
//	2
//	https://quabr.com/35097467/largest-bi-valued-slice-in-an-array