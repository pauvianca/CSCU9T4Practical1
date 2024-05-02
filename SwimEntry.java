package main.java.com.stir.cscu9t4practical1;


public class SwimEntry extends Entry {
    private String swimLoc;

    public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String swimLoc) {
        super(n, d, m, y, h, min, s, dist);
        this.swimLoc = swimLoc;
    }

    public String getSwimLoc() {
        if (swimLoc.equals("pool")) {
            return "in a pool";
        } else {
            return "outdoors";
        }
    }

    @Override
    public String getEntry() {
        return getName() + " swam " + getDistance() + " km " + getSwimLoc() + " in " +
                getHour() + ":" + getMin() + ":" + getSec() + " on " +
                getDay() + "/" + getMonth() + "/" + getYear() + "\n";
    }
}
