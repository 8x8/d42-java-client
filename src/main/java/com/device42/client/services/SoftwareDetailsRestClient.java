package com.device42.client.services;

import com.device42.client.model.SoftwareDetails;
import com.device42.client.parser.BasicSoftwareDetailsListJsonParser;
import java.util.List;
import org.apache.http.impl.client.CloseableHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoftwareDetailsRestClient extends AbstractAsynchronousRestClient {

  private static Logger logger = LoggerFactory.getLogger(SoftwareDetailsRestClient.class);

  private BasicSoftwareDetailsListJsonParser softwareDetailsListJsonParser = new BasicSoftwareDetailsListJsonParser();

  SoftwareDetailsRestClient(String baseUrl, CloseableHttpClient httpClient) {
    super(baseUrl, httpClient);
  }

  public List<SoftwareDetails> getSoftwareById(long deviceId) {
    return get(String.format("/api/1.0/software_details/?device_id=%d", deviceId), softwareDetailsListJsonParser);
  }

}
