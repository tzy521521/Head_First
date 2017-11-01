package command.undo;

public class LightOffCommand implements Command {
	Light light;
	int level;
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		//记录操作之前电灯的亮度，以便撤销操作顺利进行
		level = light.getLevel();
        light.off();
	}
 
	public void undo() {
		light.dim(level);
	}
}
