import java.util.InputMismatchException;
import java.util.Scanner;


public class casaDomoticaFinal {

    
    static String goBackMenu;
    static int hour;
    static int selectedHour = -1;
    static int selectedHour2 = -1;
    static boolean validHour = false;
    static boolean validHour2 = false;
    static double autoTemp = -1;
    static double autoTemp2 = -1;
    static boolean validTemp = false, validTemp2 = false;
    static int selectedHourL = -1;
    static int selectedHourL2 = -1;
    static boolean validHourL = false;
    static boolean validHourL2 = false;
    static boolean autoLight = false;
    static boolean autoLight2 = false;
    static boolean validLight = false, validLight2 = false;
    static int selectedHourB = -1;
    static int selectedHourB2 = -1;
    static boolean validHourB = false;
    static boolean validHourB2 = false;
    static boolean autoBlinder = false;
    static boolean autoBlinder2 = false;
    static boolean validBlinder = false, validBlinder2 = false;
    static int selectedHourR = -1;
    static int selectedHourR2 = -1;
    static boolean validHourR = false;
    static boolean validHourR2 = false;
    static boolean autoRoomba = false;
    static boolean autoRoomba2 = false;
    static boolean validRoomba = false;
    static String choice, choice2, automatic;
    static String turnL,turnB, turnR;
    static double turnT;
    static Scanner sc = new Scanner(System.in);
    static boolean lR1 = false ,lR2 = false ,lR3 = false,lBath = false ,lKitchen = false,lDinningRoom = false;
    static boolean bR1 = false ,bR2 = false ,bR3 = false ,bBath= false ,bKitchen = false ,bDinningRoom = false;
    static boolean rR1 = false ,rR2 = false ,rR3 = false ,rBath= false ,rKitchen = false ,rDinningRoom = false;
    static double tR1 = 25,tR2 = 25, tR3= 25,tBath = 25,tKitchen = 25,tDinningRoom = 25;
    static boolean menuProgram = true, askForGoBackToMenu = false, lightsMenu = false, blindersMenu = false, roombaMenu = false ,tempMenu = false;
    public static void main(String[] args) {
        //declarar variables locals
        
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
            System.out.println("2. Blinders");
            System.out.println("3. Roomba");
            System.out.println("4. Temperature");
            System.out.println("5. Check overall status");
            System.out.println("6. Quit menu");
            System.out.println();
            System.out.println("ENTER THE OPTION");
            selection = sc.nextLine();
            selection = selection.trim().toLowerCase();

            switch (selection) 
            {
                case "1", "1.", "lights", "1. lights",  "1.lights" :
                    System.out.println("You choosed the Lights menu");
                    
                    lightsMenu();
                    break;

                case "2", "2.", "blinders", "2.blinders","2. blinders":
                    System.out.println("You chose to control the Blinders");
                    sc.nextLine();
                    blindersMenu();
                    break;
                case "3", "3.", "roomba", "3.roomba",  "3. roomba" :
                    System.out.println("You chose to control the Roomba");
                    
                    roombaMenu();
                    break;
                case "4", "4.", "temperature", "4.temperature",  "4. temperature" :
                    System.out.println("You chose to change the temperature");
                    
                    temparatureMenu();
                    break;
                case "5", "5.", "check overall status", "overall status",  "5. overall status" :
                    System.out.println("You choosed to check the overall status");
                    
                    overallState();
                    

                    break;
                case "6", "6.", "Quit", "QUIT", "quit", "6. Quit", "6. quit", "6. QUIT":
                    System.out.println("You chose to quit");
                    System.out.println("Shutting down program...");
                    System.out.println();
                    System.out.println("Goodbye...");
                    System.out.println();
                    System.out.println("-------------------------------------");
                    menuProgram = false;

                    break;
                

            default:
                errorOfTyping();
                break;
            }
        } while (menuProgram);
    }
    public static void lightsMenu(){
        lightsMenu = true;
        do {
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("         LIGHTS MENU         ");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("What do you want to do with Lights?");
            System.out.println("1. Set lights for a specific room/s (Manually)");
            System.out.println("2. Set automatic lights in specific hours (Automatic)");
            System.out.println("Pick a choice down below:");
            automatic = sc.nextLine();
            automatic = automatic.trim().toLowerCase();
            switch (automatic) {
                case "1", "1.", "set lights for a specific room/s", "set lights", "specific room", "specific rooms", "manual", "manually":
                    System.out.println();
                    System.out.println("You chose to control lights manually:");
                    System.out.println();
                    System.out.println("a. Choose room");
                    System.out.println("b. All rooms");
                    System.out.println("c. Back to menu");
                    System.out.println();
                    System.out.println("Write down here youre choice:");
                    choice = sc.nextLine();
                    choice = choice.trim().toLowerCase();
                    switch (choice) 
                    {
                        case "a. choose room", "a", "a.", "choose room", "room", "a choose room" :
                            menuChoiceRoom();
                            switch (choice2) 
                            { 
                                case "r1":
                                    System.out.println("----------------------------------");
                                    System.out.println("This is the state of your lights:  room 1 = " + (lR1 ? "ON" : "OFF"));
                                    whatYouWantToDoWithLights();
                                    
                                    turnL = sc.nextLine();
                                    turnL = turnL.trim();

                                    if (turnL.equalsIgnoreCase("on")) {
                                        lR1 = true;
                                        System.out.println();
                                        stateOfR1();
                                        
                                    }
                                    else if (turnL.equalsIgnoreCase("off"))
                                    {
                                        lR1 = false;
                                        System.out.println();
                                        stateOfR1();
                                        
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }
                                    sc.nextLine();
                                break;
                            
                                case "r2":
                                    System.out.println("----------------------------------");
                                    System.out.println("You chose the second room");
                                    System.out.println("This is the state of your lights:  room 2 = " + (lR2 ? "ON" : "OFF"));
                                    whatYouWantToDoWithLights();
                                    
                                    turnL = sc.nextLine();
                                    turnL = turnL.trim();

                                    if (turnL.equalsIgnoreCase("on")) {
                                        lR2 = true;
                                        System.out.println();
                                        stateOfR2();
                                        
                                    }
                                    else if (turnL.equalsIgnoreCase("off"))
                                    {   
                                        lR2 = false;
                                        System.out.println();
                                        stateOfR2();
                                        
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }
                                    sc.nextLine();
                                break;
                                case "r3":
                                    System.out.println("----------------------------------");
                                    System.out.println("You chose the third room");
                                    System.out.println("This is the state of your lights:  room 3 = " + (lR3 ? "ON" : "OFF"));
                                    whatYouWantToDoWithLights();
                                    
                                    turnL = sc.nextLine();
                                    turnL = turnL.trim();

                                    if (turnL.equalsIgnoreCase("on")) {
                                        lR3 = true;
                                        System.out.println();
                                        stateOfR3();
                                        
                                    }
                                    else if (turnL.equalsIgnoreCase("off"))
                                    {
                                        lR3 = false;
                                        System.out.println();
                                        stateOfR3();
                                        
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }
                                    sc.nextLine();
                                break;
                            
                                case "k":
                                    System.out.println("----------------------------------");
                                    System.out.println("You chose the Kitchen");
                                    System.out.println("This is the state of your lights:  kitchen = " + (lKitchen ? "ON" : "OFF"));
                                    whatYouWantToDoWithLights();
                                    
                                    turnL = sc.nextLine();
                                    turnL = turnL.trim();

                                    if (turnL.equalsIgnoreCase("on")) {
                                        lKitchen = true;
                                        System.out.println();
                                        stateOfK();
                                        
                                    }
                                    else if (turnL.equalsIgnoreCase("off"))
                                    {
                                        lKitchen = false;
                                        System.out.println();
                                        stateOfK();
                                        
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }
                                    sc.nextLine();
                                break;
                                
                                case "b":
                                    System.out.println("----------------------------------");
                                    System.out.println("You chose the Bathroom");
                                    System.out.println("This is the state of your lights:  bathroom = " + (lBath ? "ON" : "OFF"));
                                    whatYouWantToDoWithLights();
                                    
                                    turnL = sc.nextLine();
                                    turnL = turnL.trim();

                                    if (turnL.equalsIgnoreCase("on")) {
                                        lBath = true;
                                        System.out.println();
                                        stateOfB();
                                        
                                    }
                                    else if (turnL.equalsIgnoreCase("off"))
                                    {
                                        lBath = false;
                                        System.out.println();
                                        stateOfB();
                                        
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }
                                    sc.nextLine();
                                break;

                                case "d":
                                    System.out.println("----------------------------------");
                                    System.out.println("You chose the Dinning Room");
                                    System.out.println("This is the state of your lights:  Dinning Room = " + (lDinningRoom ? "ON" : "OFF"));
                                    whatYouWantToDoWithLights();
                                    
                                    turnL = sc.nextLine();
                                    turnL = turnL.trim();

                                    if (turnL.equalsIgnoreCase("on")) {
                                        lDinningRoom = true;
                                        System.out.println();
                                        stateOfD();
                                        
                                    }
                                    else if (turnL.equalsIgnoreCase("off"))
                                    {
                                        lDinningRoom = false;
                                        System.out.println();
                                        stateOfD();
                                        
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }
                                    sc.nextLine();
                                break;
                        
                            default:
                                errorOfTyping();
                                break;
                        
                            }
                            askForGoBackMenu();
                            lightsMenu = false;
                            break;
                            
                        case "b", "b.", "b all rooms", "all rooms", "all", "all room", "b all", "b all room":
                            System.out.println("You chose to control all rooms.");
                            whatYouWantToDoWithLights();
                            turnL = sc.nextLine();
                            turnL = turnL.trim();

                            if (turnL.equalsIgnoreCase("on")) {
                                lR1 = lR2 = lR3 = lKitchen = lBath = lDinningRoom = true;
                                System.out.println();
                                stateOfR1();
                                stateOfR2();
                                stateOfR3();
                                stateOfK();
                                stateOfB();
                                stateOfD();
                                askForGoBackMenu();
                                lightsMenu = false;
                                
                            } else if (turnL.equalsIgnoreCase("off")) {
                                lR1 = lR2 = lR3 = lKitchen = lBath = lDinningRoom = false;
                                System.out.println();
                                stateOfR1();
                                stateOfR2();
                                stateOfR3();
                                stateOfK();
                                stateOfB();
                                stateOfD();
                                askForGoBackMenu();
                                lightsMenu = false;
                            } else {
                                errorOfTyping();
                            }
                            sc.nextLine();
                            break;

                        case "c", "c.", "back", "back to menu", "return", "return to menu", "main menu", "go back":
                            System.out.println("Returning to main menu...");
                            lightsMenu = false;
                            sc.nextLine();
                            break;

                        default:
                            errorOfTyping();
                            break;
                        
                    }
                    lightsMenu = false;
                    break;
                case "2", "2.", "set automatic lights in specific hours", "set automatic lights", "automatic lights", "automatic", "auto":
                    System.out.println();
                    System.out.println("You chose to set automatic lights in specific hours:");
                    System.out.println("----------------------------------");
                    System.out.println("Pick a choice down below:");
                    System.out.println("a. Choose room");
                    System.out.println("b. All rooms");
                    System.out.println("c. Back to menu");
                    choice = sc.nextLine();
                    choice = choice.trim().toLowerCase();
                    switch (choice) 
                    {
                        case "a. choose room", "a", "a.", "choose room", "room", "a choose room" :
                            menuChoiceRoom();
                            choseAutoLight();
                            for (hour = 0; hour <= 23; hour++) {
                                System.out.println("Time----> " + hour + ":00");
                                if (hour == selectedHourL) {
                                    System.out.println();
                                    System.out.println("----------------------------------");
                                    System.out.println("AUTOMATIC LIGHTS ACTIVATED AT HOUR " + selectedHourL + ":00");
                                    System.out.println("----------------------------------");
                                    System.out.println();
                                    String room = choice2.trim().toLowerCase();
                                    switch (room) {
                                        case "r1":
                                            lR1 = autoLight;
                                            System.out.println("Room 1 lights set to: " + (autoLight ? "ON" : "OFF"));
                                            sc.nextLine();
                                            break;
                                        case "r2":
                                            lR2 = autoLight;
                                            System.out.println("Room 2 lights set to: " + (autoLight ? "ON" : "OFF"));
                                            sc.nextLine();
                                            break;
                                        case "r3":
                                            lR3 = autoLight;
                                            System.out.println("Room 3 lights set to: " + (autoLight ? "ON" : "OFF"));
                                            sc.nextLine();
                                            break;
                                        case "k":
                                            lKitchen = autoLight;
                                            System.out.println("Kitchen lights set to: " + (autoLight ? "ON" : "OFF"));
                                            sc.nextLine();
                                            break;
                                        case "b":
                                            lBath = autoLight;
                                            System.out.println("Bathroom lights set to: " + (autoLight ? "ON" : "OFF"));
                                            sc.nextLine();
                                            break;
                                        case "d":
                                            lDinningRoom = autoLight;
                                            System.out.println("Dinning Room lights set to: " + (autoLight ? "ON" : "OFF"));
                                            sc.nextLine();
                                            break;
                                    }
                                }
                                if (hour == selectedHourL2) {
                                    System.out.println("----------------------------------");
                                    System.out.println("AUTOMATIC LIGHTS ACTIVATED AT HOUR " + selectedHourL2 + ":00");
                                    System.out.println("----------------------------------");
                                    System.out.println();
                                    String room = choice2.trim().toLowerCase();
                                    switch (room) {
                                        case "r1":
                                            lR1 = autoLight2;
                                            System.out.println("Room 1 lights set to: " + (autoLight2 ? "ON" : "OFF"));
                                            sc.nextLine();
                                            break;
                                        case "r2":
                                            lR2 = autoLight2;
                                            System.out.println("Room 2 lights set to: " + (autoLight2 ? "ON" : "OFF"));
                                            sc.nextLine();
                                            break;
                                        case "r3":
                                            lR3 = autoLight2;
                                            System.out.println("Room 3 lights set to: " + (autoLight2 ? "ON" : "OFF"));
                                            sc.nextLine();
                                            break;
                                        case "k":
                                            lKitchen = autoLight2;
                                            System.out.println("Kitchen lights set to: " + (autoLight2 ? "ON" : "OFF"));
                                            sc.nextLine();
                                            break;
                                        case "b":
                                            lBath = autoLight2;
                                            System.out.println("Bathroom lights set to: " + (autoLight2 ? "ON" : "OFF"));
                                            sc.nextLine();
                                            break;
                                        case "d":
                                            lDinningRoom = autoLight2;
                                            System.out.println("Dinning Room lights set to: " + (autoLight2 ? "ON" : "OFF"));
                                            sc.nextLine();
                                            break;
                                    }
                                }
                            }
                            System.out.println();
                            System.out.println("Automatic lights schedule has been set.");
                            System.out.println("Returning to LIGHTS MENU...");
                            System.out.println();
                            validHourL = false;
                            validLight = false;
                            validLight2 = false;
                            lightsMenu = false; 
                            break;
                        case "b", "b.", "b all rooms", "all rooms", "all", "all room", "b all", "b all room":
                            System.out.println("You chose to control all rooms.");
                            choseAutoLight();
                            for (hour = 0; hour <= 23; hour++) {
                                System.out.println("Time----> " + hour + ":00");
                                if (hour == selectedHourL) {
                                    System.out.println();
                                    System.out.println("----------------------------------");
                                    System.out.println("AUTOMATIC LIGHTS ACTIVATED AT HOUR " + selectedHourL + ":00");
                                    System.out.println("----------------------------------");
                                    System.out.println();
                                    lR1 = lR2 = lR3 = lKitchen = lBath = lDinningRoom = autoLight;
                                    System.out.println("Lights set to: " + (autoLight ? "ON" : "OFF"));
                                }
                                if (hour == selectedHourL2) {
                                    System.out.println("----------------------------------");
                                    System.out.println("AUTOMATIC LIGHTS ACTIVATED AT HOUR " + selectedHourL2 + ":00");
                                    System.out.println("----------------------------------");
                                    System.out.println();
                                    lR1 = lR2 = lR3 = lKitchen = lBath = lDinningRoom = autoLight2;
                                    System.out.println("Lights set to: " + (autoLight2 ? "ON" : "OFF"));
                                }
                            }
                            System.out.println("Returning to main menu...");
                            validHourL = false;
                            validLight = false;
                            validLight2 = false;
                            lightsMenu = false;
                            break;
                        case "c", "c.", "back", "back to menu", "return", "return to menu", "main menu", "go back":
                            System.out.println("Returning to main menu...");
                            lightsMenu = false;
                            break;
                        default:
                            errorOfTyping();
                            break;
                    }
                    break;
            }
        } while (lightsMenu);
    }
    public static void blindersMenu(){
        blindersMenu = true;
        do {
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("         BLINDERS MENU         ");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("What do you want to do with BLINDERS?");
            System.out.println("1. Set BLINDERS for a specific room/s (Manually)");
            System.out.println("2. Set automatic BLINDERS in specific hours (Automatic)");
            System.out.println("Pick a choice down below:");
            automatic = sc.nextLine();
            automatic = automatic.trim().toLowerCase();
            switch (automatic) {
                case "1", "1.", "set BLINDERS for a specific room/s", "set BLINDERS", "specific room", "specific rooms", "manual", "manually":
                    System.out.println();
                    System.out.println("You chose to cOPENtrol BLINDERS manually:");
                    System.out.println();
                    System.out.println("a. Choose room");
                    System.out.println("b. All rooms");
                    System.out.println("c. Back to menu");
                    System.out.println();
                    System.out.println("Write down here youre choice:");
                    choice = sc.nextLine();
                    choice = choice.trim().toLowerCase();
                    switch (choice) 
                    {
                        case "a. choose room", "a", "a.", "choose room", "room", "a choose room" :
                            menuChoiceRoom();
                            switch (choice2) 
                            { 
                                case "r1":
                                    System.out.println("----------------------------------");
                                    System.out.println("This is the state of your BLINDERS:  room 1 = " + (bR1 ? "OPEN" : "CLOSED"));
                                    whatYouWantToDoWithBlinders();
                                    
                                    turnB = sc.nextLine();
                                    turnB = turnB.trim();

                                    if (turnB.equalsIgnoreCase("OPEN")) {
                                        bR1 = true;
                                        System.out.println();
                                        stateOfBR1();
                                        
                                    }
                                    else if (turnB.equalsIgnoreCase("CLOSED"))
                                    {
                                        bR1 = false;
                                        System.out.println();
                                        stateOfBR1();
                                        
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }

                                break;
                            
                                case "r2":
                                    System.out.println("----------------------------------");
                                    System.out.println("You chose the secOPENd room");
                                    System.out.println("This is the state of your BLINDERS:  room 2 = " + (bR2 ? "OPEN" : "CLOSED"));
                                    whatYouWantToDoWithBlinders();
                                    
                                    turnB = sc.nextLine();
                                    turnB = turnB.trim();

                                    if (turnB.equalsIgnoreCase("OPEN")) {
                                        bR2 = true;
                                        System.out.println();
                                        stateOfBR2();
                                        
                                    }
                                    else if (turnB.equalsIgnoreCase("CLOSED"))
                                    {   
                                        bR2 = false;
                                        System.out.println();
                                        stateOfBR2();
                                        
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }

                                break;
                                case "r3":
                                    System.out.println("----------------------------------");
                                    System.out.println("You chose the third room");
                                    System.out.println("This is the state of your BLINDERS:  room 3 = " + (bR3 ? "OPEN" : "CLOSED"));
                                    whatYouWantToDoWithBlinders();
                                    
                                    turnB = sc.nextLine();
                                    turnB = turnB.trim();

                                    if (turnB.equalsIgnoreCase("OPEN")) {
                                        bR3 = true;
                                        System.out.println();
                                        stateOfBR3();
                                        
                                    }
                                    else if (turnB.equalsIgnoreCase("CLOSED"))
                                    {
                                        bR3 = false;
                                        System.out.println();
                                        stateOfBR3();
                                        
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }

                                break;
                            
                                case "k":
                                    System.out.println("----------------------------------");
                                    System.out.println("You chose the Kitchen");
                                    System.out.println("This is the state of your BLINDERS:  kitchen = " + (bKitchen ? "OPEN" : "CLOSED"));
                                    whatYouWantToDoWithBlinders();
                                    
                                    turnB = sc.nextLine();
                                    turnB = turnB.trim();

                                    if (turnB.equalsIgnoreCase("OPEN")) {
                                        bKitchen = true;
                                        System.out.println();
                                        stateOfBK();
                                        
                                    }
                                    else if (turnB.equalsIgnoreCase("CLOSED"))
                                    {
                                        bKitchen = false;
                                        System.out.println();
                                        stateOfBK();
                                        
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }

                                break;
                                
                                case "b":
                                    System.out.println("----------------------------------");
                                    System.out.println("You chose the Bathroom");
                                    System.out.println("This is the state of your BLINDERS:  bathroom = " + (bBath ? "OPEN" : "CLOSED"));
                                    whatYouWantToDoWithBlinders();
                                    
                                    turnB = sc.nextLine();
                                    turnB = turnB.trim();

                                    if (turnB.equalsIgnoreCase("OPEN")) {
                                        bBath = true;
                                        System.out.println();
                                        stateOfBB();
                                        
                                    }
                                    else if (turnB.equalsIgnoreCase("CLOSED"))
                                    {
                                        bBath = false;
                                        System.out.println();
                                        stateOfBB();
                                        
                                    }
                                    else
                                    {
                                        errorOfTyping();
                                    }

                                break;

                                case "d":
                                    System.out.println("----------------------------------");
                                    System.out.println("You chose the Dinning Room");
                                    System.out.println("This is the state of your BLINDERS:  Dinning Room = " + (bDinningRoom ? "OPEN" : "CLOSED"));
                                    whatYouWantToDoWithBlinders();
                                    
                                    turnB = sc.nextLine();
                                    turnB = turnB.trim();

                                    if (turnB.equalsIgnoreCase("OPEN")) {
                                        bDinningRoom = true;
                                        System.out.println();
                                        stateOfBD();
                                        
                                    }
                                    else if (turnB.equalsIgnoreCase("CLOSED"))
                                    {
                                        bDinningRoom = false;
                                        System.out.println();
                                        stateOfBD();
                                        
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
                            askForGoBackMenu();
                            blindersMenu = false;
                            break;
                            
                        case "b", "b.", "b all rooms", "all rooms", "all", "all room", "b all", "b all room":
                            System.out.println("You chose to cotrol all rooms.");
                            whatYouWantToDoWithBlinders();
                            turnB = sc.nextLine();
                            turnB = turnB.trim();

                            if (turnB.equalsIgnoreCase("OPEN")) {
                                bR1 = bR2 = bR3 = bKitchen = bBath = bDinningRoom = true;
                                System.out.println();
                                stateOfBR1();
                                stateOfBR2();
                                stateOfBR3();
                                stateOfBK();
                                stateOfBB();
                                stateOfBD();
                                askForGoBackMenu();
                                blindersMenu = false;
                                
                            } else if (turnB.equalsIgnoreCase("CLOSED")) {
                                bR1 = bR2 = bR3 = bKitchen = bBath = bDinningRoom = false;
                                System.out.println();
                                stateOfBR1();
                                stateOfBR2();
                                stateOfBR3();
                                stateOfBK();
                                stateOfBB();
                                stateOfBD();
                                askForGoBackMenu();
                                blindersMenu = false;
                            } else {
                                errorOfTyping();
                            }
                            break;

                        case "c", "c.", "back", "back to menu", "return", "return to menu", "main menu", "go back":
                            System.out.println("Returning to main menu...");
                            blindersMenu = false;
                            break;

                        default:
                            errorOfTyping();
                            break;
                        
                    }
                    blindersMenu = false;
                    break;
                case "2", "2.", "set automatic BLINDERS in specific hours", "set automatic BLINDERS", "automatic BLINDERS", "automatic", "auto":
                    System.out.println();
                    System.out.println("You chose to set automatic BLINDERS in specific hours:");
                    System.out.println("----------------------------------");
                    System.out.println("Pick a choice down below:");
                    System.out.println("a. Choose room");
                    System.out.println("b. All rooms");
                    System.out.println("c. Back to menu");
                    choice = sc.nextLine();
                    choice = choice.trim().toLowerCase();
                    switch (choice) 
                    {
                        case "a. choose room", "a", "a.", "choose room", "room", "a choose room" :
                            menuChoiceRoom();
                            choseAutoBlinder();
                            for (hour = 0; hour <= 23; hour++) {
                                System.out.println("Time----> " + hour + ":00");
                                if (hour == selectedHourB) {
                                    System.out.println();
                                    System.out.println("----------------------------------");
                                    System.out.println("AUTOMATIC BLINDERS ACTIVATED AT HOUR " + selectedHourB + ":00");
                                    System.out.println("----------------------------------");
                                    System.out.println();
                                    String room = choice2.trim().toLowerCase();
                                    switch (room) {
                                        case "r1":
                                            bR1 = autoBlinder;
                                            System.out.println("Room 1 BLINDERS set to: " + (autoBlinder ? "OPEN" : "CLOSED"));
                                            break;
                                        case "r2":
                                            bR2 = autoBlinder;
                                            System.out.println("Room 2 BLINDERS set to: " + (autoBlinder ? "OPEN" : "CLOSED"));
                                            break;
                                        case "r3":
                                            bR3 = autoBlinder;
                                            System.out.println("Room 3 BLINDERS set to: " + (autoBlinder ? "OPEN" : "CLOSED"));
                                            break;
                                        case "k":
                                            bKitchen = autoBlinder;
                                            System.out.println("Kitchen BLINDERS set to: " + (autoBlinder ? "OPEN" : "CLOSED"));
                                            break;
                                        case "b":
                                            bBath = autoBlinder;
                                            System.out.println("Bathroom BLINDERS set to: " + (autoBlinder ? "OPEN" : "CLOSED"));
                                            break;
                                        case "d":
                                            bDinningRoom = autoBlinder;
                                            System.out.println("Dinning Room BLINDERS set to: " + (autoBlinder ? "OPEN" : "CLOSED"));
                                            break;
                                    }
                                }
                                if (hour == selectedHourB2) {
                                    System.out.println("----------------------------------");
                                    System.out.println("AUTOMATIC BLINDERS ACTIVATED AT HOUR " + selectedHourB2 + ":00");
                                    System.out.println("----------------------------------");
                                    System.out.println();
                                    String room = choice2.trim().toLowerCase();
                                    switch (room) {
                                        case "r1":
                                            bR1 = autoBlinder2;
                                            System.out.println("Room 1 BLINDERS set to: " + (autoBlinder2 ? "OPEN" : "CLOSED"));
                                            break;
                                        case "r2":
                                            bR2 = autoBlinder2;
                                            System.out.println("Room 2 BLINDERS set to: " + (autoBlinder2 ? "OPEN" : "CLOSED"));
                                            break;
                                        case "r3":
                                            bR3 = autoBlinder2;
                                            System.out.println("Room 3 BLINDERS set to: " + (autoBlinder2 ? "OPEN" : "CLOSED"));
                                            break;
                                        case "k":
                                            bKitchen = autoBlinder2;
                                            System.out.println("Kitchen BLINDERS set to: " + (autoBlinder2 ? "OPEN" : "CLOSED"));
                                            break;
                                        case "b":
                                            bBath = autoBlinder2;
                                            System.out.println("Bathroom BLINDERS set to: " + (autoBlinder2 ? "OPEN" : "CLOSED"));
                                            break;
                                        case "d":
                                            bDinningRoom = autoBlinder2;
                                            System.out.println("Dinning Room BLINDERS set to: " + (autoBlinder2 ? "OPEN" : "CLOSED"));
                                            break;
                                    }
                                }
                            }
                            System.out.println();
                            System.out.println("Automatic BLINDERS schedule has been set.");
                            System.out.println("Returning to BLINDERS MENU...");
                            System.out.println();
                            validHourB = false;
                            validBlinder = false;
                            validBlinder2 = false;
                            blindersMenu = false; 
                            break;
                        case "b", "b.", "b all rooms", "all rooms", "all", "all room", "b all", "b all room":
                            System.out.println("You chose to control all rooms.");
                            choseAutoBlinder();
                            for (hour = 0; hour <= 23; hour++) {
                                System.out.println("Time----> " + hour + ":00");
                                if (hour == selectedHourB) {
                                    System.out.println();
                                    System.out.println("----------------------------------");
                                    System.out.println("AUTOMATIC BLINDERS ACTIVATED AT HOUR " + selectedHourB + ":00");
                                    System.out.println("----------------------------------");
                                    System.out.println();
                                    bR1 = bR2 = bR3 = bKitchen = bBath = bDinningRoom = autoBlinder;
                                    System.out.println("BLINDERS set to: " + (autoBlinder ? "OPEN" : "CLOSED"));
                                }
                                if (hour == selectedHourB2) {
                                    System.out.println("----------------------------------");
                                    System.out.println("AUTOMATIC BLINDERS ACTIVATED AT HOUR " + selectedHourB2 + ":00");
                                    System.out.println("----------------------------------");
                                    System.out.println();
                                    bR1 = bR2 = bR3 = bKitchen = bBath = bDinningRoom = autoBlinder2;
                                    System.out.println("BLINDERS set to: " + (autoBlinder2 ? "OPEN" : "CLOSED"));
                                }
                            }
                            System.out.println("Returning to main menu...");
                            validHourB = false;
                            validBlinder = false;
                            validBlinder2 = false;
                            blindersMenu = false;
                            break;
                        case "c", "c.", "back", "back to menu", "return", "return to menu", "main menu", "go back":
                            System.out.println("Returning to main menu...");
                            blindersMenu = false;
                            break;
                        default:
                            errorOfTyping();
                            break;
                    }
                    break;
            }
        } while (blindersMenu);
    }

    public static void roombaMenu(){
        //Will be doing fully CLEANED or NOT CLEANED, in the final version will be automatic cleaning
        roombaMenu = true;
        do {
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("           ROOMBA MENU            ");
            System.out.println();
            System.out.println("----------------------------------");
            System.out.println();
            System.out.println("What do you want to do with Roomba?");
            System.out.println("1. Set Roomba for a specific room/s (Manually)");
            System.out.println("2. Set automatic Roomba in specific hours (Automatic)");
            System.out.println("Pick a choice down below:");
            automatic = sc.nextLine();
            automatic = automatic.trim().toLowerCase();
            switch (automatic) {
                case "1", "1.", "set roomba for a specific room/s", "set roomba", "specific room", "specific rooms", "manual", "manually":
                    System.out.println();
                    System.out.println("You chose to control Roomba manually:");
                    System.out.println();
                    System.out.println("a. Choose room");
                    System.out.println("b. All rooms");
                    System.out.println("c. Back to menu");
                    System.out.println();
                    System.out.println("Write down here your choice:");
                    choice = sc.nextLine();
                    choice = choice.trim().toLowerCase();
                    switch (choice) {
                        case "a. choose room", "a", "a.", "choose room", "room", "a choose room":
                            menuChoiceRoom();
                            switch (choice2) {
                                case "r1":
                                    System.out.println("----------------------------------");
                                    System.out.println("This is the state of your Cleaning:  room 1 = " + (rR1 ? "CLEANED" : "NOT CLEANED"));
                                    whatYouWantToDoWithRoomba();
                                    turnR = sc.nextLine();
                                    turnR = turnR.trim();
                                    if (turnR.equalsIgnoreCase("clean")) {
                                        rR1 = true;
                                        System.out.println();
                                        stateOfRR1();
                                    } else if (turnR.equalsIgnoreCase("no")) {
                                        rR1 = false;
                                        System.out.println();
                                        stateOfRR1();
                                    } else {
                                        errorOfTyping();
                                    }
                                    break;
                                // ... (repeat for other rooms like r2, r3, k, b, d - same as before)
                                default:
                                    errorOfTyping();
                                    break;
                            }
                            askForGoBackMenu();
                            roombaMenu = false;
                            break;
                        case "b", "b.", "b all rooms", "all rooms", "all", "all room", "b all", "b all room":
                            System.out.println("You chose to control all rooms.");
                            whatYouWantToDoWithRoomba();
                            turnR = sc.nextLine();
                            turnR = turnR.trim();
                            if (turnR.equalsIgnoreCase("clean")) {
                                rR1 = rR2 = rR3 = rKitchen = rBath = rDinningRoom = true;
                                System.out.println();
                                stateOfRR1();
                                stateOfRR2();
                                stateOfRR3();
                                stateOfRK();
                                stateOfRB();
                                stateOfRD();
                                askForGoBackMenu();
                                roombaMenu = false;
                            } else if (turnR.equalsIgnoreCase("no")) {
                                rR1 = rR2 = rR3 = rKitchen = rBath = rDinningRoom = false;
                                System.out.println();
                                stateOfRR1();
                                stateOfRR2();
                                stateOfRR3();
                                stateOfRK();
                                stateOfRB();
                                stateOfRD();
                                askForGoBackMenu();
                                roombaMenu = false;
                            } else {
                                errorOfTyping();
                            }
                            break;
                        case "c", "c.", "back", "back to menu", "return", "return to menu", "main menu", "go back":
                            System.out.println("Returning to main menu...");
                            roombaMenu = false;
                            break;
                        default:
                            errorOfTyping();
                            break;
                    }
                    roombaMenu = false;
                    break;
                case "2", "2.", "set automatic roomba in specific hours", "set automatic roomba", "automatic roomba", "automatic", "auto":
                    System.out.println();
                    System.out.println("You chose to set automatic Roomba in specific hours:");
                    System.out.println("----------------------------------");
                    System.out.println("Pick a choice down below:");
                    System.out.println("a. Choose room");
                    System.out.println("b. All rooms");
                    System.out.println("c. Back to menu");
                    choice = sc.nextLine();
                    choice = choice.trim().toLowerCase();
                    switch (choice) {
                        case "a. choose room", "a", "a.", "choose room", "room", "a choose room":
                            menuChoiceRoom();
                            choseAutoRoomba();
                            for (hour = 0; hour <= 23; hour++) {
                                System.out.println("Time----> " + hour + ":00");
                                if (hour == selectedHourR) {
                                    System.out.println();
                                    System.out.println("----------------------------------");
                                    System.out.println("AUTOMATIC ROOMBA ACTIVATED AT HOUR " + selectedHourR + ":00");
                                    System.out.println("----------------------------------");
                                    System.out.println();
                                    String room = choice2.trim().toLowerCase();
                                    switch (room) {
                                        case "r1":
                                            rR1 = autoRoomba;
                                            System.out.println("Room 1 cleaning set to: " + (autoRoomba ? "CLEANED" : "NOT CLEANED"));
                                            break;
                                        case "r2":
                                            rR2 = autoRoomba;
                                            System.out.println("Room 2 cleaning set to: " + (autoRoomba ? "CLEANED" : "NOT CLEANED"));
                                            break;
                                        case "r3":
                                            rR3 = autoRoomba;
                                            System.out.println("Room 3 cleaning set to: " + (autoRoomba ? "CLEANED" : "NOT CLEANED"));
                                            break;
                                        case "k":
                                            rKitchen = autoRoomba;
                                            System.out.println("Kitchen cleaning set to: " + (autoRoomba ? "CLEANED" : "NOT CLEANED"));
                                            break;
                                        case "b":
                                            rBath = autoRoomba;
                                            System.out.println("Bathroom cleaning set to: " + (autoRoomba ? "CLEANED" : "NOT CLEANED"));
                                            break;
                                        case "d":
                                            rDinningRoom = autoRoomba;
                                            System.out.println("Dinning Room cleaning set to: " + (autoRoomba ? "CLEANED" : "NOT CLEANED"));
                                            break;
                                    }
                                }
                                if (hour == selectedHourR + 3) {
                                    System.out.println("----------------------------------");
                                    System.out.println("The room is dirty again at " + (selectedHourR + 3) + ":00");
                                    System.out.println("----------------------------------");
                                    System.out.println();
                                    String room = choice2.trim().toLowerCase();
                                    switch (room) {
                                        case "r1":
                                            rR1 = false;
                                            
                                            break;
                                        case "r2":
                                            rR2 = false;
                                            
                                            break;
                                        case "r3":
                                            rR3 = false;
                                            
                                            break;
                                        case "k":
                                            rKitchen = false;
                                            
                                            break;
                                        case "b":
                                            rBath = false;
                                            
                                            break;
                                        case "d":
                                            rDinningRoom = false;
                                            
                                            break;
                                }
                            }
                        }
                            System.out.println();
                            System.out.println("Automatic Roomba schedule has been set.");
                            System.out.println("Returning to ROOMBA MENU...");
                            System.out.println();
                            validHourR = false;
                            validRoomba = false;
                            roombaMenu = false;
                            break;
                        
                        case "b", "b.", "b all rooms", "all rooms", "all", "all room", "b all", "b all room":
                            System.out.println("You chose to control all rooms.");
                            choseAutoRoomba();
                            for (hour = 0; hour <= 23; hour++) {
                                System.out.println("Time----> " + hour + ":00");
                                if (hour == selectedHourR) {
                                    System.out.println();
                                    System.out.println("----------------------------------");
                                    System.out.println("AUTOMATIC ROOMBA ACTIVATED AT HOUR " + selectedHourR + ":00");
                                    System.out.println("----------------------------------");
                                    System.out.println();
                                    rR1 = rR2 = rR3 = rKitchen = rBath = rDinningRoom = autoRoomba;
                                    System.out.println("Cleaning set to: " + (autoRoomba ? "CLEANED" : "NOT CLEANED"));
                                }
                                if (hour == selectedHourR + 3) {
                                    System.out.println("----------------------------------");
                                    System.out.println("The room is dirty again at " + (selectedHourR + 3) + ":00");
                                    System.out.println("----------------------------------");
                                    System.out.println();
                                    rR1 = rR2 = rR3 = rKitchen = rBath = rDinningRoom = false;
                            }
                        }
                            System.out.println("Returning to main menu...");
                            validHourR = false;
                            validRoomba = false;
                            roombaMenu = false;
                            break;

                        case "c", "c.", "back", "back to menu", "return", "return to menu", "main menu", "go back":
                            System.out.println("Returning to main menu...");
                            roombaMenu = false;
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
        } while (roombaMenu);
}
    public static void temparatureMenu(){
        //Will be doing fully CLEANED or NOT CLEANED, in the final version will be automatic cleaning
        tempMenu=true;
        do {
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("         TEMPERATURE MENU         ");
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("What do you want to do with Temperatures?");
        System.out.println("1. Set temperature for a specific for room/s (Manually)");
        System.out.println("2. Set automatic temperature in specific hours (Automatic)");
        System.out.println("Pick a choice down below:");
        automatic = sc.nextLine();
        automatic = automatic.trim().toLowerCase(); 
        switch (automatic) {
            case "1", "1.", "set temperature for a specific for room/s", "set temperature", "specific room", "specific rooms":
                System.out.println();
                
                System.out.println("You chose to control rooms manually:");
                System.out.println();
                System.out.println("a. Choose room");
                System.out.println("b. All rooms");
                System.out.println("c. Back to menu");
                System.out.println();
                System.out.println("Write down here youre choice:");
                choice = sc.nextLine();
                choice = choice.trim().toLowerCase();
                    switch (choice) 
                        {
                            
                            case "a. choose room", "a", "a.", "choose room", "room", "a choose room" :
                                menuChoiceRoom();
                                switch (choice2) 
                                {
                                    
                                        case "r1":
                                        try 
                                        {
                                            System.out.println("----------------------------------");
                                            System.out.println("You chose the first room");
                                            System.out.println("This is temperature:  room 1 = " + rR1 + "ºC");
                                            whatYouWantToDoWithTemp();
                                            
                                            tR1 = sc.nextDouble();
                                            if (tR1>35 || tR1<15) {
                                                System.out.println("The temperature is too low or too high, please try again");
                                                System.out.println("Temperature must be between 15 and 35");
                                                System.out.println("Returning to TEMPERATURE MENU...");
                                                break;
                                            }
                                            else {}
                                            System.out.println();
                                            System.out.println("You set the temperature of room 1 at: " +tR1 + "ºC");
                                        
                                        } catch (InputMismatchException e) {
                                            System.out.println("Error, please enter a number");
                                            break;
                                        } 
                                        catch (Exception e) {
                                            System.out.println("Error, please enter a valid number");
                                            break;
                                        }
                                    
                                    
                                    case "r2":
                                        try 
                                        {
                                            System.out.println("----------------------------------");
                                            System.out.println("You chose the second room");
                                            System.out.println("This is the temperature:  room 2 = " + tR2 + "ºC");
                                            whatYouWantToDoWithTemp();
                                            
                                            tR2 = sc.nextDouble();
                                            if (tR2>35 || tR2<15) {
                                                System.out.println("The temperature is too low or too high, please try again");
                                                System.out.println("Temperature must be between 15 and 35");
                                                System.out.println("Returning to TEMPERATURE MENU...");
                                                break;
                                            }
                                            else {}
                                            System.out.println("You set the temperature of room 2 at: " +tR2 + "ºC");
                                        }
                                        
                                        
                                        catch (InputMismatchException e) {
                                            System.out.println("Error, please enter a valid number");
                                            break;
                                        } 
                                        catch (Exception e) {
                                            System.out.println("Error, please enter a valid number");
                                            break;
                                        }

                                    case "r3":
                                    try
                                        {
                                            System.out.println("----------------------------------");
                                            System.out.println("You chose the third room");
                                            System.out.println("This is the temperature:  room 3 = " + tR3 + "ºC");
                                            whatYouWantToDoWithTemp();
                                            
                                            tR3 = sc.nextDouble();
                                                if (tR3>35 || tR3<15) 
                                                {
                                                    System.out.println("The temperature is too low or too high, please try again");
                                                    System.out.println("Temperature must be between 15 and 35");
                                                    System.out.println("Returning to TEMPERATURE MENU...");
                                                    break;
                                                }
                                                else {}
                                                
                                            
                                                System.out.println("You set the temperature of room 3 at: " +tR3 + "ºC");
                                        }
                                        catch (InputMismatchException e) {
                                            System.out.println("Error, please enter a number");
                                            break;
                                        } 
                                        catch (Exception e) {
                                            System.out.println("Error, please enter a valid number");
                                            break;
                                        }

                                        
                                    
                                    case "k":
                                        try
                                        {
                                            System.out.println("----------------------------------");
                                            System.out.println("You chose the Kitchen");
                                            System.out.println("This is the temperature:  kitchen = " + tKitchen + "ºC");
                                            whatYouWantToDoWithTemp();
                                            
                                            tKitchen = sc.nextDouble();
                                            if (tKitchen>35 || tKitchen<15) {
                                                    System.out.println("The temperature is too low or too high, please try again");
                                                    System.out.println("Temperature must be between 15 and 35");
                                                    System.out.println("Returning to TEMPERATURE MENU...");
                                                    break;
                                                }
                                                else {}
                                
                                            System.out.println("You set the temperature of the kitchen at: " +tKitchen + "ºC");
                                        }
                                        
                                        catch (InputMismatchException e) {
                                            System.out.println("Error, please enter a number");
                                            break;
                                        } 
                                        catch (Exception e) {
                                            System.out.println("Error, please enter a valid number");
                                            break;
                                        }
                                        
                                    case "b":
                                    try{
                                        System.out.println("----------------------------------");
                                        System.out.println("You chose the Bathroom");
                                        System.out.println("This is the temperature:  bathroom = " + tBath + "ºC");
                                        whatYouWantToDoWithTemp();
                                        
                                        tBath = sc.nextDouble();
                                        if (tBath>35 || tBath<15) {
                                                    System.out.println("The temperature is too low or too high, please try again");
                                                    System.out.println("Temperature must be between 15 and 35");
                                                    System.out.println("Returning to TEMPERATURE MENU...");
                                                    break;
                                                }
                                            
                                        }
                                        catch (InputMismatchException e) {
                                            System.out.println("Error, please enter a number");
                                            break;
                                        } 
                                        catch (Exception e) {
                                            System.out.println("Error, please enter a valid number");
                                            break;
                                        }
                                            
                                    
                                        System.out.println("You set the temperature of the bathroom at: " +tBath + "ºC");
                                    
                                    case "d":
                                    try
                                    {
                                        System.out.println("----------------------------------");
                                        System.out.println("You chose the Dinning Room");
                                        System.out.println("This is the state of your Cleaning:  Dinning Room = " + rDinningRoom +"ºC" );
                                        whatYouWantToDoWithTemp();
                                        
                                        tDinningRoom = sc.nextDouble();
                                        if (tDinningRoom>35 || tDinningRoom<15) {
                                                    System.out.println("The temperature is too low or too high, please try again");
                                                    System.out.println("Temperature must be between 15 and 35");
                                                    System.out.println("Returning to TEMPERATURE MENU...");
                                                    break;
                                                }
                                                else {}
                                        System.out.println("You set the temperature of the Dinning Room at: " +tDinningRoom + "ºC");
                                    }
                                    catch (InputMismatchException e) {
                                            System.out.println("Error, please enter a number");
                                            break;
                                    } 
                                    catch (Exception e) {
                                        System.out.println("Error, please enter a valid number");
                                        break;
                                    }   
                                        
                                        
                                
                                default:
                                    errorOfTyping();
                                    break;
                                    }
                            askForGoBackMenu();
                            tempMenu = false;
                            break;
                        
                            case "b", "b.", "b all rooms", "all rooms", "all", "all room", "b all", "b all room":
                                try 
                                {
                                    System.out.println("You chose to control all rooms.");
                                    whatYouWantToDoWithTemp();
                                    turnT = sc.nextDouble();
                                if (turnT>35 || turnT<15) {
                                    System.out.println("The temperature is too low or too high, please try again");
                                    System.out.println("Temperature must be between 15 and 35");
                                    System.out.println("Returning to TEMPERATURE MENU...");
                                    break;
                                }
                                else {}
                    
                                    tR1 = tR2 = tR3 = tKitchen = tBath = tDinningRoom = turnT;
                                    System.out.println();
                                    System.out.println("All rooms have been set to: " + turnT+ "ºC");
                                    
                                    System.out.println();
                                    
                                    askForGoBackMenu();
                                    tempMenu =false;
                                    break;
                                }
                                catch (InputMismatchException e) {
                                            System.out.println("Error, please enter a number");
                                            break;
                                } 
                                catch (Exception e) {
                                    System.out.println("Error, please enter a valid number");
                                    break;
                                } 
                                            
                        
                                

                            case "c", "c.", "back", "back to menu", "return", "return to menu", "main menu", "go back":
                                System.out.println("Returning to main menu...");
                                
                                
                                break;

                            default:
                                errorOfTyping();
                                break;
                            
                        }
                        tempMenu = false;
                        break;
            case "2", "2.", "set automatic temperature in specific hours", "set automatic temperature", "automatic temperature", "automatic", "automatic temp":
                System.out.println();
                System.out.println("You chose to set automatic temperature in specific hours:");
                System.out.println("----------------------------------");
                System.out.println("Pick a choice down below:");
                System.out.println("a. Choose room");
                System.out.println("b. All rooms");
                System.out.println("c. Back to menu");
                choice = sc.nextLine();
                choice = choice.trim().toLowerCase();
                    switch (choice) 
                        {
                            
                            case "a. choose room", "a", "a.", "choose room", "room", "a choose room" :
                                menuChoiceRoom();
                                choseAutoTemp();
                                // Loop through hours from 0 to 23
                                for (hour = 0; hour <= 23; hour++) {
                                    System.out.println("Time----> " + hour + ":00");
                                    if (hour == selectedHour) {
                                        System.out.println();
                                        System.out.println("----------------------------------");
                                        System.out.println("AUTOMATIC TEMPERATURE ACTIVATED AT HOUR " + selectedHour + ":00");
                                        System.out.println("----------------------------------");
                                        System.out.println();
                                        String room = choice2.trim().toLowerCase();
                                        // Apply temperature to selected rooms
                                        
                                            switch (room) {
                                                case "r1":
                                                    tR1 = autoTemp;
                                                    System.out.println("Room 1 temperature set to: " + autoTemp + " ºC");
                                                    break;
                                                case "r2":
                                                    tR2 = autoTemp;
                                                    System.out.println("Room 2 temperature set to: " + autoTemp + " ºC");
                                                    break;
                                                case "r3":
                                                    tR3 = autoTemp;
                                                    System.out.println("Room 3 temperature set to: " + autoTemp + " ºC");
                                                    break;
                                                case "k":
                                                    tKitchen = autoTemp;
                                                    System.out.println("Kitchen temperature set to: " + autoTemp + " ºC");
                                                    break;
                                                case "b":
                                                    tBath = autoTemp;
                                                    System.out.println("Bathroom temperatFure set to: " + autoTemp + " ºC");
                                                    break;
                                                case "d":
                                                    tDinningRoom = autoTemp;
                                                    System.out.println("Dinning Room temperature set to: " + autoTemp + " ºC");
                                                    break;
                                            }
                                        }
                                    
                                    if (hour == selectedHour2) {
                                        System.out.println("----------------------------------");
                                        System.out.println("AUTOMATIC TEMPERATURE ACTIVATED AT HOUR " + selectedHour2 + ":00");
                                        System.out.println("----------------------------------");
                                        System.out.println();
                                    
                                        // Apply temperature to selected rooms
                                        
                                            String room = choice2.trim().toLowerCase();
                                            switch (room) {
                                                case "r1":
                                                    tR1 = autoTemp2;
                                                    System.out.println("Room 1 temperature set to: " + autoTemp2 + " ºC");
                                                    break;
                                                case "r2":
                                                    tR2 = autoTemp2;
                                                    System.out.println("Room 2 temperature set to: " + autoTemp2 + " ºC");
                                                    break;
                                                case "r3":
                                                    tR3 = autoTemp2;
                                                    System.out.println("Room 3 temperature set to: " + autoTemp2 + " ºC");
                                                    break;
                                                case "k":
                                                    tKitchen = autoTemp2;
                                                    System.out.println("Kitchen temperature set to: " + autoTemp2 + " ºC");
                                                    break;
                                                case "b":
                                                    tBath = autoTemp2;
                                                    System.out.println("Bathroom temperature set to: " + autoTemp2 + " ºC");
                                                    break;
                                                case "d":
                                                    tDinningRoom = autoTemp2;
                                                    System.out.println("Dinning Room temperature set to: " + autoTemp2 + " ºC");
                                                    break;
                                            }
                                        }
                                    
                                        }
                                        System.out.println();
                                        
                                System.out.println("Automatic temperature schedule has been set.");
                                System.out.println("Returning to TEMPERATURE MENU...");
                                System.out.println();
                                tempMenu = false; 
                                break;
                                // Exit the loop after applying temperature

                            case "b", "b.", "b all rooms", "all rooms", "all", "all room", "b all", "b all room":
                                System.out.println("You chose to control all rooms.");
                                choseAutoTemp();
                                 for (hour = 0; hour <= 23; hour++) {
                                    System.out.println("Time----> " + hour + ":00");
                                    if (hour == selectedHour) 
                                    {
                                        System.out.println();
                                        System.out.println("----------------------------------");
                                        System.out.println("AUTOMATIC TEMPERATURE ACTIVATED AT HOUR " + selectedHour + ":00");
                                        System.out.println("----------------------------------");
                                        System.out.println();
                                
                                        // Apply temperature to all rooms
                                    
                                        tR1 = tR2 = tR3 = tKitchen = tBath = tDinningRoom = autoTemp;
                                        System.out.println("Temperature set to: " + autoTemp + " ºC");
                                                    
                                            }
                                    if (hour == selectedHour2) 
                                    {
                                        System.out.println("----------------------------------");
                                        System.out.println("AUTOMATIC TEMPERATURE ACTIVATED AT HOUR " + selectedHour2 + ":00");
                                        System.out.println("----------------------------------");
                                        System.out.println();
                                        // Apply temperature to all rooms
                                         tR1 = tR2 = tR3 = tKitchen = tBath = tDinningRoom = autoTemp2;
                                        System.out.println("Temperature set to: " + autoTemp2 + " ºC");
                                    }
                                    }
                                    
                                    System.out.println("Returning to main menu...");
                                    tempMenu = false;
                                break;

                            case "c", "c.", "back", "back to menu", "return", "return to menu", "main menu", "go back":
                                System.out.println("Returning to main menu...");
                                tempMenu = false;
                                break;

                            default:
                                errorOfTyping();
                                break;
                                
                            
                    }
                                break;
                            
                            
                            
                        }
                    
                
                System.out.println();
                
                         
                System.out.println("Automatic temperature schedule has been set.");
                System.out.println("Returning to TEMPERATURE MENU...");
                System.out.println();
                tempMenu = false; 
                break;
                // Exit the loop after applying temperature

                
            
                    }while (tempMenu);
                
                
                
        }
    
        
    
    public static void menuChoiceRoom(){
        System.out.println();
        System.out.println("Please select the room you want:");
        System.out.println();
        System.out.println("r1 for first room");
        System.out.println("r2 for second room");
        System.out.println("r3 for third room");
        System.out.println("k for kitchen");
        System.out.println("b for bathroom");
        System.out.println("d for dinningroom");
        System.out.println();
        System.out.println("Write the room you're choosing");
        choice2 = sc.nextLine();

    }
    public static void choseAutoTemp(){
        while (!validHour) {
            try {
                System.out.println("Enter the hour (0-23) at which you want to set the temperature:");
                selectedHour = sc.nextInt();
                System.out.println("Enter the second hour (0-23) at which you want to set the temperature:");
                selectedHour2 = sc.nextInt();
                sc.nextLine(); 
                if (selectedHour >= 0 && selectedHour <= 23) {
                    validHour = true;
                } 
                else if (selectedHour2 >= 0 && selectedHour2 <= 23) {
                    validHour = true;
                }
                else {
                    System.out.println("Invalid hour! Please enter a value between 0 and 23.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, please enter a valid number.");
                sc.nextLine(); // Clear invalid input
            }
        }
        validTemp = false;
        while (!validTemp) {
            try {
                System.out.println("Enter the temperature you want to set (15-35 ºC):");
                autoTemp = sc.nextDouble();
                sc.nextLine(); 
                if (autoTemp >= 15 && autoTemp <= 35) {
                    validTemp = true;
                } else {
                    System.out.println("Temperature must be between 15 and 35. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, please enter a valid number.");
                sc.nextLine(); // Clear invalid input
            }
        }
        validTemp2 = false;
        while (!validTemp2) {
            try {
                System.out.println("Enter the second temperature you want to set (15-35 ºC):");
                autoTemp2 = sc.nextDouble();
                sc.nextLine(); 
                if (autoTemp2 >= 15 && autoTemp2 <= 35) {
                    validTemp2 = true;
                } else {
                    System.out.println("Temperature 2 must be between 15 and 35. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, please enter a valid number.");
                sc.nextLine(); // Clear invalid input
            }
        }
            
        
        System.out.println();
                                
    }
    public static void choseAutoLight(){
        while (!validHourL) {
            try {
                System.out.println("Enter the hour (0-23) at which you want to set the lights:");
                selectedHourL = sc.nextInt();
                System.out.println("Enter the second hour (0-23) at which you want to set the lights:");
                selectedHourL2 = sc.nextInt();
                sc.nextLine();
                if (selectedHourL >= 0 && selectedHourL <= 23 && selectedHourL2 >= 0 && selectedHourL2 <= 23) {
                    validHourL = true;
                } else {
                    System.out.println("Invalid hour! Please enter values between 0 and 23.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, please enter a valid number.");
                sc.nextLine(); // Clear invalid input
            }
        }
        validLight = false;
        while (!validLight) {
            System.out.println("Enter the state you want to set for the first hour (on/off):");
            String state = sc.nextLine().trim().toLowerCase();
            if (state.equals("on")) {
                autoLight = true;
                validLight = true;
            } else if (state.equals("off")) {
                autoLight = false;
                validLight = true;
            } else {
                System.out.println("Please enter 'on' or 'off'.");
            }
        }
        validLight2 = false;
        while (!validLight2) {
            System.out.println("Enter the state you want to set for the second hour (on/off):");
            String state = sc.nextLine().trim().toLowerCase();
            if (state.equals("on")) {
                autoLight2 = true;
                validLight2 = true;
            } else if (state.equals("off")) {
                autoLight2 = false;
                validLight2 = true;
            } else {
                System.out.println("Please enter 'on' or 'off'.");
            }
        }
        System.out.println();
    }
    public static void choseAutoBlinder(){
        while (!validHourB) {
            try {
                System.out.println("Enter the hour (0-23) at which you want to set the blinders:");
                selectedHourB = sc.nextInt();
                System.out.println("Enter the second hour (0-23) at which you want to set the blinders:");
                selectedHourB2 = sc.nextInt();
                sc.nextLine();
                if (selectedHourB >= 0 && selectedHourB <= 23 && selectedHourB2 >= 0 && selectedHourB2 <= 23) {
                    validHourB = true;
                } else {
                    System.out.println("Invalid hour! Please enter values between 0 and 23.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, please enter a valid number.");
                sc.nextLine(); // Clear invalid input
            }
        }
        validBlinder = false;
        while (!validBlinder) {
            System.out.println("Enter the state you want to set for the first hour (open/close):");
            String state = sc.nextLine().trim().toLowerCase();
            if (state.equals("open")) {
                autoBlinder = true;
                validBlinder = true;
            } else if (state.equals("close")) {
                autoBlinder = false;
                validBlinder = true;
            } else {
                System.out.println("Please enter 'open' or 'close'.");
            }
        }
        validBlinder2 = false;
        while (!validBlinder2) {
            System.out.println("Enter the state you want to set for the second hour (open/close):");
            String state = sc.nextLine().trim().toLowerCase();
            if (state.equals("open")) {
                autoBlinder2 = true;
                validBlinder2 = true;
            } else if (state.equals("close")) {
                autoBlinder2 = false;
                validBlinder2 = true;
            } else {
                System.out.println("Please enter 'open' or 'close'.");
            }
        }
        System.out.println();
    }
    public static void choseAutoRoomba() {
    while (!validHourR) {
        try {
            System.out.println("Enter the hour (0-23) at which you want to set the Roomba:");
            selectedHourR = sc.nextInt();
            sc.nextLine();
            System.out.println();
            if (selectedHourR >= 0 && selectedHourR <= 23) {
                validHourR = true;
            } else {
                System.out.println("Invalid hour! Please enter values between 0 and 23.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error, please enter a valid number.");
            sc.nextLine(); // Clear invalid input
        }
    }
    validRoomba = false;
    while (!validRoomba) {
        System.out.println("Enter the state you want to set for the first hour (clean/no):");
        String state = sc.nextLine().trim().toLowerCase();
        if (state.equals("clean")) {
            autoRoomba = true;
            validRoomba = true;
        } else if (state.equals("no")) {
            autoRoomba = false;
            validRoomba = true;
        } else {
            System.out.println("Please enter 'clean' or 'no'.");
        }
    }
    
    System.out.println();
}
    public static void overallState(){
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("      OVERALL HOUSE STATE        :");
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Light State:");
        stateOfR1();
        stateOfR2();
        stateOfR3();
        stateOfK();
        stateOfB();
        stateOfD();
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Blinders State:");
        stateOfBR1();
        stateOfBR2();
        stateOfBR3();
        stateOfBK();
        stateOfBB();
        stateOfBD();
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Cleaning State:");
        stateOfRR1();
        stateOfRR2();
        stateOfRR3();
        stateOfRK();
        stateOfRB();
        stateOfRD();
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Temperature State:");
        System.out.println();
        System.out.println("room 1 = " + tR1 + "ºC");
        System.out.println("room 2 = " + tR2 + "ºC");
        System.out.println("room 3 = " + tR3 + "ºC");
        System.out.println("kitchen = " + tKitchen + "ºC");
        System.out.println("bathroom = " + tBath + "ºC");
        System.out.println("dinning room = " + tDinningRoom + "ºC");
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();
        askForGoBackMenu();
        
    }
    public static void askForGoBackMenu(){
        askForGoBackToMenu = true;
        do {
            System.out.println();
            System.out.println("You want to go back to menu ? (Yes // No):");
            goBackMenu = sc.nextLine();
            goBackMenu = goBackMenu.trim(); // Esborra el espais sobrants en la entrada de teclat.
                if (goBackMenu.equalsIgnoreCase("yes")) {
                    System.out.println("Going back to menu....");
                    System.out.println();
                    askForGoBackToMenu = false;
                    
                    
                }
                else if (goBackMenu.equalsIgnoreCase("no")) {
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
    public static void whatYouWantToDoWithBlinders(){
        System.out.println("What would you like to do? ");
        System.out.println("OPEN IT  = OPEN | CLOSE IT = CLOSE");
    }
    public static void whatYouWantToDoWithRoomba(){
        System.out.println("would you like to clean that room? ");
        System.out.println("CLEAN IT  = CLEAN | NOT CLEAN IT  = NO");
    }
    public static void whatYouWantToDoWithTemp(){
        System.out.println("Wich temp you want to set? (ºC) ");
        
    }
    public static void stateOfR1(){
    
        System.out.println("The lights of the room 1 are: "  + (lR1 ? "ON" : "OFF"));
    }
    public static void stateOfR2(){
        System.out.println("The lights of the room 2 are: "  + (lR2 ? "ON" : "OFF"));
    }
    public static void stateOfR3(){
        System.out.println("The lights of the room 3 are: "  + (lR3 ? "ON" : "OFF"));
    }
    public static void stateOfK(){
        System.out.println("The lights of the Kitchen are: "  + (lKitchen ? "ON" : "OFF"));
    }
    public static void stateOfB(){
        System.out.println("The lights of the bathroom are: "  + (lBath ? "ON" : "OFF"));
    }
    public static void stateOfD(){
        System.out.println("The lights of the DinningRoom are: "  + (lDinningRoom ? "ON" : "OFF"));
    }
    public static void stateOfRR1(){
    
        System.out.println("The cleaning state of the room 1 is: "  + (rR1 ? "CLEANED" : "NOT CLEANED"));
    }
    public static void stateOfRR2(){
        System.out.println("The cleaning state of the room 2 is: "  + (rR2 ? "CLEANED" : "NOT CLEANED"));
    }
    public static void stateOfRR3(){
        System.out.println("The cleaning state of the room 3 is: "  + (rR3 ? "CLEANED" : "NOT CLEANED"));
    }
    public static void stateOfRK(){
        System.out.println("The cleaning state of the Kitchen is: "  + (rKitchen ? "CLEANED" : "NOT CLEANED"));
    }
    public static void stateOfRB(){
        System.out.println("The cleaning state of the bathroom is: "  + (rBath ? "CLEANED" : "NOT CLEANED"));
    }
    public static void stateOfRD(){
        System.out.println("The cleaning state of the bathroom is: "  + (rBath ? "CLEANED" : "NOT CLEANED"));
    }
    public static void stateOfBR1(){
    
        System.out.println("The blinders of the room 1 are: "  + (bR1 ? "OPEN" : "CLOSED"));
    }
    public static void stateOfBR2(){
        System.out.println("The blinders of the room 2 are: "  + (bR2 ? "OPEN" : "CLOSED"));
    }
    public static void stateOfBR3(){
        System.out.println("The blinders of the room 3 are: "  + (bR3 ? "OPEN" : "CLOSED"));
    }
    public static void stateOfBK(){
        System.out.println("The blinders of the Kitchen are: "  + (bKitchen ? "OPEN" : "CLOSED"));
    }
    public static void stateOfBB(){
        System.out.println("The blinders of the bathroom are: "  + (bBath ? "OPEN" : "CLOSED"));
    }
    public static void stateOfBD(){
        System.out.println("The blinders of the DinningRoom are: "  + (bDinningRoom ? "OPEN" : "CLOSED"));
    }
    public static void stateOfTR1(){
    
        System.out.println("The temperature in the room 1 are: "  + tR1 + "ºC");
    }
    public static void stateOfTR2(){
        System.out.println("The temperature in the room 2 are: "  + tR2 + "ºC");
    }
    public static void stateOfTR3(){
        System.out.println("The temperature in the room 3 are: "  + tR3 + "ºC");
    }
    public static void stateOfTK(){
        System.out.println("The temperature in the Kitchen are: "  + tKitchen + "ºC");
    }
    public static void stateOfTB(){
        System.out.println("The temperature in the bathroom are: "  + tBath + "ºC");
    }
    public static void stateOfTD(){
        System.out.println("The temperature in the DinningRoom are: "  + tDinningRoom + "ºC" );
    }
}
