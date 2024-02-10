package model;

public class TrimPiece {
    private String myColor;
    private Manufacture myMF;
    private TrimType myType;
    private double myL;
    private double myW;
    private double myH;

    public TrimPiece(final String theColor, final Manufacture theMF, final TrimType theType,
                     final double theL, final double theW, final double theH) {
        this.myColor = theColor;
        this.myMF = theMF;
        this.myType = theType;
        this.myL = theL;
        this.myW = theW;
        this.myH = theH;
    }

    public String getColor() {
        return myColor;
    }

    public void setColor(final String myColor) {
        this.myColor = myColor;
    }

    public TrimType getType() {
        return myType;
    }

    public void setType(final TrimType myType) {
        this.myType = myType;
    }

    public double getLength() {
        return myL;
    }

    public void setLength(final double myL) {
        this.myL = myL;
    }

    public double geWeight() {
        return myW;
    }

    public void setWeight(final double myW) {
        this.myW = myW;
    }

    public double getHeight() {
        return myH;
    }

    public void setHeight(final double myH) {
        this.myH = myH;
    }
}
