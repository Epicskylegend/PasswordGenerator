import java.io.*;
import java.util.*;

public class Main {
    public static void main (String args[]) throws IOException {
        String [] validCharacters = {"a","A","b","B","c","C","d","D","e","E","f","F","g","G",
                "h","H","i","I","j","J","k","K","l","L","m","M","n","N","o","O","p","P","q","Q",
                "r","R","s","S","t","T","u","U","v","V","w","W","x","X","y","Y","z","Z","0","1",
                "2","3","4","5","6","7","8","9","!","@", "#","$","%","^","&","*","-","_","+",".",
                "~","=",};
        Scanner password = new Scanner(System.in);
        Random random = new Random();
        File file = new File("C:\\Users\\adeba\\OneDrive\\Minnehack 2023\\PasswordGenerator\\words.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String word = br.readLine();
        System.out.println(word);

        //String word;
       // while((word = br.readLine()) != null) {
            //System.out.println(word);
        //}

    System.out.println("Welcome to the password generator. What length would you like your password to be?");
    System.out.println("Type in any non integer to stop program.");


    while(!password.equals(validCharacters)) {

        ArrayList<String> spacing = new ArrayList<String>();
        int passwordLength = password.nextInt();
        if(passwordLength < 1 ) {
            System.out.println("Please enter a number greater than 0.");
        }

    ArrayList<String> newList = new ArrayList<String>();
    String randomCharacter;


    for (int i = 0; i < passwordLength; i++) {

        int randomIndex = random.nextInt(76);
        randomCharacter = validCharacters[randomIndex];
        newList.add(randomCharacter);
        spacing.add("-");
    }


    String newPassword = String.join("", newList);
    String newSpacing = String.join("", spacing);

    if(newPassword.length() < 8 && newPassword.length() != 0) {
            System.out.println("Password Strength: Very Weak.");
        }

    if(newPassword.length() == 8) {
        System.out.println("Password Strength: Weak.");
    }
    if(newPassword.length() > 8 && newPassword.length() <= 12) {
            System.out.println("Password Strength: Moderate.");
        }

    if(newPassword.length() > 12 && newPassword.length() < 16) {
            System.out.println("Password Strength: Strong.");
        }

    if(newPassword.length() >= 16) {
            System.out.println("Password Strength: Very Strong.");
        }


    System.out.println(newSpacing);
    System.out.println(newPassword);
    System.out.println(newSpacing);
   // System.out.println(newPassword.hashCode());


}

    }
}
