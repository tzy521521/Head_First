package command.simpleremote;

public class RemoteControlTest {
	public static void main(String[] args) {
		//调用者对象
		SimpleRemoteControl remote = new SimpleRemoteControl();
		//接收者对象
		Light light = new Light();
		//客户创建命令对象，并且设置好接收者。
		LightOnCommand lightOn = new LightOnCommand(light);
		//客户在调用者对象上调用setCommand()方法，传入命令对象
		remote.setCommand(lightOn);
		//客户按下开关，调用者将调用命令对象的execute()方法
		remote.buttonWasPressed();
    }
	
}
