package Lv3;

public class Soulution_3 {
    public static void main(String[] args) {
        String[] t = {"3141592", "500220839878", "10203"};
        String[] p = {"271", "7", "15"};
        int index = 0;
        System.out.print(solution(t[index], p[index]));

    }
    public static int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);
        int pLength = p.length();

        for (int i = 0; i < t.length()-pLength+1; i++) {
            long tNum = Long.parseLong(t.substring(i, i+pLength));
            if (tNum <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}
