package org.apache.http.params;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;

public final class BasicHttpParams extends AbstractHttpParams implements Serializable, Cloneable {
    private static final long serialVersionUID = -7086398485908701455L;
    private final HashMap parameters = new HashMap();

    public final void clear() {
        this.parameters.clear();
    }

    public final Object clone() throws CloneNotSupportedException {
        BasicHttpParams basicHttpParams = (BasicHttpParams) super.clone();
        copyParams(basicHttpParams);
        return basicHttpParams;
    }

    public final HttpParams copy() {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        copyParams(basicHttpParams);
        return basicHttpParams;
    }

    public final Object getParameter(String str) {
        return this.parameters.get(str);
    }

    public final boolean isParameterSet(String str) {
        if (getParameter(str) != null) {
            return true;
        }
        return false;
    }

    public final boolean isParameterSetLocally(String str) {
        if (this.parameters.get(str) != null) {
            return true;
        }
        return false;
    }

    public final boolean removeParameter(String str) {
        if (!this.parameters.containsKey(str)) {
            return false;
        }
        this.parameters.remove(str);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void copyParams(HttpParams httpParams) {
        for (Entry entry : this.parameters.entrySet()) {
            if (entry.getKey() instanceof String) {
                httpParams.setParameter((String) entry.getKey(), entry.getValue());
            }
        }
    }

    public final HttpParams setParameter(String str, Object obj) {
        this.parameters.put(str, obj);
        return this;
    }

    public final void setParameters(String[] strArr, Object obj) {
        for (String parameter : strArr) {
            setParameter(parameter, obj);
        }
    }
}
