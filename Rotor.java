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
        // rotorValues = rotorValues.substring(1) + rotorValues.charAt(0);

        // Check if the rotors current character matches the starting character
        if(rotorValues.charAt(0) == startChar) {
            return true;
        }
        else {
            return false;
        }
               
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
    
