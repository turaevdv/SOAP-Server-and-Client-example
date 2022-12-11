package ru.turaev.soapserver.service;

import ru.turaev.soapserver.model.Gender;
import ru.turaev.soapserver.model.People;

import javax.jws.WebService;
import java.time.LocalDate;
import java.util.*;

@WebService(
        targetNamespace = "http://services.ws.sample/",
        serviceName = "PeopleService",
        portName = "PeoplePort",
        endpointInterface = "ru.turaev.soapserver.service.PeopleService")
public class PeopleServiceImpl implements PeopleService {
    private static final Map<Integer, People> fathers;

    static {
        fathers = new HashMap<>();
        People child1 = new People("Семен", "Дворянинов", new Date(100, Calendar.OCTOBER, 21), null, Gender.MAN, true, 1, 1.75);
        People child2 = new People("Анна", "Дворянинова", new Date(116, Calendar.MAY, 4), null, Gender.WOMAN, false, 0, 1.62);
        List<People> children = List.of(child1, child2);
        People father = new People("Алексей", "Дворянинов", new Date(72, Calendar.MARCH, 30), children, Gender.MAN, true, 2, 1.8);
        fathers.put(1014, father);
    }

    @Override
    public People getFatherById(int id) {
        return fathers.get(id);
    }
}
