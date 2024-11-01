package Coaches;

public abstract class Coach {
    private int numberOfSeats;
    private String name;
    private double price;
    private int numOfBagsPerPerson;

    public Coach(String name,int numberOfSeats,int numOfBagsPerPerson,double price){
        setName(name);
        setNumberOfSeats(numberOfSeats);
        setNumOfBagsPerPerson(numOfBagsPerPerson);
        setPrice(price);
    }

    public abstract int getComfLevel();
    public int getNumberOfSeats() {return numberOfSeats;}
    public int getNumOfBagsPerPerson() {return numOfBagsPerPerson;}

    public void setNumberOfSeats(int numberOfSeats) {this.numberOfSeats = numberOfSeats;}
    public void setName(String name) {this.name = name;}
    public void setPrice(double price) {this.price = price;}
    public void setNumOfBagsPerPerson(int numOfBagsPerPerson) {this.numOfBagsPerPerson = numOfBagsPerPerson;}

    @Override
    public String toString() {
        return "Назва вагона  - " + name +
                ", К-сть місць - " + numberOfSeats  +
                ", К-сть сумок на особу - " + numOfBagsPerPerson +
                ", Ціна - " + price + "грн";
    }
}
