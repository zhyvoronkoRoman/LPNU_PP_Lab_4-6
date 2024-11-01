package Train;

import Coaches.*;


import java.util.ArrayList;
import java.util.*;

public class Train {
    private String name;
    private ArrayList<Coach> coaches;

    public Train(String name) {
        setName(name);
        this.coaches = new ArrayList<>();
    }


    public void setName(String name) {
        this.name = name;
    }

    public void addCoach(Coach coach) {
        coaches.add(coach);
    }

    public int numofpass() {
        int numOfPass = 0;
        for (int i = 0; i < 11; i++) {
            numOfPass += coaches.get(i).getNumberOfSeats();
        }
        return numOfPass;
    }

    public int numofbagage() {
        int numOfBags = 0;
        for (int i = 0; i < 11; i++) {
            numOfBags += (coaches.get(i).getNumOfBagsPerPerson() * coaches.get(i).getNumberOfSeats());
        }
        return numOfBags;
    }

    public void sortCoaches() {
        for (int i = 0; i < coaches.size() - 1; i++) {
            for (int j = 0; j < coaches.size() - 1 - i; j++) {
                if (coaches.get(j).getComfLevel() > coaches.get(j + 1).getComfLevel()) {
                    Collections.swap(coaches, j, j + 1);
                }
            }
        }
    }

    public void findCoach(int numOfPl) {
        for (int i = 0; i < coaches.size() - 1; i++) {
            if (numOfPl >= coaches.get(i).getNumberOfSeats()) {
                System.out.println(coaches.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "\n" + name +
                ", Вагони:" + coaches;
    }
}
