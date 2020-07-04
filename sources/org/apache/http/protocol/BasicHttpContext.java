package org.apache.http.protocol;

import java.util.HashMap;
import java.util.Map;

public class BasicHttpContext implements HttpContext {
    private Map map;
    private final HttpContext parentContext;

    public BasicHttpContext() {
        this(null);
    }

    public BasicHttpContext(HttpContext httpContext) {
        this.parentContext = httpContext;
    }

    public Object getAttribute(String str) {
        if (str != null) {
            Object obj = null;
            if (this.map != null) {
                obj = this.map.get(str);
            }
            if (obj != null || this.parentContext == null) {
                return obj;
            }
            return this.parentContext.getAttribute(str);
        }
        throw new IllegalArgumentException("Id may not be null");
    }

    public void setAttribute(String str, Object obj) {
        if (str != null) {
            if (this.map == null) {
                this.map = new HashMap();
            }
            this.map.put(str, obj);
            return;
        }
        throw new IllegalArgumentException("Id may not be null");
    }
}
