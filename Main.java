// Барлық код бір файлда (Main.java)

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class Robot implements Workable {
    public void work() {
        System.out.println("Robot is working.");
    }
}

class Human implements Workable, Eatable, Sleepable {
    public void work() {
        System.out.println("Human is working.");
    }

    public void eat() {
        System.out.println("Human is eating.");
    }

    public void sleep() {
        System.out.println("Human is sleeping.");
    }
}

public class Main {
    public static void main(String[] args) {
        Workable robot = new Robot();
        Workable humanWorker = new Human();
        Eatable humanEater = new Human();
        Sleepable humanSleeper = new Human();

        robot.work();
        humanWorker.work();

        humanEater.eat();

        humanSleeper.sleep();
    }
}
