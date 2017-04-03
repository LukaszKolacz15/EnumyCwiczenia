package pl.akademiakodu.Guitars;

/**
 * Created by Lukasz Kolacz on 18.03.2017.
 */
public enum TypeOfGuitar {

    KLASYCZNA(false, 5, "Black"), AKUSTYCZNA(false, 6, "Red"), ELEKTRYCZNO_AKUSTYCZNA(false,7, "White"), ELEKTRYCZNA(true, 8, "Black"), BASOWA( true, 6, "White");

    private boolean electricOrNo;
    private int ilsetun;
    private String colour;

    TypeOfGuitar(boolean electricOrNo, int ilestun, String colour) {
        this.electricOrNo = electricOrNo;
        this.ilsetun = ilestun;
        this.colour = colour;
    }

    public boolean isElectricOrNo() {
        return electricOrNo;
    }

    public int getIlstun() {
        return ilsetun;
    }

    public String getColour() {
        return colour;
    }

    public void setElectricOrNo(boolean electricOrNo) {
        this.electricOrNo = electricOrNo;
    }

    public void setIlstun(int ilstun) {
        this.ilsetun = ilstun;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
