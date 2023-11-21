/**
 * Create by saurabh
 * Date: 21/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.structural.adapter;

public class XmlToJsonData implements JsonData {

    private XmlData xmlData;

    public XmlToJsonData(XmlData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public String getJsonData() {
        String xmlData1 = xmlData.getXmlData();
        return "{\"product\": {\"amount\": \"10000\"}}";
    }
}
