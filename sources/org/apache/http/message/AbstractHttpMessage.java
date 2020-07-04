package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpMessage;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

public abstract class AbstractHttpMessage implements HttpMessage {
    protected HeaderGroup headergroup;
    protected HttpParams params;

    protected AbstractHttpMessage() {
        this(null);
    }

    public Header[] getAllHeaders() {
        return this.headergroup.getAllHeaders();
    }

    public HeaderIterator headerIterator() {
        return this.headergroup.iterator();
    }

    public HttpParams getParams() {
        if (this.params == null) {
            this.params = new BasicHttpParams();
        }
        return this.params;
    }

    public void addHeader(Header header) {
        this.headergroup.addHeader(header);
    }

    public boolean containsHeader(String str) {
        return this.headergroup.containsHeader(str);
    }

    public Header getFirstHeader(String str) {
        return this.headergroup.getFirstHeader(str);
    }

    public Header[] getHeaders(String str) {
        return this.headergroup.getHeaders(str);
    }

    public void setHeaders(Header[] headerArr) {
        this.headergroup.setHeaders(headerArr);
    }

    protected AbstractHttpMessage(HttpParams httpParams) {
        this.headergroup = new HeaderGroup();
        this.params = httpParams;
    }

    public HeaderIterator headerIterator(String str) {
        return this.headergroup.iterator(str);
    }

    public void setParams(HttpParams httpParams) {
        if (httpParams != null) {
            this.params = httpParams;
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public void addHeader(String str, String str2) {
        if (str != null) {
            this.headergroup.addHeader(new BasicHeader(str, str2));
            return;
        }
        throw new IllegalArgumentException("Header name may not be null");
    }

    public void setHeader(String str, String str2) {
        if (str != null) {
            this.headergroup.updateHeader(new BasicHeader(str, str2));
            return;
        }
        throw new IllegalArgumentException("Header name may not be null");
    }
}
