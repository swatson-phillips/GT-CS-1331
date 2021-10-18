public class WorkerTester {
    public static void main(String[] args) {
        Employee employeeObject = new Manager();
        //employeeObject.manage();
        // down cast from higher in the hierarchy - Employee to Manager
        Manager manager1 = (Manager)employeeObject;
        employeeObject.work();
        manager1.manage();

        // compiles but ClassCastException when run - Employee to Manager
        Employee employee1 = new WorkerBee();
        //Manager m2 = (Manager) employee1;
        ((Manager) employee1).manage();

        //Up casting - up the hierarchy WorkerBee to Employee
        WorkerBee workerBeeObject  = new WorkerBee();
        workerBeeObject.work();
        workerBeeObject.buzz();
        Employee employee2 = (Employee)workerBeeObject;
        employee2.work();// this is the only method available now

        //side cast - does not compile
        //WorkerBee workerBeeObject2 = new WorkerBee();
        //Manager manager2 = (Manager)workerBeeObject2;
    }
}
