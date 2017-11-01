package state.gumballstatewinner;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(20);

		System.out.println(gumballMachine);

        for (int i = 0; i <15 ; i++) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println("~~~~~~~~~~~~~~~~~");
        }
	}
}
