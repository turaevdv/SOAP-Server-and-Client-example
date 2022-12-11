
package ru.turaev.soapclient.ws.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PeopleService", targetNamespace = "http://services.ws.sample/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PeopleService {


    /**
     * 
     * @param id
     * @return
     *     returns ru.turaev.soapclient.ws.generated.People
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFatherById", targetNamespace = "http://services.ws.sample/", className = "ru.turaev.soapclient.ws.generated.GetFatherById")
    @ResponseWrapper(localName = "getFatherByIdResponse", targetNamespace = "http://services.ws.sample/", className = "ru.turaev.soapclient.ws.generated.GetFatherByIdResponse")
    public People getFatherById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}
