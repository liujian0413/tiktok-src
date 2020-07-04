package org.apache.http.cookie;

import org.apache.http.params.HttpParams;

public interface CookieSpecFactory {
    CookieSpec newInstance(HttpParams httpParams);
}
