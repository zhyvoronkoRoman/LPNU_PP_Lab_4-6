package Menu;

import Train.Train;
import java.util.ArrayList;
import java.util.Scanner;

public class FindCoachByPassCommand implements Command {
    private ArrayList<Train> trains;
    private Scanner scan;

    public FindCoachByPassCommand(ArrayList<Train> trains, Scanner scan) {
        this.trains = trains;
        this.scan = scan;
    }

    @Override
    public void execute() {
        System.out.println("Оберіть потрібний потяг:");
        System.out.println("1 - Зимноводівський експрес");
        System.out.println("2 - Львівський експрес");
        System.out.println("3 - Солонківський поїзд");
        System.out.println("4 - Рівненська електричка");
        System.out.println("5 - Х'юндай");
        System.out.println("6 - Лондон - Зимна Вода");
        int choice = scan.nextInt() - 1;
        if (choice >= 0 && choice < trains.size()) {
            System.out.println("Введіть кількість місць:");
            int numOfPlaces = scan.nextInt();
            trains.get(choice).findCoach(numOfPlaces);
        } else {
            System.out.println("Неправильний вибір!");
        }
    }
}
