
import java.util.Scanner;

/**
 * 第三题
 */
public class Exam3 {
    public static void main(String[] args) {
        test3();
    }

    public static void test3() {
        Scanner in = new Scanner(System.in);
        String input = null;
        String result = null;
        System.out.println("请输入日期：");
        input = in.nextLine();
        while (!isCorrect(input)) {
            input = in.nextLine();
        }

    }

    /**
     * 判断输入的日期是否合法并得到结果
     *
     * @param str
     * @return
     */
    public static boolean isCorrect(String str) {
        String starr[] = null;
        starr = str.split("-");
        int year, month, day;
        if (starr.length == 3) {
            year = Integer.parseInt(starr[0]);
            month = Integer.parseInt(starr[1]);
            day = Integer.parseInt(starr[2]);
            if (month > 12 || month < 1 || day > 31 || day < 1) {
                System.err.println("输入的日期有误不存在，请重新输入：");
                return false;
            }
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                //闰年
                if (month == 2 && day > 29) {
                    System.err.println("您输入的日期不存在，请重新输入：");
                    return false;
                } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
                    System.err.println("您输入的日期不存在，请重新输入：");
                    return false;

                } else {
                    //得到相应的结果
                    if (month == 2 && day == 29) {
                        month = 3;
                        day = 1;
                    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                        if (day == 30) {
                            month++;
                            day = 1;
                        } else {
                            day++;
                        }

                    } else if (month == 12 && day == 31) {
                        year++;
                        month = 1;
                        day = 1;
                    } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                        if (day == 31) {
                            month++;
                            day = 1;
                        } else {
                            day++;
                        }
                    }
                    String s = "";
                    s += year;
                    s += "-";
                    if (month < 10)
                        s = s + "0" + month;
                    s += "-";
                    if (day < 10)
                        s = s += "0" + day;
                    System.out.println("下一天为：" + s);
                    return true;
                }

            } else {
                //平年
                if (month == 2 && day > 28) {
                    System.err.println("您输入的日期不存在，请重新输入：");
                    return false;
                } else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30) {
                    System.err.println("您输入的日期不存在，请重新输入：");
                    return false;
                } else {
                    //得到相应的结果
                    if (month == 2 && day == 28) {
                        month = 3;
                        day = 1;
                    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                        if (day == 30) {
                            month++;
                            day = 1;
                        } else {
                            day++;
                        }

                    } else if (month == 12 && day == 31) {
                        year++;
                        month = 1;
                        day = 1;
                    } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                        if (day == 31) {
                            month++;
                            day = 1;
                        } else {
                            day++;
                        }
                    }

                    String s = "";
                    s += year;
                    s += "-";
                    if (month < 10)
                        s = s + "0" + month;
                    s += "-";
                    if (day < 10)
                        s = s += "0" + day;
                    System.out.println("下一天为：" + s);
                    return true;
                }

            }

        } else {
            System.err.println("您输入的日期格式不正确，请重新输入：");
            return false;
        }
    }

}
