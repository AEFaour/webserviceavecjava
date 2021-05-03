
package fr.aston.poec.java.ws.simple;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ConvertirService", targetNamespace = "http://impl.soap.ws.java.poec.aston.fr/", wsdlLocation = "http://localhost:8081/ws-soup-simple/convertir?wsdl")
public class ConvertirService
    extends Service
{

    private final static URL CONVERTIRSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONVERTIRSERVICE_EXCEPTION;
    private final static QName CONVERTIRSERVICE_QNAME = new QName("http://impl.soap.ws.java.poec.aston.fr/", "ConvertirService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/ws-soup-simple/convertir?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONVERTIRSERVICE_WSDL_LOCATION = url;
        CONVERTIRSERVICE_EXCEPTION = e;
    }

    public ConvertirService() {
        super(__getWsdlLocation(), CONVERTIRSERVICE_QNAME);
    }

    public ConvertirService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONVERTIRSERVICE_QNAME, features);
    }

    public ConvertirService(URL wsdlLocation) {
        super(wsdlLocation, CONVERTIRSERVICE_QNAME);
    }

    public ConvertirService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONVERTIRSERVICE_QNAME, features);
    }

    public ConvertirService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConvertirService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IConvertir
     */
    @WebEndpoint(name = "ConvertirPort")
    public IConvertir getConvertirPort() {
        return super.getPort(new QName("http://impl.soap.ws.java.poec.aston.fr/", "ConvertirPort"), IConvertir.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IConvertir
     */
    @WebEndpoint(name = "ConvertirPort")
    public IConvertir getConvertirPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.soap.ws.java.poec.aston.fr/", "ConvertirPort"), IConvertir.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONVERTIRSERVICE_EXCEPTION!= null) {
            throw CONVERTIRSERVICE_EXCEPTION;
        }
        return CONVERTIRSERVICE_WSDL_LOCATION;
    }

}
