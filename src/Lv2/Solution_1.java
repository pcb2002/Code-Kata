//수박수박수박수박수박수?
//길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
// 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
//
//        제한 조건
//n은 길이 10,000이하인 자연수입니다.
//입출력 예
//n	return
//        3	"수박수"
//        4	"수박수박"

// 처음 썼던 로직
//public class Solution {
//    public static void main(String[] args) {
//        int n = 4;
//        for (int i = 0; i < n; i++) {
//            System.out.print(solution(i));
//        }
//    }
//
//    public static String solution(int n) {
//        String answer = "";
//        if (n%2 == 0) answer = "수";
//        else if (n%2 == 1) answer = "박";
//
//        return answer;
//    }
//}

// 틀린 이유: Solution 안에 완성된 한 문장(수박 4개가 한박스에)이 출력되기를 기대하기 때문에
// 출력 결과 자체는 같지만 수박 4개를 개별포장해서 제출한 것과 같음.

package Lv2;

public class Solution_1 {
    public static void main(String[] args) {
        int n = 4;
        System.out.print(solution(n));
    }

    public static String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) answer += "수";
            else answer += "박";
        }
        return answer;
    }
}