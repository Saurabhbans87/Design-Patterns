/**
 * Create by saurabh
 * Date: 19/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.facade.iot;

public class FacadeDesign {
    private Fan fan;
    private Light light;
    private Music music;

    public FacadeDesign() {
        this.fan = new Fan();
        this.light = new Light();
        this.music = new Music();
    }

    public void startIotSystem(String iotDevice, String iotDeviceFunction){
        if(iotDevice.equals("FAN")){
            if(iotDeviceFunction.equals("ON")){
                fan.switchOnFan();
            } else {
                fan.switchOffFan();
            }
        } else if (iotDevice.equals("LIGHT")) {
            if(iotDeviceFunction.equals("ON")){
                light.switchOnLight();
            } else  {
                light.switchOffLight();
            }
        }else {
            if(iotDeviceFunction.equals("ON")){
                music.switchOnMusicSystem();
            } else {
                music.switchOffMusicSystem();
            }
        }
    }

}
