package Coaches;

public class BussinesCoach extends Coach {
    private int comfLevel;

    public BussinesCoach(){
       super("Бізнес клас",20,10,2000);
        setComfLevel(3);
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
