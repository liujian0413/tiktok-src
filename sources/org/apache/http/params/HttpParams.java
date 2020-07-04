package org.apache.http.params;

public interface HttpParams {
    boolean getBooleanParameter(String str, boolean z);

    int getIntParameter(String str, int i);

    long getLongParameter(String str, long j);

    Object getParameter(String str);

    boolean isParameterFalse(String str);

    boolean isParameterTrue(String str);

    HttpParams setBooleanParameter(String str, boolean z);

    HttpParams setIntParameter(String str, int i);

    HttpParams setLongParameter(String str, long j);

    HttpParams setParameter(String str, Object obj);
}
