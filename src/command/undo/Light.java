package command.undo;

public class Light {
	String location;
	int level;//

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		level = 100;
		System.out.println(location + " light is on");
	}

	public void off() {
		level = 0;
		System.out.println(location + " light is off");
	}

	public void dim(int level) {
		this.level = level;
		if (level == 0) {
            System.out.print("Light is dimmed to " + level + "%--->");
			off();
		}
		else {
            System.out.print("Light is dimmed to " + level + "%--->");
            on();
		}
	}

	public int getLevel() {
		return level;
	}
}
