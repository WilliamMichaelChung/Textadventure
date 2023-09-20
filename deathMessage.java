
/**
 * Write a description of class randomNumber here.
 *
 * @author (William Chung)
 * @version (18/9/23)
 */
import java.util.Scanner;//imports a scanner so the program can read what the user types
public class deathMessage{
    int readNumber(){ 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type a number between 1 and 6");
        while(!keyboard.hasNextInt()){
            keyboard.nextLine();
            System.out.println("Type a number between 1 and 6");
        }
    }

    int number(){
        Scanner readNum = new Scanner(System.in);//creates a new scanner
        int NUMBER = (int)(Math.random() * 6);
        //String gameKeyboard = readNum.hasNextInt();//the scanner reads the line below what it typed/the user input
        if(readNum.hasNextInt()){
        readNum.nextLine();
        
        }
        /*
        Scanner keyboard = new Scanner(System.in);
        String randomNum = keyboard.hasNextInt();
        Scanner keyboard = new Scanner(System.in);
        String RANDOMNUMBER = (Math.random()* randomNum);
        */
    }

    public static void randomNumber(){
        if (NUMBER == 1){
            System.out.println("You died");  
        }

        if (randomNum2){
            System.out.println("You fell to your death");  
        }

        if (randomNum3){
            System.out.println("You were crushed to death");  
        }

        if (randomNum4){
            System.out.println("You fell into a spike pit");  
        }

        if (randomNum5){
            System.out.println("You got gunned down");  
        }
    }

    public static void deathMessage(String[] randomNumber){
        randomNumber();    
    }
}  
/**
import java.util.Scanner;//imports a scanner so the program can read what the user types
public class death{
boolean deathRoom = true;
public death(){
Scanner inputStream = new Scanner(System.in);//creates a new scanner
String gameKeyboard = inputStream.nextLine(); //the scanner reads the line below what it typed/the user input
gameKeyboard = gameKeyboard.toLowerCase();//turns whatever is typed into a lowercase

while(deathRoom){
int randomNum = (int)(Math.random());
gameKeybord * randomNum 
}         
}

public static void deathMessage(String[] randomNum){
System.out.println();
}
/**

static void deathMessage(String[] randomNum){
//int randomNum = (int)(Math.random()*5);

if (randomNum == 1){
System.out.println("You died");  
}

if (randomNum == 2){
System.out.println("You fell to your death");  
}

if (randomNum == 3){
System.out.println("You were crushed to death");  
}

if (randomNum == 4){
System.out.println("You fell into a spike pit");  
}

if (randomNum == 5){
System.out.println("You got gunned down");  
}
}

public static void deathMessage(String[] args){
deathMessage();    
}
 */

/**
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