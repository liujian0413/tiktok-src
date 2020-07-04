package org.apache.http.auth;

import org.apache.http.params.HttpParams;

public interface AuthSchemeFactory {
    AuthScheme newInstance(HttpParams httpParams);
}
