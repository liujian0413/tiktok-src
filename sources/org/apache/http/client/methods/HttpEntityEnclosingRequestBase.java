package org.apache.http.client.methods;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.utils.CloneUtils;

public abstract class HttpEntityEnclosingRequestBase extends HttpRequestBase implements HttpEntityEnclosingRequest {
    private HttpEntity entity;

    public HttpEntity getEntity() {
        return this.entity;
    }

    public Object clone() throws CloneNotSupportedException {
        HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase = (HttpEntityEnclosingRequestBase) super.clone();
        if (this.entity != null) {
            httpEntityEnclosingRequestBase.entity = (HttpEntity) CloneUtils.clone(this.entity);
        }
        return httpEntityEnclosingRequestBase;
    }

    public boolean expectContinue() {
        Header firstHeader = getFirstHeader("Expect");
        if (firstHeader == null || !"100-Continue".equalsIgnoreCase(firstHeader.getValue())) {
            return false;
        }
        return true;
    }

    public void setEntity(HttpEntity httpEntity) {
        this.entity = httpEntity;
    }
}
