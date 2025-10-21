import java.util.Scanner;

public class casaDomotica {

    static boolean allLightsOn;
    static 
    static Scanner sc = new Scanner(System.in);
    static boolean lR1,lR2,lR3,lBath,lKitchen,lDinningRoom;
    public static void main(String[] args) {
        //declarar variables locals
        boolean menuProgram = true;
        String selection;
        do  
        {
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("Welcome to our DOMOTIC HOUSE MENU");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("MENU");
            System.out.println();
            System.out.println("PICK YOUR OPTION DOWN BELOW:");
            System.out.println();
            System.out.println("1. Lights");
            System.out.println("2. Windows/Blinders");
            System.out.println("3. Roomba");
            System.out.println("4. Temperature");
            System.out.println("5. Check overall status");
            System.out.println("6. Quit menu");
            System.out.println();
            System.out.println("ENTER THE OPTION");
            selection = sc.nextLine();

            switch (selection) 
            {
                case "1", "1.", "Lights", "lights", "LIGHTS", "1. Lights", "1. lights", "1.Lights", "1.lights", "1. LIGHTS":
                    lightsMenu(selection);
                    break;

                case "6", "6.", "Quit", "QUIT", "quit", "6. Quit", "6. quit", "6. QUIT":
                menuProgram = false;
                default:
                    break;
            }
        } while (menuProgram);
    }
    public static void lightsMenu(String choice){
        System.out.println();
        System.out.println("You choosed the Lights menu");
        System.out.println("Pick a choice down below:");
        System.out.println();
        System.out.println("a. Choose room/s");
        System.out.println("b. All rooms");
        System.out.println("c. Back to menu");
        System.out.println();
        System.out.println("Write down here youre choice:");
        choice = sc.nextLine();
            switch (choice) {
                case "a. Choose room/s", "a", "A", "A.", "a.", "choose room/s", "Choose room/s", "room/s", "Room/s", "a Choose room/s", "A Choose room/s", "a. choose room/s", "A. choose room/s", "a. Room/s", "A. Room/s", "a Room/s", "A Room/s" :
                    
                    break;
            
                default:
                    break;
            }
    


    }
    public static void choiceRoom(){
        System.out.println();
        System.out.println("Please select the rooms you want:");
        System.out.println();
        System.out.println("");
    }


}


