import java.util.Scanner;

import static jdk.nashorn.internal.objects.Global.print;

public class Console {

    public static void printWelcome(){
        System.out.println("" +
                "**************************************************\n" +
                "***               Welcome to                   ***\n" +
                "***          Johnny Bravo's Lounge!            ***\n" +
                "***          ----------------------            ***\n" +
                "***             Please place your              ***\n" +
                "***             order down below!              ***\n" +
                "**************************************************\n");
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }
    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInputInt = scanner.nextInt();
        return userInputInt;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double userInputDouble = scanner.nextDouble();
        return userInputDouble;
    }



}
