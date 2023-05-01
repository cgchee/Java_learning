package _chap_08;

import _chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "Black one"; // public
        //b1.resolution = "FHD"; // default
        //b1.price = 200000; // private
        //b1.color = "Black"; // protected
    }
}
