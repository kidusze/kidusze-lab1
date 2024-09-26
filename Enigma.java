public class Enigma{

    private String rotorInit[] = {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"};


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }

    public String decrypt(String message){        
        //TODO
        // Start from the outter and get the middle for it
        // Then find that middle value in a corresponding outter
        // For that outer value find the innermost for it. That is our encryption
        String decrypted_message = "";
         // Use a for loop to go through each character
        for (int i = 0; i < message.length(); i++) {
            // Get the current character at index i
            char current_char = message.charAt(i);

            int outer_index = rotors[2].indexOf(current_char);
            //Then we need to find the character aligned with it in the outermost rotor
            char middle_char = rotors[1].charAt(outer_index);
            // now using that char we search for it in the middle rotor and get its index 
             outer_index = rotors[2].indexOf(middle_char);
            // then we use the index from that to find the corresponding outermost roter with the same index 
            char decrypted = rotors[0].charAt(outer_index);
            // Then we append/add the encrypted character to the result
            decrypted_message  = decrypted_message.concat(Character.toString(decrypted));
            
            this.rotate();
        }

       return decrypted_message;


    }


    
    public String encrypt(String message){
        //TODO
        // Start from the inner and get the outer for it
        // Then find that outer value in a corresponding middle 
        // For that middle value find the outermost for it. That is our encryption

    }

    
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    }
    
}
