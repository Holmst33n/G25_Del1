public class Die {
    private final int MAX = 6; //Maximum faceValue on the die
    private int faceValue; //the faceValue of the die

    //The constructor to initialize the face value.
    public Die() {
        faceValue = 1;
    }

    // Mathod that "rolls" the dice
    public int roll(){
        faceValue = (int)(Math.random()*MAX)+1;

        return faceValue;
    }

    //Method that returns the faceValue of the die.
    public int getFaceValue(){
        return faceValue;
    }

    //Method to set the faceValue of the die. We probably won't use this.
    public void setFaceValue(int value) {
        faceValue = value;
    }

    //Method that returns the faceValue of the die as a String. Will be used to show the value.
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }

}