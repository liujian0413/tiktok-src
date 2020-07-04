package org.apache.http.impl.client;

import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;

public class ClientParamsStack extends AbstractHttpParams {
    protected final HttpParams applicationParams;
    protected final HttpParams clientParams;
    protected final HttpParams overrideParams;
    protected final HttpParams requestParams;

    public Object getParameter(String str) {
        if (str != null) {
            Object obj = null;
            if (this.overrideParams != null) {
                obj = this.overrideParams.getParameter(str);
            }
            if (obj == null && this.requestParams != null) {
                obj = this.requestParams.getParameter(str);
            }
            if (obj == null && this.clientParams != null) {
                obj = this.clientParams.getParameter(str);
            }
            if (obj != null || this.applicationParams == null) {
                return obj;
            }
            return this.applicationParams.getParameter(str);
        }
        throw new IllegalArgumentException("Parameter name must not be null.");
    }

    public HttpParams setParameter(String str, Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }

    public ClientParamsStack(HttpParams httpParams, HttpParams httpParams2, HttpParams httpParams3, HttpParams httpParams4) {
        this.applicationParams = httpParams;
        this.clientParams = httpParams2;
        this.requestParams = httpParams3;
        this.overrideParams = httpParams4;
    }
}
