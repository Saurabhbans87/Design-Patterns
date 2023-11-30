/**
 * Create by saurabh
 * Date: 30/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.command;
/*
Concrete command
 */
public class TurnOffCommand implements Command{
    private TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
