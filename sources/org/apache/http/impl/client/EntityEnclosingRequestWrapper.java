package org.apache.http.impl.client;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.ProtocolException;

public class EntityEnclosingRequestWrapper extends RequestWrapper implements HttpEntityEnclosingRequest {
    private HttpEntity entity;

    public HttpEntity getEntity() {
        return this.entity;
    }

    public boolean expectContinue() {
        Header firstHeader = getFirstHeader("Expect");
        if (firstHeader == null || !"100-Continue".equalsIgnoreCase(firstHeader.getValue())) {
            return false;
        }
        return true;
    }

    public boolean isRepeatable() {
        if (this.entity == null || this.entity.isRepeatable()) {
            return true;
        }
        return false;
    }

    public void setEntity(HttpEntity httpEntity) {
        this.entity = httpEntity;
    }

    public EntityEnclosingRequestWrapper(HttpEntityEnclosingRequest httpEntityEnclosingRequest) throws ProtocolException {
        super(httpEntityEnclosingRequest);
        this.entity = httpEntityEnclosingRequest.getEntity();
    }
}
