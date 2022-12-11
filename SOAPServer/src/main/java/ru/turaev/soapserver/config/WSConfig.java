package ru.turaev.soapserver.config;

import lombok.RequiredArgsConstructor;
import org.apache.cxf.Bus;

import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.turaev.soapserver.service.PeopleServiceImpl;

import javax.xml.ws.Endpoint;


@Configuration
@RequiredArgsConstructor
public class WSConfig {
    private final Bus bus;

    @Bean
    public Endpoint peopleEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new PeopleServiceImpl());
        endpoint.publish("/people");
        return endpoint;
    }
}
