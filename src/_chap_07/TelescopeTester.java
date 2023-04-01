package _chap_07;

public class TelescopeTester {
    public static void main(String[] args) {

        Telescope tele = new Telescope(3.0, 6.5, 0.8);
        //Use the accessor methods to print out the telescope’s properties.
        System.out.println( "Diameter: "+ tele.getDiameter ());
        System.out.println( "length of the main lens: "+ tele.getEyeLength());
        System.out.println(tele);
        System.out.println("Power: "+ tele.calcMagnification() + "  F-number: "+tele.calcFNumber() );
        // Use mutator method to change the main length to 7.5 inches
        tele.setMainLength(7.5);
        // and check the results
        System.out.println("New Power: "+ tele.calcMagnification());

    }
}
