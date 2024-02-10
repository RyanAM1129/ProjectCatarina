package model;

import java.util.HashMap;

public class Pallet {
    private HashMap<FlooringCarton, Integer> myContents;
    /**
     * The width of the pallet in cm.
     */
    final private int myW;

    final private int myD;

    private int myH;

    private int mySF;

    public Pallet() {
        myContents = new HashMap<FlooringCarton, Integer>();
        myD = 0;
        myW = 0;
        myH = 0;
        mySF = 0;
    }

    public Pallet(final FlooringCarton theProd, final Integer theQty,
                  final int theWidth, final int theDepth) {
        myContents = new HashMap<FlooringCarton, Integer>();
        myContents.put(theProd, theQty);
        myD = theDepth;
        myW = theWidth;
        //Need to make a Controller package with a height calculator.
    }

    public Pallet(final FlooringCarton[] theProd, final Integer[] theQty) {
        myContents = new HashMap<FlooringCarton, Integer>();
        for(int i = 0; i < Math.min(theProd.length, theQty.length); i++) {
            myContents.put(theProd[i], theQty[i]);
        }
    }

    public Pallet(final HashMap theContents) {
        this.myContents = theContents;
    }

    public HashMap<FlooringCarton, Integer> getContents() {
        return myContents;
    }

    public void setContents(HashMap<FlooringCarton, Integer> myContents) {
        this.myContents = myContents;
    }
}
