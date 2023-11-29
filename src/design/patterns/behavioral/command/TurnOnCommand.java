/**
 * Create by saurabh
 * Date: 30/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.behavioral.command;

public class TurnOnCommand implements Command{
    private TV tv;

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
