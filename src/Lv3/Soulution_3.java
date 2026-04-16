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

        for (int i = 0; i < t.length()-p.length()+1; i++) {
            int tNum = Integer.parseInt(t.substring(i, i+p.length()));
            int pNum = Integer.parseInt(p);
            if (tNum <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}
