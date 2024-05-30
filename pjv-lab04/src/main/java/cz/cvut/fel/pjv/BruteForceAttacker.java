package cz.cvut.fel.pjv;

public class BruteForceAttacker extends Thief {
    
    @Override
    public void breakPassword(int sizeOfPassword) {
        // write your code
        char[] characters = getCharacters();
        char[] password;
        password = new char[sizeOfPassword];
        int index;
        generatePassword(characters,password,0);
    }

    void generatePassword(char[] characters, char[] password, int index ) {
        if (index == password.length) {
            if (tryOpen(password)) {
                return;
            }
        } else {
            for (char i : characters) {
                password[index] = i;
                generatePassword(characters,password,index + 1);
                if (isOpened()) {
                    return;
                }
            }
        }
    }
    
}
