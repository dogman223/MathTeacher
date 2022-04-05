package Functions;

public class MathFunctions {
    public static int sum (int num, int num0) { return num + num0; }
    public static int sub (int num, int num0) { return num - num0; }
    public static int multiply (int num, int num0) { return num * num0; }
    public static int division (int num, int num0) { return num / num0; }
    public static int triangleAreaFirstPattern (int num, int num0) { return (int) (0.5 * num * num0); }
    public static int triangleAreaSecondPattern (int num, int num0, int num1, int num2) { return (num * num0 * num1)/(4 * num2); }
    public static int triangleAreaThirdPattern (int num, int num0, int num1, int num2) { return (num + num0 + num1)/2 * num2; }
    public static int triangleAreaFourthPattern (int num, int num0, int num1) { return (int) (0.5 * num * num0 * Math.sin(num1)); }
    public static int triangleAreaFifthPattern (int num, int num0, int num1, int num2) { return (int) (2 * increase(num) * Math.sin(num0) * Math.sin(num1) * Math.sin(num2)); }
    public static int parallelogramPerimeter (int num, int num0) { return 2 * num + 2 * num0; }
    public static int trapezoidField (int num, int num0, int num1) { return (2 / (num + num0) * num1); }
    public static int circleField (int num) { return increase(num); }
    public static int circleCircumference (int num) { return 2 * num; }
    public static int circleLengthArc (int num, int num0) { return num / 360 * 2 * num0; }
    public static int circleSectorField (int num, int num0) { return num / 360 * increase(num0); }
    public static int circleSegmentArea (int num, int num0) { return (int) ((num / 360) * increase(num0) - (increase(num0) * Math.sin(num)) / 2); }
    public static String randomNumber() { return String.valueOf((int) (100 * Math.random())); }
    public static int increase (int num) { return num * num; }
    public static int converterMilesKms (int num) { return (int) (num * 1.609); }
    public static int converterKmsMiles (int num) { return (int) (num / 1.609); }
    public static int celsiusFahrenheit (int num) { return (int) (num * 1.8 + 32); }
    public static int fahrenheitCelsius (int num0) { return (int) ((num0 - 32) / 1.8); }
    public static int celsiusKelvin (int num1) { return (int) (num1 + 273.15); }
    public static int kelvinCelsius (int num2) { return (int) (num2 - 273.15); }
}
