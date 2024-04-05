package hexlet.code;

public class Random {
    public static int getRandNum(int startNum, int endNum) {

        return startNum + (int) Math.floor((Math.random() * (endNum - startNum + 1)));
    }
}
