
/**
 * Write a description of class game here.
 *
 * @author (William Chung)
 * @version (16/5/23)
 */
import java.util.Scanner;//imports a scanner so the program can read what the user types
public class game
{
    int item1 = 1;
    int item2 = 2;
    int item3 = 3;
    int[] numberOfMoves = {5};//The amount of moves the player is given. If used up they lose

    /**
     * Constructor for objects of class game
     */
    public game()
    {
        //this part is instructions on how to play the game 
        String line1 = "In this game there are 8 different rooms you must navigate through." ; 
        String line2 = "Your objective is to collect 3 items then enter a secret room to win! "; 
        String line3 = "To navigate through the rooms you can move north, east, south, west.";
        String line4 = "To move north type N in the responses box"; 
        String line5 = "To move east type E in the responses box"; 
        String line6 = "To move south type S in the responses box"; 
        String line7 = "To move west type W in the responses box"; 
        String line8 = "To search and a room and pick up items type F in the responses box"; 
        String line9 = "Type Y to start!"; 
        String line10 = "There will also be some trapped rooms. Where if you enter them they'll kill you instantly.";
        String line11 = "To move up type U in the responses box";
        String line12 = "To move down type D in the responses box";
        String Intro = line1 + "\r\n" + line11 + "\r\n" + line12 + "\r\n" + line10 + "\r\n" + line2 + "\r\n" + line3 + "\r\n" + line4 + "\r\n" + line5 + "\r\n" + line6 + "\r\n" + line7 + "\r\n" + "\r\n"+ line8 + "\r\n"+ line9;//combines all the strings into 1 with each completed sentence going down a line
        System.out.println(Intro);//the system prints out the combined strings(intro)

        Scanner inputStream = new Scanner(System.in);//creates a new scanner
        String gamestart = inputStream.nextLine(); //the scanner reads the line below what it typed/the user input
        gamestart = gamestart.toLowerCase();//turns whatever is typed into a lowercase
        boolean startgame;
        
            startgame = true;
            while (startgame = true){
                System.out.print("starting game!" + "\r\n" + "Welcome");
                break;
            }
        }
        //System.out.print("Press Y to start!");

        /*
        if (gamestart.equals("y")){
        startgame = true;
        while (gamestart = true){
        System.out.print("starting game!" + "\r\n" + "Welcome");
        break;
        }
        } else{
        while (gamestart = false){
        System.out.print("Press Y to start!");
        }
        }

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
        /*
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
    

    boolean readgamestart(){
        Scanner keyboard = new Scanner(System.in);
        String prompt = "Press Y to start!";
        System.out.println(prompt);
        while(!keyboard.hasNextLine()){
            keyboard.nextLine();
            System.out.print("No "+prompt);
        }
        return keyboard.hasNextBoolean();

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
    }
}
