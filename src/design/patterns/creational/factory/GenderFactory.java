/**
 * Create by saurabh
 * Date: 18/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.factory;

public class GenderFactory {
    Gender getGenderObject(GenderType genderType){
        if(genderType.equals(GenderType.MALE)){
            return new Male();
        } else if (genderType.equals(GenderType.FEMALE)) {
            return  new Female();
        }else {
            return null;
        }
    }
}
