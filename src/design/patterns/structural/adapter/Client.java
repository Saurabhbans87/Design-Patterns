/**
 * Create by saurabh
 * Date: 21/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.adapter;

public class Client {
    public static void main(String[] args) {
        XmlData xmlData = new XmlData();
        JsonData jsonData = new XmlToJsonData(xmlData);
        String jsonData1 = jsonData.getJsonData();
        System.out.println(jsonData1);
    }
}
