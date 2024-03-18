/**
 * Create by saurabh
 * Date: 18/03/24
 * Project Name: Design-Patterns
 */
package design.patterns.creational.factory.without.with;

public class Fcatory {
    Transport build(TransportType transportType){
        if(TransportType.BYAIR.equals(transportType)){
            return new ByAir();
        } else if (TransportType.BYROAD.equals(transportType)) {
            return new ByRoad();
        }
        return null;
    }

}
