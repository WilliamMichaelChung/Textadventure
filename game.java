
/**
 * Write a description of class game here.
 *
 * @author (William Chung)
 * @version (16/5/23)
 */
import java.util.Scanner;//imports a scanner so the program can read what the user types
public class game
{
    boolean item1 = false;
    boolean item2 = false; 
    boolean item3 = false; 
    boolean room1 = false;
    boolean room2 = false;
    boolean room3 = false;
    boolean room4 = false;
    boolean room5 = false;
    boolean room6 = false;
    boolean room7 = false;
    boolean room8 = false;
    boolean exit = false;
    int numberOfMoves = 15;//The amount of moves the player is given. If used up they lose
    boolean game;
    boolean startgame;
    /**
     * Constructor for objects of class game
     */
    public game()
    {
        //this part is instructions on how to play the game 
        String line1 = "In this game there are 8 different rooms you must navigate through." ; 
        String line2 = "Your objective is to collect 3 items then enter a secret room to win! "; 
        String line3 = "To navigate through the rooms you can move up, down, north, east, south and west.";
        String line4 = "To move north type N in the responses box"; 
        String line5 = "To move east type E in the responses box"; 
        String line6 = "To move south type S in the responses box"; 
        String line7 = "To move west type W in the responses box"; 
        String line8 = "To search and a room and pick up items type F in the responses box"; 
        String line9 = "Type Y to start!"; 
        String line10 = "There will also be some trapped rooms. Where if you enter them they'll kill you instantly.";
        String line11 = "To move up type U in the responses box";
        String line12 = "To move down type D in the responses box";
        String Intro = line1 + "\r\n" + line2 + "\r\n" + line3 + "\r\n" + line10 + "\r\n" + line11 + "\r\n" + line12 + "\r\n" + line4 + "\r\n" + line5 + "\r\n" + line6 + "\r\n" + line7 + "\r\n" + line8 + "\r\n" + line9;//combines all the strings into 1 with each completed sentence going down a line
        System.out.println(Intro);//the system prints out the combined strings(intro)

        Scanner inputStream = new Scanner(System.in);//creates a new scanner
        String gameKeyboard = inputStream.nextLine(); //the scanner reads the line below what it typed/the user input
        gameKeyboard = gameKeyboard.toLowerCase();//turns whatever is typed into a lowercase

        boolean intro = true;

        
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Press Y to start");
            while(!gameKeyboard.equals ("Y")){
                keyboard.nextLine();
                System.out.print("Press Y to start");
            }
            return starting;
        String starting = System.out.println("Starting game!" + "\r\n" + "Welcome");

        
        
        if (gameKeyboard == ("y")){
            System.out.print("Starting game!" + "\r\n" + "Welcome");
        }
        else{
            System.out.print("Press Y to start!");
        }
        /**
        while (intro == true){
        if(!(gameKeyboard.equals ("y"))){
        System.out.print("Type Y to start!");
        }else if (gameKeyboard.equals ("y")){
        break;
        }

        }
         */

        /*
        if(gameKeyboard.equals ("y")){
        startgame = true;
        if (startgame = true){
        System.out.print("starting game!" + "\r\n" + "Welcome");
        }
        game = true;
        startgame = false;
        intro = false;
        }
         */
        /**
        while(intro == true){
        if (gameKeyboard.equals ("y")){
        startgame = true;
        if (startgame = true){
        System.out.print("starting game!" + "\r\n" + "Welcome");
        }
        game = true;
        startgame = false;
        break;
        } else{
        System.out.print("Type Y to start!");
        }
        }
         */
        /*  
        while (gameKeyboard.equals("y")){

        if (gameKeyboard.equals("y")){
        startgame = true;
        System.out.print("Press Y to start!");
        while (startgame = true){
        System.out.print("Starting game");
        }

        } else{
        while (startgame = false){
        System.out.print("Press Y to start!");
        }
        }
        startgame = false;
         */

         
        /*
        //moving throughout the game
        for (int i = 0; i < 15; i++){
        if(gameKeyboard == ("y") && gameKeyboard == ("e")){
        room2 = true;
        }
        }//
        //System.out.print("Press Y to start!");
         */

        ///.charAt(1);
        //while (gamestart.equals("y")){

        //startgame = false;
        //System.out.print("Press Y to start!");

        /*
        if(startgame == true){
        System.out.print("Welcome");
        }
        /**
        if (gamestart.equals("y")){
        startgame = true;
        }
        else{
        startgame = false;
        }
        if(startgame == true){
        System.out.print("Welcome");
        }
         */
        /**
        Scanner inputStream = new Scanner(System.in);
        inputStream.nextLine();
        //String input = inputStream.nextLine();
        //String startgame = input.toLowerCase();
        boolean  gameintro;
        if(inputStream == "gameintro"){
        gameintro = true;
        }
        else{
        gameintro = false;
        }
         */

        /*
        if(keyboard.equals ("Y")){
        readgamestart= true;
        }

        boolean readgamestart;
        Scanner keyboard = new Scanner(System.in);
        if (readgamestart == true){
        String prompt = "Press Y to start!";
        System.out.println(prompt);
        while(!keyboard.hasNextLine()){
        keyboard.nextLine();
        System.out.print(prompt);
        }
        }
        return keyboard.hasNextBoolean();
         */
        /**
        char letter(){
        while (startgame = true){
        System.out.print("starting game!" + "\r\n" + "Welcome");
        break;
        }
        }
         */

        /*
        int readNum(){
        Scanner keyboard = new Scanner(System.in);
        String prompt = "give me a number";
        System.out.println(prompt);
        while(!keyboard.hasNextInt()){
        keyboard.nextLine();
        System.out.print("No "+prompt);
        }
        return keyboard.nextInt();
        }
         */
        //the amount of times the player can move around the rooms before they lose
        for(int i=0 ; i>15; i++){
            System.out.println("Number of moves left"+ (i -= 15-i));
        }

        //main game
        while (game == true){
            //move numbers/the amount of times you can move between the rooms

            //entering rooms code
            //moving to room 1
            if(room2 == true && gameKeyboard.equals ("s")){
                room1 = true;
                room2 = false;
            }

            //moving to room 2
            if(room1 == true && gameKeyboard.equals ("n") || room3 == true && gameKeyboard.equals ("w")){
                room2 = true;
                room1 = false;
                room3 = false;
            }

            //moving to room 3
            if(room2 == true && gameKeyboard.equals ("e") || room5 == true && gameKeyboard.equals ("d") || room7 == true && gameKeyboard.equals ("s")){
                room3 = true;
                room2 = false;
                room5 = false;
                room7 = false;
            }

            //moving to room 4-death room
            if(room2 == true && gameKeyboard.equals ("u")){
                room4 = true;
                room2 = false;
            }

            //moving to room 5
            if(room3 == true && gameKeyboard.equals ("u")){
                room5 = true;
                room3 = false;
            }

            //moving to room 6-death room
            if(room5 == true && gameKeyboard.equals ("n")){
                room6 = true;
                room5 = false;
            }

            //moving to room 7
            if(room3 == true && gameKeyboard.equals ("n") || room8 == true && gameKeyboard.equals ("d")){
                room7 = true;
                room3 = false;
                room8 = false;
            }

            //moving to room 8
            if(room7 == true && gameKeyboard.equals ("u") ){
                room8 = true;
                room7 = false;
            }
        }
        //rooms
        //room 2 codedesription code + item and trap code
        if(room2 == true){
            System.out.println("description of the room");
        }//if the user enter room2/if room 2 is true then print out a description of the room
        if(room2 == true && gameKeyboard.equals ("f")){
            System.out.println("You found item 1");
            item1 = true;
        }// if the user is in room 2 and inputs f to search the room they'll find item 1 and make the item 1 boolean true

        //room 3 code
        if(room3 == true){
            System.out.println("description of the room");
        }//if the user enter room3/if room 3 is true then print out a description of the room
        if(room3 == true && gameKeyboard.equals ("f")){
            System.out.println("There is nothing in here");
        }// if the user is in room 3 and inputs f to search the room they'll find nothing

        //room 4 code
        if(room4 == true){
            System.out.println("trap room. you fell to your death");
            System.exit(0);
        }//if the user enter room4/if room 4 is true then print out a description of the room

        //room 5 code
        if(room5 == true){
            System.out.println("description of the room");
        }//if the user enter room5/if room 5 is true then print out a description of the room
        if(room5 == true && gameKeyboard.equals ("f")){
            System.out.println("You found item 2");
            item2 = true;
        }// if the user is in room 5 and inputs f to search the room they'll find item 2 and make the item 2 boolean true

        //room 6 code
        if(room6 == true){
            System.out.println("trap room. you fell to your death");
            System.exit(0);
        }//if the user enter room6/if room 6 is true then print out a description of the room

        //room 7 code
        if(room7 == true){
            System.out.println("description of the room");
        }//if the user enter room 7/if room 7 is true then print out a description of the room
        if(room7 == true && gameKeyboard.equals ("f")){
            System.out.println("You found item 3");
            item3 = true;
        }// if the user is in room 7 and inputs f to search the room they'll find item 3 and make the item 3 boolean true

        //room 8
        if(room8 == true){
            System.out.println("description of the room");
        }//if the user enter room8/if room 8 is true then print out a description of the room
        if(room8 == true && gameKeyboard.equals ("f")){
            System.out.println("You found item 3");
            exit = true;
        }// if the user is in room 8 and inputs f to search the room they'll stumble upon an exit

        //exit room
        if(exit == true&& item1 && item2 && item3){
            System.out.println("You win!");
            System.exit(0);
        }//if exit, item1, item2 and item 3 have been found/are true then the user wins, the program prints out a win win message and the program ends

        /**
        if(gameKeyboard.equals("e")){
        try{

        }catch(){}
        }
        if(gameKeyboard.equals("w")){

        }
         */

    }
}
