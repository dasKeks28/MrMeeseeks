public class Task {

    private volatile boolean solved;
    private final double solveProb;

    public Task(double difficulty) {
        if(difficulty <= 0) { // it's trivial
            solveProb = 1;
        } else {
            solveProb = 1 / difficulty;
        }
    }

    public boolean tryToSolve() {
        if(Math.random() < solveProb) {
            solved = true;
        }
        return solved;
    }

    public boolean isSolved() {
        return solved;
    }
}
