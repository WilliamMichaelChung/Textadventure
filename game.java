
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
    int numberOfMoves = 15;//The amount of moves the player is given. If used up they lose
    boolean game;
    boolean startgame;
    boolean room1 = false;
    boolean room2 = false;
    boolean room3 = false;
    boolean room4 = false;
    boolean room5 = false;
    boolean room6 = false;
    boolean room7 = false;
    boolean room8 = false;
    boolean exit = false;
    boolean room8NoItems = false;
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
        String line13 = "If you want to stop playing type end and the game will stop";
        String line14 = "You have a limit of 15 moves to search and move throughout the rooms";
        String Intro = line1 + "\r\n" + line2 + "\r\n" + line3 + "\r\n" + line10 + "\r\n" + line11 + "\r\n" + line12 + "\r\n" + line4 + "\r\n" + line5 + "\r\n" + line6 + "\r\n" + line7 + "\r\n" + line8 + "\r\n" + line9 + "\r\n" + line13 + "\r\n" + line14;//combines all the strings into 1 with each completed sentence going down a line
        System.out.println(Intro);//the system prints out the combined strings(intro)

        Scanner inputStream = new Scanner(System.in);//creates a new scanner
        String gameKeyboard = inputStream.nextLine(); //the scanner reads the line below what it typed/the user input
        gameKeyboard = gameKeyboard.toLowerCase();//turns whatever is typed into a lowercase

        boolean intro = true;
        while (intro){
            if (gameKeyboard.equals ("end")){
                System.out.print("ending game");
                System.exit(0);
            }
            if(!(gameKeyboard.equals ("y"))){
                System.out.print("Type Y to start!");
                gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input

            }//if the user types end the game will stop running
            else{
                intro = false;
                game = true;
                System.out.print("\r\n" + "Starting game");
            }
        }//if the user types y the intro will stop and move onto the game and if they don't it'll keep asking them to type y until they do and if they do the main game will start

        //main game
        if (game){
            room1 = true;
        }
        while (game){
            for(int i = 0; i<numberOfMoves; i++){

                //entering rooms code
                //moving to room 1
                if(room2 == true && gameKeyboard.equals ("s")){
                    gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
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

                //rooms
                if(room1){
                    System.out.println("\r\n" + "room 1" + "\r\n" + "you can move north to room 2");
                    gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                    //i++;
                    System.out.print("\r\n" + "\r\n" + "Number of moves" + i);
                }
                if(room1 && gameKeyboard.equals ("f")){
                    System.out.println("There is nothing in here");
                    gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                }// if the user is in room 1 and inputs f to search the room they'll find nothing
                //room 2 codedesription code + item and trap code
                if(room2){
                    String r2= "\r\n" + "room 2";
                    String r3E = "you can move east to room 3";
                    String r4U = "you can move up to room 4";
                    System.out.println(r2 + "\r\n" + r3E + "\r\n" + r4U);
                    gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                    //i++;
                    System.out.print("\r\n" + "\r\n" + "Number of moves" + i);
                }//if the user enter room2/if room 2 is true then print out a description of the room
                if(room2 && gameKeyboard.equals ("f")){
                    System.out.println("\r\n" + "You found item 1");
                    item1 = true;
                    gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                }// if the user is in room 2 and inputs f to search the room they'll find item 1 and make the item 1 boolean true

                //room 3 code
                if(room3){
                    String r2W = "you can move west to room 2";
                    String r3U = "you can move up to room 5";
                    String r7N = "you can move north to room 7";
                    System.out.println("room 3" + "\r\n" + r2W + "\r\n" + r3U + "\r\n" + r7N);
                    gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                    //i++;
                    System.out.print("\r\n" + "\r\n" + "Number of moves" + i);
                }//if the user enter room3/if room 3 is true then print out a description of the room
                if(room3 && gameKeyboard.equals ("f")){
                    System.out.println("There is nothing in here");
                    gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                }// if the user is in room 3 and inputs f to search the room they'll find nothing

                //room 4 code
                if(room4){
                    System.out.println("trap room. you fell to your death");
                    System.exit(0);
                }//if the user enter room4/if room 4 is true then print out a description of the room

                //room 5 code
                if(room5){
                    String r3D = "you can move down to room 3";
                    String r6U = "you can move up to room 6";
                    System.out.println("room 5" + "\r\n" + r3D + "\r\n" + r6U);
                    gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                    //i++;
                    System.out.print("\r\n" + "\r\n" + "Number of moves" + i);
                }//if the user enter room5/if room 5 is true then print out a description of the room
                if(room5 && gameKeyboard.equals ("f")){
                    System.out.println("You found item 2");
                    item2 = true;
                    gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                }// if the user is in room 5 and inputs f to search the room they'll find item 2 and make the item 2 boolean true

                //room 6 code
                if(room6){
                    /*
                    static void (String deathMessage){
                    System.out.println(deathMessage);
                    }
                     */
                    /**
                    System.out.println("trap room. you fell to your death");
                    System.exit(0);
                     */
                }//if the user enter room6/if room 6 is true then print out a description of the room

                //room 7 code
                if(room7){
                    String r8U = "you can move up to room 8";
                    String r3S = "you can move south to room 3";
                    System.out.println("room 7" + "\r\n" + r8U + "\r\n" +r3S);
                    gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                    //i++;
                    System.out.print("\r\n" + "\r\n" + "Number of moves" + i);
                }//if the user enter room 7/if room 7 is true then print out a description of the room
                if(room7 && gameKeyboard.equals ("f")){
                    System.out.println("You found item 3");
                    item3 = true;
                    gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                }// if the user is in room 7 and inputs f to search the room they'll find item 3 and make the item 3 boolean true

                //room 8
                if(room8){
                    String r7D = "you can move down to room 7";
                    System.out.println("room 8" + "\r\n" + r7D);
                    gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                    //i++;
                    System.out.print("\r\n" + "\r\n" + "Number of moves" + i);
                }//if the user enter room8/if room 8 is true then print out a description of the room
                if(room8 && gameKeyboard.equals ("f") && item1 && item2 && item3){
                    System.out.println("Exit");
                    exit = true;
                    ///room8NoItems = false;
                }// if the user is in room 8 and inputs f to search the room they'll stumble upon an exit
                /**
                if(room8 && gameKeyboard.equals ("f") && !item1 || !item2 || !item3){
                //room8NoItems = true;            
                System.out.println("You don't have all the items");    
                gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                //room8NoItems = true;
                }
                 */   
                /*
                if(room8 == true && item1 == false || item2 == false || item3 == false){
                System.out.println("You don't have all the items");    
                gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                }
                 */
                /**
                if(room8 && gameKeyboard.equals ("f")){
                System.out.println("You don't have all the items");    
                gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                }
                 */
                if(room8NoItems){
                    System.out.println("You don't have all the items");    
                    gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
                }

                //exit room
                if(exit && item1 && item2 && item3){
                    //room8NoItems = false;
                    System.out.println("You win!");

                    ///System.exit(0);
                }//if exit, item1, item2 and item 3 have been found/are true then the user wins, the program prints out a win win message and the program ends

                //end game code
                if (gameKeyboard.equals ("end")){
                    System.out.print("ending game");
                    System.exit(0);
                }
            }
        }
        /**
        if(room8NoItems){
        System.out.println("You don't have all the items");    
        gameKeyboard = inputStream.nextLine().toLowerCase(); //the scanner reads the line below what it typed/the user input
        }
         */
    }

    public static void endProgram(String[] args){
        {
            int randomNum = (int)(Math.random()*6);
            /*
            deathMessage("You died");
            deathMessage("You fell to your death");
            deathMessage("You were crushed to death"); 
            deathMessage("You fell into a spike pit"); 
            deathMessage("You got gunned down"); 
            deathMessage("You suffocated");
            */
            /**
            if(randomNum == 1){
            System.out.print("You fell to your death");
            }
            if(randomNum == 2){
            System.out.print("You were crushed to death");    
            }
            if(randomNum == 3){
            System.out.print("You fell into a spike pit"); 
            }
            if(randomNum == 4){
            System.out.print("You got gunned down");  
            }
            if(randomNum == 5){
            System.out.print("You suffocated");
            }
             */
        }
    }
}

