package Main;

import Display.DisplayMethods;
import Functions.MathFunctions;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello student, how can I help?.");

        LocalDateTime localDateTime = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        switch (answer) {

            case "sum":
                System.out.println("Enter the numbers you want to sum.");
                int num = scanner.nextInt();
                int num0 = scanner.nextInt();
                System.out.print(DisplayMethods.sum0(num, num0) + MathFunctions.sum(num, num0));
                break;

            case "subtract":
                System.out.println("Enter the numbers you want to subtract");
                num = scanner.nextInt();
                num0 = scanner.nextInt();
                System.out.print(DisplayMethods.sub0(num, num0) + MathFunctions.sub(num, num0));
                break;

            case "multiply":
                System.out.println("Enter the numbers you want to multiply.");
                num = scanner.nextInt();
                num0 = scanner.nextInt();
                System.out.println(DisplayMethods.multiply0(num, num0) + MathFunctions.multiply(num, num0));
                break;

            case "division":
                System.out.println("Enter the numbers you want to division.");
                num = scanner.nextInt();
                num0 = scanner.nextInt();
                System.out.println(DisplayMethods.division0(num, num0) + MathFunctions.division(num, num0));
                break;

            case "area of a triangle":
                System.out.println("Which pattern do you want to choose?");
                System.out.println(
                        "1. P = 0.5ah, " +
                                "2. P = abc/4R " +
                                "3. P = r * a+b+c/2 " +
                                "4. P = 0.5 * ab * sinγ " +
                                "5. P = 2R^2 * sinα * sinβ * sinγ");
                Scanner scanner1 = new Scanner(System.in);
                String answer0 = scanner1.nextLine();

                switch (answer0) {

                    case "1":
                        System.out.println("Enter the length of the base and heigth.");
                        num = scanner1.nextInt();
                        num0 = scanner1.nextInt();
                        System.out.println("P = 2/ah");
                        System.out.print(DisplayMethods.triangleAreaFirstPattern0(num, num0) + MathFunctions.triangleAreaFirstPattern(num, num0));
                        break;

                    case "2":
                        System.out.println("Enter the radius length of the circle circumscribed by the triangle and length of every sides.");
                        num = scanner1.nextInt();
                        num0 = scanner1.nextInt();
                        int num1 = scanner1.nextInt();
                        int num2 = scanner1.nextInt();
                        System.out.println("P = abc/4R");
                        System.out.print(DisplayMethods.triangleAreaSecondPattern0(num, num0, num1, num2) + MathFunctions.triangleAreaSecondPattern(num, num0, num1, num2));
                        break;

                    case "3":
                        System.out.println("Enter the radius length of the circle inscribed in the triangle and length of every sides.");
                        num = scanner1.nextInt();
                        num0 = scanner1.nextInt();
                        num1 = scanner1.nextInt();
                        num2 = scanner1.nextInt();
                        System.out.println("P = r * a+b+c/2");
                        System.out.print(DisplayMethods.triangleAreaThirdPattern0(num, num0, num1, num2) + MathFunctions.triangleAreaThirdPattern(num, num0, num1, num2));
                        break;

                    case "4":
                        System.out.println("Enter the length of two sides and size of angle between them.");
                        num = scanner1.nextInt();
                        num0 = scanner1.nextInt();
                        num1  = scanner1.nextInt();
                        System.out.println("P = 2/ab * siny");
                        System.out.print(DisplayMethods.triangleAreaFourthPattern0(num, num0, num1) + MathFunctions.triangleAreaFourthPattern(num, num0, num1));
                        break;

                    case "5":
                        System.out.println("Enter the radius length and sizes of angles.");
                        num = scanner1.nextInt();
                        num0 = scanner1.nextInt();
                        num1 = scanner1.nextInt();
                        num2 = scanner1.nextInt();
                        System.out.println("P = 2R^2 * sinα * sinβ * sinγ");
                        System.out.println(DisplayMethods.triangleAreaFifthPattern0(num, num0, num1, num2) + MathFunctions.triangleAreaFifthPattern(num, num0, num1, num2));
                        break;
                }
                break;

            case "diamond field":
                System.out.println("Enter the length of the side and heigth.");
                num = scanner.nextInt();
                num0 = scanner.nextInt();
                System.out.println("P = ah");
                System.out.print(DisplayMethods.multiply0(num, num0) + MathFunctions.multiply(num, num0));
                break;

            case "perimeter of a parallelogram":
                System.out.println("Enter the length of the sides.");
                num = scanner.nextInt();
                num0 = scanner.nextInt();
                System.out.println("Ob = 2a + 2b");
                System.out.print(DisplayMethods.parallelogramPerimeter0(num, num0) + MathFunctions.parallelogramPerimeter(num, num0));
                break;

            case "trapezoid field":
                System.out.println("Enter the length of the parallel sides and heigth.");
                num = scanner.nextInt();
                num0 = scanner.nextInt();
                int num1 = scanner.nextInt();
                System.out.println("P = 2 / (a + b) x h");
                System.out.print(DisplayMethods.trapezoidField0(num, num0, num1) + MathFunctions.trapezoidField(num, num0, num1));
                break;

            case "circle field":
                System.out.println("Enter the length of a radius.");
                num = scanner.nextInt();
                System.out.println("P = πr^2");
                System.out.print(DisplayMethods.circleField0(num) + MathFunctions.circleField(num) + "π");
                break;

            case "circumference of a circle":
                System.out.println("Enter the length of the radius.");
                num = scanner.nextInt();
                System.out.println("Ob = 2πr");
                System.out.println(DisplayMethods.circleCircumference0(num) + MathFunctions.circleCircumference(num) + "π");
                break;

            case "length of the arc of a circle":
                System.out.println("Enter the angle size of the circle sector and length of the radius.");
                num = scanner.nextInt();
                num0 = scanner.nextInt();
                System.out.println("l = α / 360 X 2πr");
                System.out.println(DisplayMethods.circleLengthArc0(num, num0) + MathFunctions.circleLengthArc(num, num0) + "π");
                break;

            case "circle sector field":
                System.out.println("Enter the angle size of the circle sector and length of the radius.");
                num = scanner.nextInt();
                num0 = scanner.nextInt();
                System.out.println("P = α / 360 X πr^2");
                System.out.println(DisplayMethods.circleSectorField0(num, num0) + MathFunctions.circleSectorField(num, num0) + "π");
                break;

            case "circle segment area":
                System.out.println("Enter the angle of the circle sector and length of the radius");
                num = scanner.nextInt();
                num0 = scanner.nextInt();
                System.out.println("P = α / 360 X πr^2 - r^2 X sinα / 2");
                System.out.print(DisplayMethods.circleSegmentArea0(num, num0) + MathFunctions.circleSegmentArea(num, num0) + "π");
                break;

            case "increase":
                System.out.println("Enter the number you want increase.");
                num = scanner.nextInt();
                System.out.println(DisplayMethods.increase0(num) + MathFunctions.increase(num));
                break;

            case "What time is it?":
                System.out.println(localDateTime);
                break;

            case "give me random number":
                System.out.println(MathFunctions.randomNumber());
                break;

            case "temperature converting":
                System.out.println("What do you need to convert? Choose the number of operation.");
                System.out.println("1. Celsius to Fahrenheit.");
                System.out.println("2. Fahrenheit to Celsius.");
                System.out.println("3. Celsius to Kelvin.");
                System.out.println("4. Kelvin to Celsius.");
                Scanner scanner2 = new Scanner(System.in);
                String answer1 = scanner2.nextLine();

                switch (answer1) {

                    case "1":
                        System.out.println("Enter the value in degree Celsius.");
                        num = scanner2.nextInt();
                        System.out.println(MathFunctions.celsiusFahrenheit(num));
                        break;

                    case "2":
                        System.out.println("Enter the value in degree Fahrenheit.");
                        num0 = scanner2.nextInt();
                        System.out.println(MathFunctions.fahrenheitCelsius(num0));
                        break;

                    case "3":
                        System.out.println("Enter the value in degree Celsius.");
                        num1 = scanner2.nextInt();
                        System.out.println(MathFunctions.celsiusKelvin(num1));
                        break;

                    case "4":
                        System.out.println("Enter the value in degree Kelvin.");
                        int num2 = scanner2.nextInt();
                        System.out.println(MathFunctions.kelvinCelsius(num2));
                        break;

                    default:
                        System.out.println("I'm sorry, I haven't got more functions.");
                        break;
                }
                break;

            case "distance measure converting":
                System.out.println("What do you want to convert? Type 1 or 2.");
                System.out.println("1. kilometres to miles");
                System.out.println("2. miles to kilometres");
                Scanner scanner3 = new Scanner(System.in);
                String answer2 = scanner3.nextLine();

                switch (answer2) {

                    case "1":
                        System.out.println("Enter the value in km.");
                        num = scanner3.nextInt();
                        System.out.println(MathFunctions.converterKmsMiles(num));
                        break;

                    case "2":
                        System.out.println("Enter the value in miles.");
                        num = scanner3.nextInt();
                        System.out.println(MathFunctions.converterMilesKms(num));
                        break;

                    default:
                        System.out.println("I don't have this function.");
                        break;
                }
                break;
        }
    }
}
