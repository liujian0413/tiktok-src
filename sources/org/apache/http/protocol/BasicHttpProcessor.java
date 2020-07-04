package org.apache.http.protocol;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;

public final class BasicHttpProcessor implements Cloneable, HttpProcessor {
    protected final List requestInterceptors = new ArrayList();
    protected final List responseInterceptors = new ArrayList();

    public final Object clone() throws CloneNotSupportedException {
        BasicHttpProcessor basicHttpProcessor = (BasicHttpProcessor) super.clone();
        copyInterceptors(basicHttpProcessor);
        return basicHttpProcessor;
    }

    public final BasicHttpProcessor copy() {
        BasicHttpProcessor basicHttpProcessor = new BasicHttpProcessor();
        copyInterceptors(basicHttpProcessor);
        return basicHttpProcessor;
    }

    public final void addInterceptor(HttpRequestInterceptor httpRequestInterceptor) {
        addRequestInterceptor(httpRequestInterceptor);
    }

    public final void addInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        addResponseInterceptor(httpResponseInterceptor);
    }

    public final void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor) {
        if (httpRequestInterceptor != null) {
            this.requestInterceptors.add(httpRequestInterceptor);
        }
    }

    public final void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        if (httpResponseInterceptor != null) {
            this.responseInterceptors.add(httpResponseInterceptor);
        }
    }

    /* access modifiers changed from: protected */
    public final void copyInterceptors(BasicHttpProcessor basicHttpProcessor) {
        basicHttpProcessor.requestInterceptors.clear();
        basicHttpProcessor.requestInterceptors.addAll(this.requestInterceptors);
        basicHttpProcessor.responseInterceptors.clear();
        basicHttpProcessor.responseInterceptors.addAll(this.responseInterceptors);
    }

    public final void process(HttpRequest httpRequest, HttpContext httpContext) throws IOException, HttpException {
        for (int i = 0; i < this.requestInterceptors.size(); i++) {
            ((HttpRequestInterceptor) this.requestInterceptors.get(i)).process(httpRequest, httpContext);
        }
    }

    public final void process(HttpResponse httpResponse, HttpContext httpContext) throws IOException, HttpException {
        for (int i = 0; i < this.responseInterceptors.size(); i++) {
            ((HttpResponseInterceptor) this.responseInterceptors.get(i)).process(httpResponse, httpContext);
        }
    }
}
