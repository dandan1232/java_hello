import java.util.Scanner;

/**
 * @author: 蛋宝
 * @date: 2023/6/27 14:06
 * @description: 成绩判定
 */


public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入成绩: ");
        int score = scanner.nextInt();
        String grade;
        if (score >= 90) {
            grade = "优秀";
        } else if (score >= 80) {
            grade = "良好";
        } else if (score >= 60) {
            grade = "合格";
        } else {
            grade = "不合格";
        }
        System.out.println("成绩等级: " + grade);
    }
}
