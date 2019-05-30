package Stream流;

import java.util.Arrays;
import java.util.List;

/**
 * Author: dyh
 * Date:   2019/5/30
 * Description:
 */
public class Count计数 {
    // 先对 list 中字符串开头为 b 进行过滤，让后统计数量
    public static void main(String[] args) {
        List<String> stringCollection = Arrays.asList("ddd2", "aaa2", "bbb1", "aaa1","bbb3","ccc","bbb2");
        long b = stringCollection.stream().filter((s -> s.startsWith("b"))).count();
        System.out.println(b);
    }
}
