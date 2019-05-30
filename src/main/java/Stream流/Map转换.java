package Stream流;

import java.util.Arrays;
import java.util.List;

/**
 * Author: dyh
 * Date:   2019/5/30
 * Description:
 */
public class Map转换 {
    public static void main(String[] args) {
        List<String> stringCollection = Arrays.asList("ddd2", "aaa2", "bbb1", "aaa1","bbb3","ccc","bbb2");
        stringCollection.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
