package ru.turaev.soapclient;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.turaev.soapclient.ws.generated.Gender;
import ru.turaev.soapclient.ws.generated.People;
import ru.turaev.soapclient.ws.generated.PeopleService;
import ru.turaev.soapclient.ws.generated.PeopleService_Service;

public class PeopleServiceTest {
    private static PeopleService peopleService;

    @BeforeClass
    public static void setUp() {
        PeopleService_Service service = new PeopleService_Service();
        peopleService = service.getPeoplePort();
    }

    @Test
    public void getFatherByIdTest() {
        People people = peopleService.getFatherById(1014);
        Assert.assertEquals(2, people.getChildren().size());
        Assert.assertEquals("Алексей", people.getName());
        Assert.assertEquals("Дворянинов", people.getSurname());
        Assert.assertEquals(1.8, people.getHeight(), 0.0001);
        Assert.assertTrue(people.isHasWork());
        Assert.assertEquals(Gender.MAN, people.getGender());
        Assert.assertEquals(2, people.getCountOfCars());
    }
}
