import java.util.*;

public class Chiphers{
    //All code was debugged using GitHub Copilot
    //Most code was written by me, but some code was taken from "https://www.javacodegeeks.com/vigenere-cipher-in-java.html"
    //Only AI generated code is the "DisplayResult" and "InitializeLetterToNumbers" methods by GitHub Copilot

    static Scanner sc = new Scanner(System.in);
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private static String alphabet2 = "abcdefghijklmnopqrstuvwxyz";

    private int[][] NUMBER_RINGS = {
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26},
        {27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52},
        {53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78},
        {79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 0, 0, 0, 0, 0}
    };

    private Map<Character, int[]> letterToNumbers = new HashMap<>(); // Initialize the map with mappings for each letter
    private  Random random = new Random();

    public Chiphers(String key){
        if(key.length() != 4 || !key.matches("[a-z]+")){
            throw new IllegalArgumentException("Key must be 4 lowercase alphabetic characters."); // Key must be 4 lowercase alphabetic characters, throw an exception error
        }
        
        int[] keyPositions = new int[4];
        for(int i = 0; i < 4; i++){
            keyPositions[i] = alphabet2.indexOf(key.charAt(i));
            if(keyPositions[i] == -1){
                throw new IllegalArgumentException("Invalid character in key: " + key.charAt(i)); // Invalid character in key, throw an exception error
            }
        }

        for(int i = 0; i < alphabet2.length(); i++){
            int[] numbers = new int[4];
            for(int j = 0; j < 4; j++){
                numbers[j] = NUMBER_RINGS[j][(i + keyPositions[j]) % alphabet2.length()]; // Calculate the number for each ring
            }
            letterToNumbers.put(alphabet2.charAt(i), numbers); // Add the mapping to the map
        }
    }

    public Chiphers(){
        //Default key is "abcd", but can be changed
        //Used if no key is given
        String key = "abcd";
        setKey(key);
    }

    public void true_main(){
        inital_questions();
    }

    public void inital_questions(){
        System.out.println("Welcome to the cipher chooser!");
        System.out.println("Choose what you would like to do.");
        System.out.println("1) Encrypt or 2) Decrypt");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
        if(choice == 1){
            encrypt_questions();
        }
        else if(choice == 2){
            decrypt_questions();
        }
        else{
            System.out.println("Enter a valid number next time.");
        }
    }

    public void encrypt_questions(){
        System.out.println("Choose what cipher you want to ENCYPT with");
        System.out.println("1) Caeser ");
        System.out.println("2) Vigenere");
        System.out.println("3) Mexican Army");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
        encrypting_one(choice);
    }

    public void decrypt_questions(){
        System.out.println("Choose what cipher you want to DECYRPT with");
        System.out.println("1) Caeser ");
        System.out.println("2) Vigenere");
        System.out.println("3) Mexican Army");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
        decrypting_one(choice);
    }

    public void decrypting_one(int choose){
        switch(choose){
            case 1:
                caeser_decrypt_questions();
                break;
            case 2:
                vigenere_decrypt_questions();
                break;
            case 3: 
                mexican_army_decrypt_questions();
                break;
        }
    }

    public void encrypting_one(int choose){
        switch(choose){
            case 1:
                caeser_encrypt_questions();
                break;
            case 2:
                vigenere_encrypt_questions();
                break;
            case 3: 
                mexican_army_encrypt_questions();
                break;
        }
    }

    //Caeser Cipher
    public void caeser_encrypt_questions(){
        int shift = 0;
        String plaintext = " ";

        System.out.println("What is your plaintext you want to encrypt?");
            plaintext = sc.nextLine();
        System.out.println("What number do you want to shift it by? (Positive numbers only)");
            shift = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
                if(shift < 0){
                    System.out.println("Positive numbers only.");
                    System.out.println("Redo this.");
                }
            String ciphertext = caeser_ciphertext(plaintext, shift);
            displayResult("Plaintext", plaintext, "Ciphertext", ciphertext);
    }

    public void caeser_decrypt_questions(){
        int shift = 0;
        String ciphertext = " ";

        System.out.println("What is your ciphertext you want to decrypt?");
            ciphertext = sc.nextLine();
        System.out.println("What number do you want to shift it by? (Positive numbers only)");
            shift = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
                if(shift < 0){
                    System.out.println("Positive numbers only.");
                    System.out.println("Redo this.");
                }
            String plaintext = caeser_plaintext(ciphertext, shift);
            displayResult("Ciphertext", ciphertext, "Plaintext", plaintext);
    }

    public String caeser_ciphertext(String plain, int shifted){
        String ciphertext = " ";
        plain = plain.toLowerCase();
        System.out.println("Note: Non-alphabetic characters will be ignored.");

        for(int i = 0; i < plain.length(); i++){
            char currentChar = plain.charAt(i);
            if(!Character.isLetter(currentChar)){
                ciphertext += currentChar; // Append non-alphabetic characters as-is
                continue;
            }
            int index = alphabet.indexOf(plain.charAt(i));
            int shift = (index + shifted) % 26;
            char replace = alphabet.charAt(shift);
            ciphertext += replace;
        }

        return ciphertext;
    }


    public String caeser_plaintext(String cipher, int shifted){
        String plaintext = " ";
        cipher = cipher.toLowerCase();
        System.out.println("Note: Non-alphabetic characters will be ignored.");
        for(int i = 0; i < cipher.length(); i++){
            char currentChar = cipher.charAt(i);
            if(!Character.isLetter(currentChar)){
                plaintext += currentChar; // Append non-alphabetic characters as-is
                continue;
            }
            int index = alphabet.indexOf(cipher.charAt(i));
            int shift = (index - shifted + 26) % 26;
            char replace = alphabet.charAt(shift);
            plaintext += replace;
        }

        return plaintext;
    }

    //Vigenere Cipher
    public void vigenere_encrypt_questions(){
        String key = " ";
        String plaintext = " ";
    
        System.out.println("What is your key?");
        System.out.println("Make sure it is all lowercase letters.");
            key = sc.nextLine();
        System.out.println("What is your plaintext?");
            plaintext = sc.nextLine();
        String ciphertext = vigenere_ciphertext(plaintext, key);
        displayResult("Plaintext", plaintext, "Ciphertext", ciphertext);
    }

    public void vigenere_decrypt_questions(){
        String key = " ";
        String ciphertext = " ";
    
        System.out.println("What is your key?");
        System.out.println("Make sure it is all lowercase letters.");
            key = sc.nextLine();
        System.out.println("What is your ciphertext?");
            ciphertext = sc.nextLine();
        String plaintext = vigenere_plaintext(ciphertext, key);
        displayResult("Ciphertext", ciphertext, "Plaintext", plaintext);
    }

    //Vigenere Cipher Encrypt / Decrypt Methods are from "https://www.javacodegeeks.com/vigenere-cipher-in-java.html"
    public String vigenere_ciphertext(String plain, String key){
        StringBuilder ciphertext = new StringBuilder();
        plain = plain.toLowerCase();
        key = key.toLowerCase();

        for(int i = 0, j = 0; i < plain.length(); i++){
            char plainChar = plain.charAt(i);
                if(!Character.isLetter(plainChar)){
                    ciphertext.append(plainChar);
                    continue;
                }
            char keyChar = key.charAt(j % key.length());
            char encryptedChar = (char) (((plainChar - 'a') + (keyChar - 'a')) % 26 + 'a');
            ciphertext.append(encryptedChar);
            j++;
        }
        return ciphertext.toString();
    }

    public String vigenere_plaintext(String cipher, String key){
        StringBuilder plaintext = new StringBuilder();
        cipher = cipher.toLowerCase();
        key = key.toLowerCase();

        for(int i = 0, j = 0; i < cipher.length(); i++){
            char cipherChar = cipher.charAt(i);
                if(!Character.isLetter(cipherChar)){
                    plaintext.append(cipherChar);
                    continue;
                }
            char keyChar = key.charAt(j % key.length());
            char decryptedChar = (char) (((cipherChar - 'a') - (keyChar - 'a') + 26) % 26 + 'a');
            plaintext.append(decryptedChar);
            j++;
        }
        return plaintext.toString();
    }

    //Mexican Army Cipher   
    public void mexican_army_encrypt_questions(){
        String plaintext = " ";
        String key = "abcd";
        System.out.println("What is your plaintext?");
            plaintext = sc.nextLine();
        System.out.println("What is your key?");
        System.out.println("Make sure it is all lowercase letters.");
        System.out.println("Key must be 4 characters long.");
            String inputkey = sc.nextLine();
        if(!inputkey.isEmpty()){
            key = inputkey;
        }

        try{
            setKey(key); // Initialize the map with the key
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
            return; // Exit the method if the key is invalid
        }

        String ciphertext = mexican_army_ciphertext(plaintext);
        displayResult("Plaintext", plaintext, "Ciphertext", ciphertext);
        System.out.println("Key: " + key);
    }

    public void mexican_army_decrypt_questions(){
        String ciphertext = " ";
        String key = "abcd";
        System.out.println("What is your ciphertext?");
            ciphertext = sc.nextLine();
        System.out.println("What is your key?");
        System.out.println("Make sure it is all lowercase letters.");
        System.out.println("Key must be 4 characters long.");
            String inputkey = sc.nextLine();
        if(!inputkey.isEmpty()){
            key = inputkey;
        }

        try{
            setKey(key); // Initialize the map with the key
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
            return; // Exit the method if the key is invalid
        }
    
        String plaintext = mexican_army_plaintext(ciphertext, key);
        displayResult("Ciphertext", ciphertext, "Plaintext", plaintext);
    }

    public String mexican_army_ciphertext(String plain){
        plain = plain.toLowerCase().replaceAll("[^a-z]", ""); // Remove non-alphabetic characters
        System.out.println("Note: Non-alphabetic characters will be ignored.");
        StringBuilder ciphertext = new StringBuilder();

        for(char c : plain.toCharArray()){
            int[] nums = letterToNumbers.get(c);
            if(nums == null) {
                throw new IllegalArgumentException("No mapping found for character: " + c);
            }
            ciphertext.append(String.format("%02d", nums[random.nextInt(nums.length)])).append(" ");
        }
        return ciphertext.toString().trim();
    }

    public String mexican_army_plaintext(String cipher, String key) {
        if(key.length() != 4){
            throw new IllegalArgumentException("Key must be 4 characters long.");
        }

        int[] keyPositions = new int[4];
        for(int i = 0; i < 4; i++){
            keyPositions[i] = alphabet2.indexOf(key.charAt(i));
            if (keyPositions[i] == -1){
                throw new IllegalArgumentException("Invalid character in key: " + key.charAt(i));
            }
        }

        StringBuilder plaintext = new StringBuilder();
        String[] parts = cipher.split(" "); // Split the ciphertext into numbers
        for(String num : parts){
            try{
                int number = Integer.parseInt(num);
                char decryptedChar = '?'; // Default to ? if no mapping is found
                for(int i = 0; i < alphabet2.length(); i++) {
                    for (int j = 0; j < 4; j++){
                        if (number == NUMBER_RINGS[j][(i + keyPositions[j]) % alphabet2.length()]) { // Calculate the number for each ring
                            decryptedChar = alphabet2.charAt(i); // Found the mapping, so set the decrypted character
                            break;
                        }
                    }
                    if (decryptedChar != '?'){ // Break out of the loop if the decrypted character is found
                        break;
                    }
                }
                plaintext.append(decryptedChar);
            } 
            catch(NumberFormatException e){ // Catch an exception if the number is invalid
                System.out.println("Invalid number in ciphertext: " + num);
                return null;
            }
        }
        return plaintext.toString();
    }

    public void displayResult(String label1, String value1, String label2, String value2) {
        System.out.println(label1 + ": " + value1);
        System.out.println(label2 + ": " + value2);
    }

    public void setKey(String key) {
        initializeLetterToNumbers(key);
    }

    // Initialize the map with mappings for each letter
    public void initializeLetterToNumbers(String key){
        int[] keyPositions = new int[4];
        for(int i = 0; i < 4; i++){
            keyPositions[i] = alphabet2.indexOf(key.charAt(i));
            if (keyPositions[i] == -1) {
                throw new IllegalArgumentException("Invalid character in key: " + key.charAt(i));
            }
        }
        for(int i = 0; i < alphabet2.length(); i++){
            int[] numbers = new int[4];
            for(int j = 0; j < 4; j++){
                numbers[j] = NUMBER_RINGS[j][(i + keyPositions[j]) % alphabet2.length()]; // Calculate the number for each ring
            }
            letterToNumbers.put(alphabet2.charAt(i), numbers); // Add the mapping to the map
        }
    }
}


