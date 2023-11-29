/**
 * Create by saurabh
 * Date: 30/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void pushButton(){
        command.execute();
    }
}
