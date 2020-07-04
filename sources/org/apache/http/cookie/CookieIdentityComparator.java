package org.apache.http.cookie;

import java.io.Serializable;
import java.util.Comparator;

public class CookieIdentityComparator implements Serializable, Comparator<Cookie> {
    private static final long serialVersionUID = 4466565437490631532L;

    public int compare(Cookie cookie, Cookie cookie2) {
        int compareTo = cookie.getName().compareTo(cookie2.getName());
        if (compareTo == 0) {
            String domain = cookie.getDomain();
            if (domain == null) {
                domain = "";
            } else if (domain.indexOf(46) == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(domain);
                sb.append(".local");
                domain = sb.toString();
            }
            String domain2 = cookie2.getDomain();
            if (domain2 == null) {
                domain2 = "";
            } else if (domain2.indexOf(46) == -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(domain2);
                sb2.append(".local");
                domain2 = sb2.toString();
            }
            compareTo = domain.compareToIgnoreCase(domain2);
        }
        if (compareTo != 0) {
            return compareTo;
        }
        String path = cookie.getPath();
        if (path == null) {
            path = "/";
        }
        String path2 = cookie2.getPath();
        if (path2 == null) {
            path2 = "/";
        }
        return path.compareTo(path2);
    }
}
