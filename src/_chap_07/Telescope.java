package _chap_07;

public class Telescope {
//A class that models a field telescope.

    //private instance variables
    private double diameter;
    private double mainLength;
    private double eyeLength;

    //Constructor
    public Telescope ( double diam, double mainLeng, double eyeLeng) {
        diameter   = diam;
        mainLength = mainLeng;
        eyeLength  = eyeLeng;
    }
    // Accessors (These methods retrieve information without changing it)
    // Add two more accessors to get information about mainLength and eyeLength
    public double getDiameter () {
        return diameter;
    }

    public double getMainLength () {
        return mainLength;
    }

    public double getEyeLength () {
        return eyeLength;
    }

    // Mutators (These methods change information related to an object)
    // Add two more mutators to change the values mainLength and eyeLength
    public void setDiameter (double diam) {
        diameter = diam;
    }

    public void setMainLength (double mainLeng) {
        mainLength = mainLeng;
    }

    public void setEyeLength (double eyeLeng) {
        eyeLength = eyeLeng;
    }

    // Methods: Note these methods are not static because they are associated with a class

    // calculate the magnification or power of the telescope
    //The formula to use is: magnification = mainLength/eyeLength
    public double  calcMagnification(){
        return mainLength/eyeLength;
    }

    //The formula to use is: fNumber = mainLength/diameter
    public double  calcFNumber(){
        return mainLength/diameter;
    }

    public String toString()  // return a String with diameter, mainLength, and eyeLength
    {
        return "Diameter: "+String.valueOf(diameter)+", main length: "+String.valueOf(mainLength)+ ", eye lenght: "+String.valueOf(eyeLength);
    }
}

