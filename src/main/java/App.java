import services.HookahService;

import java.util.Scanner;

public class App {
    private HookahService hookahService = new HookahService();
//    private Integer id;

    public static void main(String... args){
        App application = new App();
        application.init();
    }

    public void init(){
        Console.printWelcome();
        Scanner scanner = new Scanner(System.in);
        System.out.println("which brand of Hookah do you prefer? (Khalil Mahmoon or Maya)");
        String brand = scanner.nextLine();
        System.out.println("What size Hookah would you prefer? (Small, Medium or Large)");
        String size = scanner.nextLine();
        System.out.println("That will be a flat rate of $100.00 USD please!");
        hookahService.create(brand, size);
    }
}
