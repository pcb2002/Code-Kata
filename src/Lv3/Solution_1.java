// 이상한 문자 만들기
package Lv3;

public class Solution_1 {
    public static void main(String[] args) {
        String s = "try hello world";
        System.out.print(solution(s));
    }
    public static String solution(String s) {
        String answer = "";
        String[] words = s.split(" ");
        for (int n = 0; n < words.length; n++) {
            String word = words[n];
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (i % 2 == 0) {
                    answer += Character.toUpperCase(c);
                } else answer += Character.toLowerCase(c);
            }
            if (n < words.length - 1) answer += " ";
        }
        return answer;
    }
}
