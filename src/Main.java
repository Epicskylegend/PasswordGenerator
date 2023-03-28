import java.io.*;
import java.util.*;

public class Main {
    public static void main (String args[]) throws IOException {
        String [] validCharacters = {"a","A","b","B","c","C","d","D","e","E","f","F","g","G",
                "h","H","i","I","j","J","k","K","l","L","m","M","n","N","o","O","p","P","q","Q",
                "r","R","s","S","t","T","u","U","v","V","w","W","x","X","y","Y","z","Z","0","1",
                "2","3","4","5","6","7","8","9","!","@", "#","$","%","^","&","*","-","_","+",".",
                "~","=",};

        String [] validLowerCase = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};// 26 characters
        String [] validUpperCase = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}; // 26 characters
        String [] validNumbers = {"0","1","2","3","4","5","6","7","8","9"}; // 10 characters
        String [] validSymbols = {"~","!","@","#","$","%","^","&","*","-","_","=","+"}; // 13 characters

        Scanner password = new Scanner(System.in);
        Random random = new Random();
        File file = new File("C:\\Users\\adeba\\OneDrive\\Minnehack 2023\\PasswordGenerator\\words.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String word = br.readLine();
        //System.out.println(word);

        //String word;
       // while((word = br.readLine()) != null) {
            //System.out.println(word);
        //}

    System.out.println("\nWelcome to the password generator. What length would you like your password to be?\n");
    System.out.println("Type in any non-integer to stop program.");


    while(!password.equals(validCharacters)) {

        ArrayList<String> spacing = new ArrayList<String>();
        int passwordLength = password.nextInt();
        if (passwordLength < 1 ) {
            System.out.println("Please enter a number greater than 0.");
        }

    ArrayList<String> newList = new ArrayList<String>();
    String randomLowercase;
    String randomNumber;
    String randomUppercase;
    String randomSymbol;
    String randomCharacter;


    for (int i = 0; i < passwordLength;) {
        // 76 total characters

            int randomLowerIndex = random.nextInt(validLowerCase.length);
            randomLowercase = validLowerCase[randomLowerIndex];
            if(i < passwordLength && i < 4) {
                newList.add(randomLowercase);
                i++;
                spacing.add("-");
            }


            int randomNumberIndex = random.nextInt(validNumbers.length);
            randomNumber = validNumbers[randomNumberIndex];
            if (i < passwordLength && i < 4) {
                newList.add(randomNumber);
                i++;
                spacing.add("-");
            }



            int randomUpperIndex = random.nextInt(validUpperCase.length);
            randomUppercase = validUpperCase[randomUpperIndex];
            if (i < passwordLength && i < 4) {
                newList.add(randomUppercase);
                i++;
                spacing.add("-");
            }


            int randomSymbolIndex = random.nextInt(validSymbols.length);
            randomSymbol = validSymbols[randomSymbolIndex];
            if (i < passwordLength && i < 4) {
                newList.add(randomSymbol);
                i++;
                spacing.add("-");
            }

            int randomValidCharacter = random.nextInt(validCharacters.length);
            randomCharacter = validCharacters[randomValidCharacter];
            if(i < passwordLength && i >= 4) {
                newList.add(randomCharacter);
                i++;
                spacing.add("-");

            }
        }



    Collections.shuffle(newList);

     /*for(int i = 0; i <= newList.size() ; i++) {
        if(newList.get(i) == newList.get(i+1)+1) {
            System.out.println("Consecutive characters spotted!");
            Collections.shuffle(newList);
        }
    } */

    String newPassword = String.join("", newList);
    String newSpacing = String.join("", spacing);




    if(newPassword.length() < 8 && newPassword.length() != 0) {
            System.out.println("Password Strength: Very Weak.");
        }
    if(newPassword.length() == 7) {
        System.out.println("Estimated time to breach password: Less than 20 minutes.");
        }

    if(newPassword.length() == 6) {
            System.out.println("Estimated time to breach password: A few minutes.");
        }

    if(newPassword.length() < 6 && newPassword.length() > 0) {
            System.out.println("Estimated time to breach password: None.");
        }


    if(newPassword.length() == 8) {
        System.out.println("Password Strength: Weak.");
        System.out.println("Estimated time to breach password: A few hours.");
    }

    if(newPassword.length() == 9) {
            System.out.println("Estimated time to breach password: 1 day.");
        }

    if(newPassword.length() == 10) {
            System.out.println("Estimated time to breach password: Less than 2 weeks.");
        }



    if(newPassword.length() > 8 && newPassword.length() <= 12) {
            System.out.println("Password Strength: Moderate.");
        }

    if(newPassword.length() == 11) {
            System.out.println("Estimated time to crack password: 4 months.");
        }



    if(newPassword.length() > 12 && newPassword.length() < 16) {
            System.out.println("Password Strength: Strong.");
        }



    if(newPassword.length() >= 16) {
            System.out.println("Password Strength: Very Strong.");
        }

    if(newPassword.length() == 12) {
            System.out.println("Estimated time to breach password: 3 years.");
        }

    if(newPassword.length() == 13) {
            System.out.println("Estimated time to breach password: 31 years.");
        }
    if(newPassword.length() == 14) {
            System.out.println("Estimated time to breach password: Centuries.");
        }
    if(newPassword.length() >= 15) {
            System.out.println("Estimated time to breach password: Millenniums.");
        }




    System.out.println(newSpacing);
    System.out.println(newPassword);
    System.out.println(newSpacing);
   // System.out.println(newPassword.hashCode());

}

    }
}
