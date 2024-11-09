package static2.ex;

public class MathArrayUtils {

    private static int max;
    private static int min;
    private static int sum;

    private MathArrayUtils() {

    }

    public static int sum(int[] values) {
        sum=0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        int sum = 0; // sum 변수를 int로 선언
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length; // 평균 계산 시 double로 형변환
    }


    public static int min(int[] values) {
        min = values[0]; // 배열의 첫 번째 값을 초기값으로 설정
        for (int i = 1; i < values.length; i++) { // 두 번째 요소부터 비교 시작
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int[] values) {
        max = values[0]; // 배열의 첫 번째 값을 초기값으로 설정
        for (int i = 1; i < values.length; i++) { // 두 번째 요소부터 비교 시작
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }
}
