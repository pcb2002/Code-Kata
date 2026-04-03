//내적
//길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
//
//이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
//
//제한사항
//a, b의 길이는 1 이상 1,000 이하입니다.
//        a, b의 모든 수는 -1,000 이상 1,000 이하입니다.
//        입출력 예
//a	b	result
//[1,2,3,4]	[-3,-1,0,2]	3
//        [-1,0,1]	[1,0,-1]	-2
//입출력 예 설명
//입출력 예 #1
//
//a와 b의 내적은 1*(-3) + 2*(-1) + 3*0 + 4*2 = 3 입니다.
//입출력 예 #2
//
//a와 b의 내적은 (-1)*1 + 0*0 + 1*(-1) = -2 입니다.

package Lv2;

public class Solution_2 {
//    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4};
//        int[] b = {-3, -1, 0, 2};
//
//        printRes(a, b);
//    }
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }
        return answer;
    }

//    public static String result(int num) {
//        return (num < 0) ? "(" + num + ")" : String.valueOf(num);
//    }
//
//    public static void printRes(int[] a, int[] b) {
//        System.out.print("a와 b의 내적은 ");
//        for (int i = 0; i < a.length; i++) {
//            System.out.printf("%s*%s", result(a[i]), result(b[i]));
//            if (i < a.length - 1) System.out.print(" + ");
//        }
//        System.out.printf(" = %d 입니다.", solution(a, b));
//    }
}

// 출력 양식대로 해야 되는 줄 알았는데 실제로는 결과값만 리턴하면 된다고 한다.
