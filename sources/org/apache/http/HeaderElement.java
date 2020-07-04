package org.apache.http;

public interface HeaderElement {
    String getName();

    NameValuePair getParameterByName(String str);

    NameValuePair[] getParameters();

    String getValue();
}
