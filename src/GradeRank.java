import java.util.HashMap;
import java.util.Map;

/**
 * @author: 蛋宝
 * @date: 2023/6/27 14:11
 * @description: 成绩排名
 */
public class GradeRank {
    public static void main(String[] args) {
        // 学生成绩数据
        Map<String, Integer> scores = new HashMap<>();
        scores.put("念安", 85);
        scores.put("阿蛋", 72);
        scores.put("石二狗", 90);
        scores.put("阿正", 67);
        scores.put("星星子", 94);

        // 初始化排名变量
        int rank = 1;

        // 遍历成绩数据并进行排名
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String student = entry.getKey();
            int score = entry.getValue();
            String grade;
            if (score >= 90) {
                grade = "优秀";
            } else if (score >= 70) {
                grade = "良好";
            } else if (score >= 60) {
                grade = "合格";
            } else {
                grade = "不合格";
            }

            // 打印学生姓名、成绩和等级
            System.out.println(student + "成绩 = " + score + ", 等级 = " + grade + ", 排名 = " + rank);

            // 增加排名变量
            rank++;
        }
    }
}
