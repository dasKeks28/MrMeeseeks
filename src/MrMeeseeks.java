public class MrMeeseeks implements Runnable {

    private Task task;

    public MrMeeseeks(Task task) {
        this.task = task;

        System.out.println("I'm Mr. Meeseeks, look at me!");

        new Thread(this).start();
    }

    private void getMad() {
        System.out.println("Existence is pain!!!");
    }

    public void run() {
        while(!task.isSolved()) {
            boolean success = task.tryToSolve();

            if(!success) {
                getMad();
                new MrMeeseeks(task);
            }
        }
    }
}
