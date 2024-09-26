public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //TODO
        
        // I used substring to extract a portion of the string which  for enigma would be starting from the first index 
        // then I used charAt to extract just the very first element at index 0 and add it to the end
        // Example : ABC 
        // rotorValues.substring(1) would return "BC" and rotorValues.charAt(0) would only return "A" then add it together to get "BCA"

       // rotorValues = rotorValues.substring(0,25).concat(Character.toString(rotorValues.charAt(26)));
       // can use concat or + 
        rotorValues = rotorValues.substring(rotorValues.length()-1) + (rotorValues.substring(0,rotorValues.length()-1));

        // Check if the rotors current character matches the starting character
        if(rotorValues.charAt(0) == startChar) {
            return true;
        }
        return false;
               
    }
    

    public int indexOf(char c){
        //TODO
        // Find the index of a given character in rotor strings
        return rotorValues.indexOf(c);
    }

    public char charAt(int idx){
        //TODO
        // We return the chracter at the given index
        return rotorValues.charAt(idx);
    }
}
    
