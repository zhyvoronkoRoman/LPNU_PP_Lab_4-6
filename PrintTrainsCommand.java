package Menu;

import Train.Train;
import java.util.ArrayList;

public class PrintTrainsCommand implements Command {
    private ArrayList<Train> trains;

    public PrintTrainsCommand(ArrayList<Train> trains) {
        this.trains = trains;
    }

    @Override
    public void execute() {
        for (Train train : trains) {
            System.out.println(train);
        }
    }
}
