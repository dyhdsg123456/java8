package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author: dyh
 * Date:   2019/5/30
 * Description:
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names,(String a,String b)->b.compareTo(a));
        for (String name : names) {
            System.out.println(name);
        }

    }
}
