package org.apache.http;

public interface HttpResponse extends HttpMessage {
    HttpEntity getEntity();

    StatusLine getStatusLine();

    void setEntity(HttpEntity httpEntity);
}
