
package fr.aston.poec.java.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.aston.poec.java.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CelsiusFahrenheit_QNAME = new QName("http://soap.ws.java.formation.poec.aston.fr/", "celsiusFahrenheit");
    private final static QName _CelsiusFahrenheitResponse_QNAME = new QName("http://soap.ws.java.formation.poec.aston.fr/", "celsiusFahrenheitResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.aston.poec.java.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CelsiusFahrenheit }
     * 
     */
    public CelsiusFahrenheit createCelsiusFahrenheit() {
        return new CelsiusFahrenheit();
    }

    /**
     * Create an instance of {@link CelsiusFahrenheitResponse }
     * 
     */
    public CelsiusFahrenheitResponse createCelsiusFahrenheitResponse() {
        return new CelsiusFahrenheitResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelsiusFahrenheit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.java.formation.poec.aston.fr/", name = "celsiusFahrenheit")
    public JAXBElement<CelsiusFahrenheit> createCelsiusFahrenheit(CelsiusFahrenheit value) {
        return new JAXBElement<CelsiusFahrenheit>(_CelsiusFahrenheit_QNAME, CelsiusFahrenheit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelsiusFahrenheitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ws.java.formation.poec.aston.fr/", name = "celsiusFahrenheitResponse")
    public JAXBElement<CelsiusFahrenheitResponse> createCelsiusFahrenheitResponse(CelsiusFahrenheitResponse value) {
        return new JAXBElement<CelsiusFahrenheitResponse>(_CelsiusFahrenheitResponse_QNAME, CelsiusFahrenheitResponse.class, null, value);
    }

}
