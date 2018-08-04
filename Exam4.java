import java.util.*;

/**
 * 第四题
 */
public class Exam4 {

    public static void main(String[] args) {
        test4();
    }

    public static void test4() {
        int a = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            a = (int) (Math.random() * 100);
            list.add(a);
        }
        System.out.println("随机生成50个小于100的数,分别为：");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ",");
        }
        List<Integer> lt = null;
        Map<Integer, Object> m = new HashMap<Integer, Object>();
        for (int j = 0; j < 10; j++) {
            lt = new ArrayList<Integer>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) / 10 == j) {
                    lt.add(list.get(i));
                }
            }
            if (lt.size() != 0) {
                m.put(j, lt);
            }
        }
        System.out.print("\nMap中的数据为: ");
        print(m,false);
        System.out.print("排序后的Map为: ");
        print(m, true);
    }

    /**
     * 打印map，当为true时数据有排序，为false时没有排序
     */
    public static void print(Map<Integer, Object> m, boolean flag) {
        System.out.print("{");
        for (Integer in : m.keySet()) {
            System.out.print(in + "=> [");
            List<Integer> list = null;
            list = (List<Integer>) m.get(in);
            if (flag)
                Collections.sort(list);
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print(list.get(i) + ",");
            }
            System.out.print(list.get(list.size() - 1));
            System.out.print("],");
        }
        System.out.println("}");
    }


}
