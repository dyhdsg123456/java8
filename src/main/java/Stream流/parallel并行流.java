package Stream流;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Author: dyh
 * Date:   2019/5/30
 * Description:并行流是通过多线程来处理的
 */
public class parallel并行流 {
    public static void main(String[] args) {
        int max = 5000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
    //顺序流排序
        // 纳秒
//        long t0 = System.nanoTime();
//
//        long count = values.stream().sorted().count();
//        System.out.println(count);
//
//        long t1 = System.nanoTime();
//
//      // 纳秒转微秒
//        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
//        System.out.println(String.format("顺序流排序耗时: %d ms", millis));

        // 纳秒
        long t0 = System.nanoTime();

        long count = values.parallelStream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

// 纳秒转微秒
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("并行流排序耗时: %d ms", millis));




    }
}
