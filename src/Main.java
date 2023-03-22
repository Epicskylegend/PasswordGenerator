import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String args[]) {
        String [] validCharacters = {"a","A","b","B","c","C","d","D","e","E","f","F","g","G",
                "h","H","i","I","j","J","k","K","l","L","m","M","n","N","o","O","p","P","q","Q",
                "r","R","s","S","t","T","u","U","v","V","w","W","x","X","y","Y","z","Z","0","1","2","3","4","5","6","7","8","9","!","@",
                "#","$","%","^","&","*","-","_","+",".","~","=",};
        Scanner password = new Scanner(System.in);
        Random random = new Random();
        //System.out.println(validCharacters.length);


    System.out.println("Welcome to the password generator. What length would you like your password to be?");
    System.out.println("Type 's' to stop");

    while(!password.equals("s") || !password.equals("S")) {
    int passwordLength = password.nextInt();
    ArrayList<String> newList = new ArrayList<String>();
    String randomCharacter;


    for (int i = 0; i < passwordLength; i++) {
        int randomIndex = random.nextInt(76);
        randomCharacter = validCharacters[randomIndex];
        newList.add(randomCharacter);
    }
    String newPassword = String.join("", newList);
    System.out.println(newPassword);
    //



}

    }
}
