import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner pd = new Scanner(System.in);

        List <Double> list = new ArrayList<>();

        System.out.println("Enter the number of students: ");
        int number = pd.nextInt();

        for (int i = 0; i< number; i++){
            System.out.println("Enter the notes: ");
            Double notes = pd.nextDouble();
            list.add(notes);

        }

        Double avg = list.stream().reduce(0.0, (x,y) -> x + y)/ list.size();

        System.out.println("--------- Notes---------");

        for(Double p : list){
            System.out.println("Notes: " + p);
        }

        System.out.println("Average: " + avg);

        

        pd.close();
    }
}
