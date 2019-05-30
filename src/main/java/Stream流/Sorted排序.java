package Stream流;

import java.util.Arrays;
import java.util.List;

/**
 * Author: dyh
 * Date:   2019/5/30
 * Description:
 */
public class Sorted排序 {
    public static void main(String[] args) {
        List<String> stringCollection = Arrays.asList("ddd2", "aaa2", "bbb1", "aaa1","bbb3","ccc","bbb2");
        //filter
        stringCollection.stream()
                        .sorted()
                        .filter((s -> s.startsWith("bb")))
                        .forEach(System.out::println);
       // sorted 不会对 原来stringCollection 做出任何改变
        for (String s : stringCollection) {
            System.out.println(s);
        }
    }

}
