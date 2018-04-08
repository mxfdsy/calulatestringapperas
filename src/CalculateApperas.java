import java.util.*;

/**
 * @author 没想法的岁月
 * 计算一个字符串中每个字符出现的次数
 * Created by 没想法的岁月 on 2018/4/8.
 */
public class CalculateApperas {
    public static void main(String[] args) {
        String str = "fasdasdfdfcvsdaaaaabbb";
        char[] chars = str.toCharArray();
//        无序的排序
//        HashMap<Character, Integer> map = new HashMap<>();
        //自然排序
//        TreeMap<Character, Integer> map = new TreeMap<>();
        //按照添加的先后顺序排序
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch:chars
             ) {
                if (map.keySet().contains(ch)) {
//                    map.replace(ch,  map.get(ch)+1);
                    Integer old = map.get(ch);
                    map.put(ch, old + 1);
                } else {
                    map.put(ch, 1);
                }
        }
        System.out.println(map);
    }


}
