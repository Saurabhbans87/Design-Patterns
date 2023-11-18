/**
 * Create by saurabh
 * Date: 19/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.facade.iot;

public class Client {
    public static void main(String[] args) {
        FacadeDesign facadeDesign = new FacadeDesign();
        facadeDesign.startIotSystem("FAN","ON");
        facadeDesign.startIotSystem("FAN","OFF");
    }
}
