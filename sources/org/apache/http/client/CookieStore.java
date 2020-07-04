package org.apache.http.client;

import java.util.List;
import org.apache.http.cookie.Cookie;

public interface CookieStore {
    void addCookie(Cookie cookie);

    List<Cookie> getCookies();
}
