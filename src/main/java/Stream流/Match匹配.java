package Stream流;

import java.util.Arrays;
import java.util.List;

/**
 * Author: dyh
 * Date:   2019/5/30
 * Description:
 */
public class Match匹配 {
    public static void main(String[] args) {
        List<String> stringCollection = Arrays.asList("ddd2", "aaa2", "bbb1", "aaa1","bbb3","ccc","bbb2");
        // 验证 list 中 string 是否有以 a 开头的, 匹配到第一个，即返回 true
        boolean anyStartsWithA  = stringCollection.stream().anyMatch((s) -> s.startsWith("a"));
        System.out.println(anyStartsWithA);
        // 验证 list 中 string 是否都是以 a 开头的
        boolean allMatch = stringCollection.stream().allMatch((s) -> s.startsWith("a"));
        System.out.println(allMatch);
        // 验证 list 中 string 是否都不是以 z 开头的,
        boolean z = stringCollection.stream().noneMatch((s) -> s.startsWith("z"));
        System.out.println(z);
    }
}
