import java.util.Scanner;


public class casaDomotica {

    static boolean allLightsOn;
    static String goBackMenu;
    static String choice, choice2;
    static String turnL;
    static Scanner sc = new Scanner(System.in);
    static boolean lR1,lR2,lR3,lBath,lKitchen,lDinningRoom;
    static boolean menuProgram = true, askForGoBackToMenu = false, lightsMenu = false;
    public static void main(String[] args) {
        //declarar variables locals
        
        String selection, selection1, selection2;
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
                    lightsMenu();
                    break;

                case "6", "6.", "Quit", "QUIT", "quit", "6. Quit", "6. quit", "6. QUIT":
                menuProgram = false;

            default:
                errorOfTyping();
                break;
            }
        } while (menuProgram);
    }
    public static void lightsMenu(){
        System.out.println("You choosed the Lights menu");
        lightsMenu = true;
        do {
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("Lights menu");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("Pick a choice down below:");
            System.out.println();
            System.out.println("a. Choose room/s");
            System.out.println("b. All rooms");
            System.out.println("c. Back to menu");
            System.out.println();
            System.out.println("Write down here youre choice:");
            choice = sc.nextLine();
            choice = choice.trim().toLowerCase();

                switch (choice) 
                {
                    
                    case "a. choose room/s","a. choose room", "a", "a.", "choose room/s", "choose room", "room","room/s", "a choose room/s", "a choose room" :
                        menuChoiceRoom();
                        switch (choice2) {
                            case "r1":
                                System.out.println("You chose the first room");
                                System.out.println("This is the state of your lights:  room 1 = " + (lR1 ? "ON" : "OFF"));
                                whatYouWantToDoWithLights();
                                
                                turnL = sc.nextLine();
                                turnL = turnL.trim();

                                    if (turnL.equalsIgnoreCase("on")) {
                                        lR1 = true;
                                        System.out.println();
                                        System.out.println("The lights of the room 1 are: "  + (lR1 ? "ON" : "OFF"));
                                        lightsMenu = false;
                                        askForGoBackMenu();
                                        lightsMenu =false;
                                        
                                        

                                        
                                        
                                    }
                                    else if (turnL.equalsIgnoreCase("off"))
                                    {
                                        System.out.println();
                                        System.out.println("The lights of the room 1 are: "  + (lR1 ? "ON" : "OFF"));
                                        lR1 = false;
                                        lightsMenu = false;
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }

                                break;
                            
                            case "r2":
                                System.out.println("You chose the second room");
                                System.out.println("This is the state of your lights:  room 2 = " + (lR2 ? "ON" : "OFF"));
                                whatYouWantToDoWithLights();
                                
                                turnL = sc.nextLine();
                                turnL = turnL.trim();

                                    if (turnL.equalsIgnoreCase("on")) {
                                        lR2 = true;
                                        System.out.println();
                                        System.out.println("The lights of the room 2 are: "  + (lR2 ? "ON" : "OFF"));
                                        lightsMenu = false;
                                        askForGoBackMenu();
                                        lightsMenu =false;
                                        
                                        

                                        
                                        
                                    }
                                    else if (turnL.equalsIgnoreCase("off"))
                                    {
                                        System.out.println();
                                        System.out.println("The lights of the room 2 are: "  + (lR2 ? "ON" : "OFF"));
                                        lR2 = false;
                                        lightsMenu = false;
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }

                                break;
                            case "r3":
                                System.out.println("You chose the third room");
                                System.out.println("This is the state of your lights:  room 3 = " + (lR3 ? "ON" : "OFF"));
                                whatYouWantToDoWithLights();
                                
                                turnL = sc.nextLine();
                                turnL = turnL.trim();

                                    if (turnL.equalsIgnoreCase("on")) {
                                        lR3 = true;
                                        System.out.println();
                                        System.out.println("The lights of the room 3 are: "  + (lR3 ? "ON" : "OFF"));
                                        lightsMenu = false;
                                        askForGoBackMenu();
                                        lightsMenu =false;
                                        
                                        

                                        
                                        
                                    }
                                    else if (turnL.equalsIgnoreCase("off"))
                                    {
                                        System.out.println();
                                        System.out.println("The lights of the room 3 are: "  + (lR3 ? "ON" : "OFF"));
                                        lR3 = false;
                                        lightsMenu = false;
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }

                                break;
                            
                            case "k":
                                System.out.println("You chose the kitchen");
                                System.out.println("This is the state of your lights:  kitchen = " + (lKitchen ? "ON" : "OFF"));
                                whatYouWantToDoWithLights();
                                
                                turnL = sc.nextLine();
                                turnL = turnL.trim();

                                    if (turnL.equalsIgnoreCase("on")) {
                                        lKitchen = true;
                                        System.out.println();
                                        System.out.println("The lights of the kitchen are: "  + (lKitchen ? "ON" : "OFF"));
                                        lightsMenu = false;
                                        askForGoBackMenu();
                                        lightsMenu =false;
                                        
                                        

                                        
                                        
                                    }
                                    else if (turnL.equalsIgnoreCase("off"))
                                    {
                                        System.out.println();
                                        System.out.println("The lights of the kitchen are: "  + (lKitchen ? "ON" : "OFF"));
                                        lBath = false;
                                        lightsMenu = false;
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }

                                break;
                                
                            case "b":
                                System.out.println("You chose the bathroom");
                                System.out.println("This is the state of your lights:  bathroom = " + (lBath ? "ON" : "OFF"));
                                whatYouWantToDoWithLights();
                                
                                turnL = sc.nextLine();
                                turnL = turnL.trim();

                                    if (turnL.equalsIgnoreCase("on")) {
                                        lBath = true;
                                        System.out.println();
                                        System.out.println("The lights of the bathroom are: "  + (lBath ? "ON" : "OFF"));
                                        lightsMenu = false;
                                        askForGoBackMenu();
                                        lightsMenu =false;
                                        
                                        

                                        
                                        
                                    }
                                    else if (turnL.equalsIgnoreCase("off"))
                                    {
                                        System.out.println();
                                        System.out.println("The lights of the bathroom are: "  + (lBath ? "ON" : "OFF"));
                                        lBath = false;
                                        lightsMenu = false;
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }

                                break;

                            case "r1,r2":
                                System.out.println("You chose the first room");
                                System.out.println("This is the state of your lights: r1 = " + (lR1 ? "ON" : "OFF") +" r2 = " + ( lR2 ? "ON" : "OFF"));
                                whatYouWantToDoWithLights();
                                turnL = sc.nextLine();
                                turnL = turnL.trim();

                                    if (turnL.equalsIgnoreCase("on")) {
                                        lR1 = true;
                                        System.out.println();
                                        System.out.println("The lights of the room 1 are: "  + (lR1 ? "ON" : "OFF"));
                                        System.out.println("The lights of the room 2 are: "  + (lR2 ? "ON" : "OFF"));
                                        lightsMenu = false;
                                        askForGoBackMenu();
                                        lightsMenu =false;
                                        
                                        

                                        
                                        
                                    }
                                    else if (turnL.equalsIgnoreCase("off"))
                                    {
                                        System.out.println();
                                        System.out.println("The lights of the room 1 are: "  + (lR1 ? "ON" : "OFF"));
                                        System.out.println("The lights of the room 2 are: "  + (lR2 ? "ON" : "OFF"));
                                        lR1 = false;
                                        lightsMenu = false;
                                    }
                                    else
                                    
                                    {
                                        errorOfTyping();
                                    }

                            break;
                        case "r1,r3":
                                System.out.println("You chose the first room");
                                System.out.println("This is the state of your lights: r3 = " + (lR1 ? "ON" : "OFF") +" r2 = " + ( lR3 ? "ON" : "OFF"));
                                whatYouWantToDoWithLights();
                                turnL = sc.nextLine();
                                turnL = turnL.trim();

                                    if (turnL.equalsIgnoreCase("on")) {
                                        lR1 = true;
                                        System.out.println();
                                        System.out.println("The lights of the room 1 are: "  + (lR1 ? "ON" : "OFF"));
                                        System.out.println("The lights of the room 2 are: "  + (lR2 ? "ON" : "OFF"));
                                        lightsMenu = false;
                                        askForGoBackMenu();
                                        lightsMenu =false;
                                        
                                        

                                        
                                        
                                    }
                                    else if (turnL.equalsIgnoreCase("off"))
                                    {
                                        System.out.println();
                                        System.out.println("The lights of the room 1 are: "  + (lR1 ? "ON" : "OFF"));
                                        System.out.println("The lights of the room 2 are: "  + (lR2 ? "ON" : "OFF"));
                                        lR1 = false;
                                        lightsMenu = false;
                                    }
                                    else
                                    
                                    {
                                        errorOfTyping();
                                    }

                            break;
                        default:
                            errorOfTyping();
                            break;
                        }
                        break;
                
                    default:
                        errorOfTyping();
                        break;
                }
        } while (lightsMenu);
        
    


    }
    public static void blindersAndWindowsMenu(){

    }
    public static void menuChoiceRoom(){
        System.out.println();
        System.out.println("Please select the rooms you want:");
        System.out.println();
        System.out.println("r1 for first room");
        System.out.println("r2 for second room");
        System.out.println("r3 for third room");
        System.out.println("k for kitchen");
        System.out.println("b for bathroom");
        System.out.println("d for dinningroom");
        System.out.println();
        System.out.println("write your rooms following this format and in order (r1,r3,k,b,d...) or if it's just one (r1)");
        choice2 = sc.nextLine();

    }
    public static void askForGoBackMenu(){
        askForGoBackToMenu = true;
        do {
            System.out.println();
            System.out.println("You want to go back to menu or quit program? (Yes // No):");
            goBackMenu = sc.nextLine();
            goBackMenu = goBackMenu.trim(); // Esborra el menu 
                if (goBackMenu.equals("yes")) {
                    System.out.println("Going back to menu....");
                    System.out.println();
                    askForGoBackToMenu = false;
                    
                    
                }
                else if (goBackMenu.equals("no")) {
                    System.out.println("Shutting down program...");
                    System.out.println();
                    System.out.println("Goodbye...");
                    System.out.println();
                    System.out.println("-------------------------------------");
                    askForGoBackToMenu = false;
                    menuProgram = false;
                }
                else{
                    System.out.println("Wrong entry");
                    System.out.println("It's (Yes or No)");
                    System.out.println("Try again");
                }
        } while (askForGoBackToMenu);
        


    }
    public static void errorOfTyping(){
        System.out.println("Wrong entry type or Wrong order of terms");
        System.out.println("Please try it again");
        System.out.println("Going back ....");
    }
    public static void whatYouWantToDoWithLights(){
        System.out.println("What would you like to do? ");
        System.out.println("Turn it on = ON | Turn it off = OFF");
    }
}



