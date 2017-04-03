package pl.akademiakodu;

/**
 * Created by Lukasz Kolacz on 18.03.2017.
 */
public enum Days {
    PONIEDZIALEK(1,false, true), WTOREK(2, false, true), SRODA(3, false, true), CZWARTEK(4, false, false), PIATEK(5, false, false), SOBOTA(6, true, true), NIEDZIELA(7, true, false);


    private int numberOfDay;
    private boolean isWeekend;
    private boolean isLecture;


    Days(int numberOfDay, boolean isWeekend, boolean isLecture){
        this.numberOfDay = numberOfDay;
        this.isWeekend = isWeekend;
        this.isLecture = isLecture;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public boolean isLecture() {
        return isLecture;
    }
}
