package main.java.com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {
    private int repetitions;
    private int recovery;


    public SprintEntry(String name, int day, int month, int year, int hour, int min, int sec, float distance, int repetitions, int recovery) {
        super(name, day, month, year, hour, min, sec, distance);
        this.repetitions = repetitions;
        this.recovery = recovery;
    }


    @Override
    public String getEntry() {
        String result =  getName() + " sprinted " + repetitions + "x"
                        + (int) getDistance() + "m in "
                        + getHour() + ":" + getMin() + ":" + getSec()
                        + " with " + recovery + " minutes recovery on "
                        + getDay() + "/" + getMonth() + "/" + getYear() + "\n";

        return result;
    }

    // Getters for repetitions and recovery
    public int getRepetitions() {
        return repetitions;
    }

    public int getRecovery() {
        return recovery;
    }

}
