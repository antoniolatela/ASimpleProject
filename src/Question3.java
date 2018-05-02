import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by alatel01 on 02/05/2018.
 */
public class Question3 {
    Map b = new HashMap();
    Integer i = 0;

    int rarestAge(Map m) {


        if (m.isEmpty()) throw new IllegalArgumentException("Please pass a MAP");
        m.values().stream().forEach((a) -> {
            if (b.containsKey(a)) {
                b.put(b.get(a), (Integer)b.get(a) + 1);
            }
            else {
                b.put(a, 1);
            }
        });
        Collection c = m.values();
        c.forEach((a) -> {
            if (((Integer)a) > i) {
                i = (Integer)a;
            }
        });
    return i;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("pippo", 1);
        map.put("pippo", 2);

        map.put("pippo", 3);
        map.put("pluto", 11);
        map.put("pluto", 11);


        System.out.println(new Question3().rarestAge(map));
    }
}


