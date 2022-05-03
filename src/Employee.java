package Functions;

public class Employee {
    private final int i;
    private Manager manager;

    public Employee(int i) {
        this.i=i;
    }

    public Manager getManager() {
        Manager manager=null;
        //Manager manager1 = manager;
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
