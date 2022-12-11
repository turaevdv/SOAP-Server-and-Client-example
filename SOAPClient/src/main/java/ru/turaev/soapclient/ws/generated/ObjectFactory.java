
package ru.turaev.soapclient.ws.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.turaev.soapclient.ws.generated package. 
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

    private final static QName _GetFatherById_QNAME = new QName("http://services.ws.sample/", "getFatherById");
    private final static QName _GetFatherByIdResponse_QNAME = new QName("http://services.ws.sample/", "getFatherByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.turaev.soapclient.ws.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFatherById }
     * 
     */
    public GetFatherById createGetFatherById() {
        return new GetFatherById();
    }

    /**
     * Create an instance of {@link GetFatherByIdResponse }
     * 
     */
    public GetFatherByIdResponse createGetFatherByIdResponse() {
        return new GetFatherByIdResponse();
    }

    /**
     * Create an instance of {@link People }
     * 
     */
    public People createPeople() {
        return new People();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFatherById }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFatherById }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ws.sample/", name = "getFatherById")
    public JAXBElement<GetFatherById> createGetFatherById(GetFatherById value) {
        return new JAXBElement<GetFatherById>(_GetFatherById_QNAME, GetFatherById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFatherByIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFatherByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.ws.sample/", name = "getFatherByIdResponse")
    public JAXBElement<GetFatherByIdResponse> createGetFatherByIdResponse(GetFatherByIdResponse value) {
        return new JAXBElement<GetFatherByIdResponse>(_GetFatherByIdResponse_QNAME, GetFatherByIdResponse.class, null, value);
    }

}
