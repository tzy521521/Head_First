package proxy.gumball;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive {
 
	public static void main(String[] args) {
		GumballMachineRemote gumballMachine = null;
		int count;

		if (args.length < 2) {
			System.out.println("GumballMachine <name> <inventory>");
 			System.exit(1);
		}

		try {
			count = Integer.parseInt(args[1]);
			LocateRegistry.createRegistry(8888);

			gumballMachine = new GumballMachine(args[0], count);
			Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);

            System.out.println("~~~");
        } catch (Exception e) {
			e.printStackTrace();
		}
	}
}
