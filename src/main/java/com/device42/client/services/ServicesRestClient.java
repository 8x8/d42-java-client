package com.device42.client.services;

import java.util.List;

import org.apache.http.impl.client.CloseableHttpClient;

import com.device42.client.model.Service;
import com.device42.client.parser.BasicServicesJsonParser;
import com.device42.client.services.parameters.ServiceParameters;

public class ServicesRestClient extends AbstractAsynchronousRestClient {
    private BasicServicesJsonParser servicesJsonParser = new BasicServicesJsonParser();

    ServicesRestClient(String baseUrl, CloseableHttpClient httpClient) {
        super(baseUrl, httpClient);
    }

    public List<Service> getServices(ServiceParameters serviceParameters) {
        return get("/api/1.0/services/", servicesJsonParser, serviceParameters);
    }
}
