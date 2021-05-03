
package fr.poec.formation.jee.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.poec.formation.jee.ws package. 
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

    private final static QName _Addition_QNAME = new QName("http://ws.jee.formation.poec.aston.fr/", "addition");
    private final static QName _Modulo_QNAME = new QName("http://ws.jee.formation.poec.aston.fr/", "modulo");
    private final static QName _MultiplicationResponse_QNAME = new QName("http://ws.jee.formation.poec.aston.fr/", "multiplicationResponse");
    private final static QName _Multiplication_QNAME = new QName("http://ws.jee.formation.poec.aston.fr/", "multiplication");
    private final static QName _SoustrationResponse_QNAME = new QName("http://ws.jee.formation.poec.aston.fr/", "soustrationResponse");
    private final static QName _Soustration_QNAME = new QName("http://ws.jee.formation.poec.aston.fr/", "soustration");
    private final static QName _AdditionResponse_QNAME = new QName("http://ws.jee.formation.poec.aston.fr/", "additionResponse");
    private final static QName _ModuloResponse_QNAME = new QName("http://ws.jee.formation.poec.aston.fr/", "moduloResponse");
    private final static QName _DivisionResponse_QNAME = new QName("http://ws.jee.formation.poec.aston.fr/", "divisionResponse");
    private final static QName _Division_QNAME = new QName("http://ws.jee.formation.poec.aston.fr/", "division");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.poec.formation.jee.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link AdditionResponse }
     * 
     */
    public AdditionResponse createAdditionResponse() {
        return new AdditionResponse();
    }

    /**
     * Create an instance of {@link ModuloResponse }
     * 
     */
    public ModuloResponse createModuloResponse() {
        return new ModuloResponse();
    }

    /**
     * Create an instance of {@link Soustration }
     * 
     */
    public Soustration createSoustration() {
        return new Soustration();
    }

    /**
     * Create an instance of {@link SoustrationResponse }
     * 
     */
    public SoustrationResponse createSoustrationResponse() {
        return new SoustrationResponse();
    }

    /**
     * Create an instance of {@link Multiplication }
     * 
     */
    public Multiplication createMultiplication() {
        return new Multiplication();
    }

    /**
     * Create an instance of {@link Modulo }
     * 
     */
    public Modulo createModulo() {
        return new Modulo();
    }

    /**
     * Create an instance of {@link MultiplicationResponse }
     * 
     */
    public MultiplicationResponse createMultiplicationResponse() {
        return new MultiplicationResponse();
    }

    /**
     * Create an instance of {@link Addition }
     * 
     */
    public Addition createAddition() {
        return new Addition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.formation.poec.aston.fr/", name = "addition")
    public JAXBElement<Addition> createAddition(Addition value) {
        return new JAXBElement<Addition>(_Addition_QNAME, Addition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.formation.poec.aston.fr/", name = "modulo")
    public JAXBElement<Modulo> createModulo(Modulo value) {
        return new JAXBElement<Modulo>(_Modulo_QNAME, Modulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.formation.poec.aston.fr/", name = "multiplicationResponse")
    public JAXBElement<MultiplicationResponse> createMultiplicationResponse(MultiplicationResponse value) {
        return new JAXBElement<MultiplicationResponse>(_MultiplicationResponse_QNAME, MultiplicationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.formation.poec.aston.fr/", name = "multiplication")
    public JAXBElement<Multiplication> createMultiplication(Multiplication value) {
        return new JAXBElement<Multiplication>(_Multiplication_QNAME, Multiplication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoustrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.formation.poec.aston.fr/", name = "soustrationResponse")
    public JAXBElement<SoustrationResponse> createSoustrationResponse(SoustrationResponse value) {
        return new JAXBElement<SoustrationResponse>(_SoustrationResponse_QNAME, SoustrationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Soustration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.formation.poec.aston.fr/", name = "soustration")
    public JAXBElement<Soustration> createSoustration(Soustration value) {
        return new JAXBElement<Soustration>(_Soustration_QNAME, Soustration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.formation.poec.aston.fr/", name = "additionResponse")
    public JAXBElement<AdditionResponse> createAdditionResponse(AdditionResponse value) {
        return new JAXBElement<AdditionResponse>(_AdditionResponse_QNAME, AdditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModuloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.formation.poec.aston.fr/", name = "moduloResponse")
    public JAXBElement<ModuloResponse> createModuloResponse(ModuloResponse value) {
        return new JAXBElement<ModuloResponse>(_ModuloResponse_QNAME, ModuloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.formation.poec.aston.fr/", name = "divisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jee.formation.poec.aston.fr/", name = "division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

}
