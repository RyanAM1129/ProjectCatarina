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

    public FlooringCarton(String theColor, String theLotNum, double theSF) {
        this.myColor = theColor;
        this.myLotNum = theLotNum;
        this.mySF = theSF;
    }

    public double getMySF() {
        return mySF;
    }

    public String getMyColor() {
        return myColor;
    }

    public String getMyLotNum() {
        return myLotNum;
    }

    public void setMyColor(String theColor) {
        this.myColor = myColor;
    }

    public void setMyLotNum(String theLotNum) {
        this.myLotNum = myLotNum;
    }

    public void setMySF(double theSF) {
        this.mySF = mySF;
    }
}
