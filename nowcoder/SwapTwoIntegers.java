import java.lang.reflect.Field;

public class SwapTwoIntegers {

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    private static void swap(Integer num1, Integer num2) {
        try {
            Field field = Integer.class.getDeclaredField("value");
            field.setAccessible(true);
            int temp = num1.intValue();
            field.set(num1, num2);
            field.set(num2, new Integer(temp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}