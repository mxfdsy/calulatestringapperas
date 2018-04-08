import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ 计算一个字符串中每个字符出现的次数
 * Created by 没想法的岁月 on 2018/4/8.
 */
public class CalculateApperas {
    public static void main(String[] args) {
        String str = "abcdddddefghijklmnqwertabccccccccc";
        char[] chars = str.toCharArray();
        HashMap<Object, Object> map = new HashMap<>();
        for (char ch:chars
             ) {
            if (map.keySet().contains(ch)) {
                map.replace(ch, (int) map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        System.out.println(entries);
    }


}
