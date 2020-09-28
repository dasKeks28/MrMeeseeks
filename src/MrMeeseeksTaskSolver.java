import java.util.Scanner;

public class MrMeeseeksTaskSolver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double difficulty = Double.NaN;
        boolean inputValid = false;

        while (!inputValid) {
            System.out.println("Enter task difficulty: ");
            try {
                difficulty = Double.parseDouble(in.nextLine());
                inputValid = true;
            } catch (NumberFormatException nfe) {
                System.err.println("Not a double, try again...");
            } catch (Exception e) {
                System.err.println("Error reading input: " + e.toString());
                System.exit(1);
            }
        }

        Task task = new Task(difficulty);
        new MrMeeseeks(task);
    }
}
