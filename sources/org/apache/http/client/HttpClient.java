package org.apache.http.client;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.params.HttpParams;

public interface HttpClient {
    HttpResponse execute(HttpUriRequest httpUriRequest) throws IOException, ClientProtocolException;

    HttpParams getParams();
}
