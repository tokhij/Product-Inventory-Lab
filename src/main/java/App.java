import services.HookahService;

public class App {
    private HookahService hookahService = new HookahService();


    public static void main(String... args){
        App applcaiton = new App();
        applcaiton.init();
    }

    public void init(){

        Console.printWelcome();
    }
}
