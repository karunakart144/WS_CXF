
/*
 * 
 */

package documentservices.wms0.rbcfg.servicemessage;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.5
 * Fri Feb 13 14:18:49 IST 2015
 * Generated source version: 2.2.5
 * 
 */


@WebServiceClient(name = "BizTalkServiceInstance", 
                  wsdlLocation = "http://10.211.38.145:8999/WS_CXF_Service/services?wsdl",
                  targetNamespace = "http://RBCFG.WMS0.DocumentServices/ServiceMessage/") 
public class BizTalkServiceInstance extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://RBCFG.WMS0.DocumentServices/ServiceMessage/", "BizTalkServiceInstance");
    public final static QName CustomBindingITwoWayAsync = new QName("http://RBCFG.WMS0.DocumentServices/ServiceMessage/", "CustomBinding_ITwoWayAsync");
    static {
        URL url = null;
        try {
            url = new URL("http://10.211.38.145:8999/WS_CXF_Service/services?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://10.211.38.145:8999/WS_CXF_Service/services?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public BizTalkServiceInstance(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BizTalkServiceInstance(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BizTalkServiceInstance() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns WMS0DSWebServiceBTOrcCoreProcessDocumentServicePortRcvSndDSMessage
     */
    @WebEndpoint(name = "CustomBinding_ITwoWayAsync")
    public WMS0DSWebServiceBTOrcCoreProcessDocumentServicePortRcvSndDSMessage getCustomBindingITwoWayAsync() {
        return super.getPort(CustomBindingITwoWayAsync, WMS0DSWebServiceBTOrcCoreProcessDocumentServicePortRcvSndDSMessage.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WMS0DSWebServiceBTOrcCoreProcessDocumentServicePortRcvSndDSMessage
     */
    @WebEndpoint(name = "CustomBinding_ITwoWayAsync")
    public WMS0DSWebServiceBTOrcCoreProcessDocumentServicePortRcvSndDSMessage getCustomBindingITwoWayAsync(WebServiceFeature... features) {
        return super.getPort(CustomBindingITwoWayAsync, WMS0DSWebServiceBTOrcCoreProcessDocumentServicePortRcvSndDSMessage.class, features);
    }

}
