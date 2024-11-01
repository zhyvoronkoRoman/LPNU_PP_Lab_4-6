package Menu;

import Train.Train;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Coaches.*;
public class Menu {
    private Scanner scan = new Scanner(System.in);
    private ArrayList<Train> trains = new ArrayList<>();
    private Map<Integer, Command> commands = new HashMap<>();

    public Menu() {
        createTrain();
        initializeCommands();
    }

    private void initializeCommands() {
        commands.put(1, new FindCoachByPassCommand(trains, scan));
        commands.put(2, new PrintTrainsCommand(trains));
        commands.put(3, new SortCoachByComfortCommand(trains, scan));
        commands.put(4, new CountNumOfPassengersCommand(trains, scan));
        commands.put(5, new CountNumOfBaggageCommand(trains, scan));
    }

    private void createTrain() {
        Train train1 = new Train("Зимноводівський експрес");
        for(int i = 0;i<11;i++){
            if(i == 5 || i == 10 || i == 2){
                train1.addCoach(new MidleCoach());
                continue;
            }
            train1.addCoach(new BussinesCoach());
        }
        train1.addCoach(new EcoCoach());
        Train train2= new Train("Львівський експрес");
        for(int i = 0;i<11;i++){
            if(i == 3 || i == 1 || i == 7){
                train2.addCoach(new BussinesCoach());
                continue;
            }
            train2.addCoach(new MidleCoach());
        }
        train2.addCoach(new EcoCoach());
        Train train3 = new Train("Солонківський поїзд");
        for(int i = 0;i<11;i++){
            if(i == 7 || i == 9 || i == 2){
                train3.addCoach(new MidleCoach());
                continue;
            }
            train3.addCoach(new EcoCoach());
        }
        train3.addCoach(new BussinesCoach());
        Train train4 = new Train("Рівненьска електричка");
        for(int i = 0;i<11;i++){
            if(i == 2 || i == 1 || i == 9){
                train4.addCoach(new EcoCoach());
                continue;
            }
            train4.addCoach(new MidleCoach());
        }
        train4.addCoach(new BussinesCoach());
        Train train5 = new Train("Х'юндай");
        for(int i = 0;i<11;i++){
            if(i == 5 || i == 10 || i == 2){
                train5.addCoach(new MidleCoach());
                continue;
            }
            train5.addCoach(new BussinesCoach());
        }
        train5.addCoach(new EcoCoach());
        Train train6= new Train("Лондон - Зимна Вода");
        for(int i = 0;i<11;i++){
            if(i == 4 || i == 6 || i == 8){
                train6.addCoach(new MidleCoach());
                continue;
            }
            train6.addCoach(new BussinesCoach());
        }
        train6.addCoach(new EcoCoach());
        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        trains.add(train4);
        trains.add(train5);
        trains.add(train6);

    }

    private void showMenu() {
        System.out.println("\n\t\t MENU");
        System.out.println("1 - Знайти вагон за к-стю пасажирів");
        System.out.println("2 - Вивести інформацію про всі потяги");
        System.out.println("3 - Посортувати вагони потяга за КОМФОРТНІСТЮ");
        System.out.println("4 - Підрахувати загальну к-сть місць у потязі");
        System.out.println("5 - Підрахувати загальну місткість багажу");
        System.out.println("6 - Вихід");
    }

    public void menu() {
        int choice;
        while (true) {
            showMenu();
            System.out.println("Введіть опцію");
            choice = scan.nextInt();
            if (choice == 6) break;

            Command command = commands.get(choice);
            if (command != null) {
                command.execute();
            } else {
                System.out.println("Неправильний вибір!");
            }
        }
    }
}
