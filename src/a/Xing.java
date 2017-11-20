package a;

import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.net.URI;

public class Xing {

    CloseableHttpClient httpClient = HttpClients.createDefault();

    URI uri = new URIBuilder()
            .setScheme("http")
            .setHost("api.xing.com")
            .setPath("")
}
