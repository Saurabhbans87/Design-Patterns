/**
 * Create by saurabh
 * Date: 19/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.facade.iot;

public class FacadeDesign {
    private Fan fan  = new Fan();
    private Light light = new Light();
    private Music music = new Music();

    public FacadeDesign(Fan fan, Light light, Music music) {
        this.fan = fan;
        this.light = light;
        this.music = music;
    }

    public FacadeDesign() {
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
