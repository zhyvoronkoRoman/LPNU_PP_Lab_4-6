package Coaches;

public class MidleCoach extends Coach {
    private int comfLevel;

    public MidleCoach(){
        super("Середній клас",45,4,750);
        setComfLevel(2);
    }

    @Override
    public int getComfLevel() {return comfLevel;}

    public void setComfLevel(int comfLevel) {this.comfLevel = comfLevel;}

    @Override
    public String toString() {
        return super.toString() +
                " Рівень комфортності " + comfLevel + "\n";
    }
}
