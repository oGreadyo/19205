
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 第二题
 */
public class Exam2 {

    public static void main(String[] args) {
        test2();
    }


    /**
     * 计算个人所得税
     */
    public static void test2() {
        Scanner in = new Scanner(System.in);
        double input = 0;//输入的金额数
        double result = 0;//所需要缴纳的税费
        System.out.println("请输入工资：");
        String str = in.nextLine();
        while (!isInteger(str)) {
            System.err.println("输入不是纯数字，请重新输入：");
            str = in.nextLine();
        }
        input = Double.parseDouble(str);

//        System.out.println("input : "+input);

        result = getTheResult(input);
        System.out.println("所需要缴纳的税费为：" + result);

    }


    /**
     * 通过输入的金额得到相应的税费
     *
     * @param d
     * @return
     */
    public static double getTheResult(Double d) {
        d -=3500;
        if (d <= 1500)
            return d * 0.03;
        else if (d <= 4500)
            return d * 0.1;
        else if (d <= 9000)
            return d * 0.2;
        else if (d <= 35000)
            return d * 0.25;
        else if (d <= 55000)
            return d * 0.3;
        else if (d <= 80000)
            return d * 0.35;
        else
            return d * 0.45;
    }


    /**
     * 判断输入的字符是否为纯数字
     *
     * @param str
     * @return
     */
    public static boolean isInteger(String str) {
        str = str.trim();
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        String sarr[] = null;
        sarr = str.split("\\.");
//        System.out.println(sarr.length);
        if (sarr.length > 2)
            return false;
        else {
            if (sarr.length == 1)
                return pattern.matcher(sarr[0]).matches();
            else
                return (pattern.matcher(sarr[0]).matches() && pattern.matcher(sarr[1]).matches());
        }
    }
}
