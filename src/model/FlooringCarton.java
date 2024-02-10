package model;

public class FlooringCarton {
    /**
     * The color of the product.
     */
    private String myColor;
    /**
     * The square footage of the product.
     */
    private double mySF;
    /**
     * The lot number of the product.
     */
    private String myLotNum;

    public FlooringCarton(final String theColor, final String theLotNum, final double theSF) {
        this.myColor = theColor;
        this.myLotNum = theLotNum;
        this.mySF = theSF;
    }

    public double getSF() {
        return mySF;
    }

    public void setSF(final double theSF) {
        this.mySF = mySF;
    }

    public String getColor() {
        return myColor;
    }

    public void setColor(final String theColor) {
        this.myColor = myColor;
    }

    public String getLotNum() {
        return myLotNum;
    }

    public void setLotNum(final String theLotNum) {
        this.myLotNum = myLotNum;
    }
}
