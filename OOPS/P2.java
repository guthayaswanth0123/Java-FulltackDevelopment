class Computer {
    public void taskComplete() {
        System.out.println("Task Completed");
    }
    public String computerName(String name) {
        return name;
    }
}

public class P2 {
    public static void main(String[] args) {
        Computer cp = new Computer();
        cp.taskComplete();
        System.out.println(cp.computerName("Lenovo"));
    }
}