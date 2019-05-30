package Stream流;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: dyh
 * Date:   2019/5/30
 * Description:
 */
public class Sorted排序 {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();

        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
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
