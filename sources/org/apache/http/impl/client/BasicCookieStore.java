package org.apache.http.impl.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieIdentityComparator;

public class BasicCookieStore implements CookieStore {
    private final Comparator<Cookie> cookieComparator = new CookieIdentityComparator();
    private final ArrayList<Cookie> cookies = new ArrayList<>();

    public String toString() {
        return this.cookies.toString();
    }

    public synchronized List<Cookie> getCookies() {
        return Collections.unmodifiableList(this.cookies);
    }

    public synchronized void addCookie(Cookie cookie) {
        if (cookie != null) {
            Iterator it = this.cookies.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (this.cookieComparator.compare(cookie, it.next()) == 0) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!cookie.isExpired(new Date())) {
                this.cookies.add(cookie);
            }
        }
    }
}
