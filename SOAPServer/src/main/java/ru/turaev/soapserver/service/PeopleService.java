package ru.turaev.soapserver.service;

import ru.turaev.soapserver.model.People;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://services.ws.sample/", name = "PeopleService")
public interface PeopleService {
    @WebMethod
    People getFatherById(@WebParam(targetNamespace = "", name = "id") int id);
}
