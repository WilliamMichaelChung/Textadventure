
/**
 * Write a description of class randomNumber here.
 *
 * @author (William Chung)
 * @version (18/9/23)
 */
public class deathMessage{
    static void randomNumber(){
        int randomNum = (int)(Math.random()*5);
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
        randomNumber();    
    }
}  

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