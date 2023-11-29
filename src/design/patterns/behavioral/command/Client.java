/**
 * Create by saurabh
 * Date: 30/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.command;

public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        Command turnOnTV = new TurnOnCommand(tv);
        Command turnOffTV = new TurnOffCommand(tv);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnTV);
        remoteControl.pushButton();

        remoteControl.setCommand(turnOffTV);
        remoteControl.pushButton();
    }
}
