import java.util.Arrays;

/**
 * @author: 蛋宝
 * @date: 2023/6/27 14:46
 * @description:
 */
public class Array {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 3, 2, 1};
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i].equals(array[j])) {
                    // 将重复的元素移动到数组末尾，并减少数组长度
                    array[j] = array[length - 1];
                    length--;
                    j--;
                }
            }
        }
        Integer[] result = Arrays.copyOf(array, length);
        System.out.println(Arrays.toString(result));
    }
}