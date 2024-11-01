package Coaches;

public class EcoCoach extends Coach {
    private int comfLevel;

    public EcoCoach(){
        super("Економ клас",60,2,500);
        setComfLevel(1);
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
