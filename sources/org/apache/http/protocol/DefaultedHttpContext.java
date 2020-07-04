package org.apache.http.protocol;

public final class DefaultedHttpContext implements HttpContext {
    private final HttpContext defaults;
    private final HttpContext local;

    public final Object getAttribute(String str) {
        Object attribute = this.local.getAttribute(str);
        if (attribute == null) {
            return this.defaults.getAttribute(str);
        }
        return attribute;
    }

    public final void setAttribute(String str, Object obj) {
        this.local.setAttribute(str, obj);
    }

    public DefaultedHttpContext(HttpContext httpContext, HttpContext httpContext2) {
        if (httpContext != null) {
            this.local = httpContext;
            this.defaults = httpContext2;
            return;
        }
        throw new IllegalArgumentException("HTTP context may not be null");
    }
}
