package org.apache.http.impl.cookie;

import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.SetCookie;

public class BasicClientCookie implements Cloneable, ClientCookie, SetCookie {
    private Map<String, String> attribs;
    private String cookieComment;
    private String cookieDomain;
    private Date cookieExpiryDate;
    private String cookiePath;
    private int cookieVersion;
    private boolean isSecure;
    private final String name;
    private String value;

    public String getDomain() {
        return this.cookieDomain;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.cookiePath;
    }

    public int[] getPorts() {
        return null;
    }

    public String getValue() {
        return this.value;
    }

    public int getVersion() {
        return this.cookieVersion;
    }

    public boolean isSecure() {
        return this.isSecure;
    }

    public Object clone() throws CloneNotSupportedException {
        BasicClientCookie basicClientCookie = (BasicClientCookie) super.clone();
        basicClientCookie.attribs = new HashMap(this.attribs);
        return basicClientCookie;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[version: ");
        sb.append(Integer.toString(this.cookieVersion));
        sb.append("]");
        sb.append("[name: ");
        sb.append(this.name);
        sb.append("]");
        sb.append("[value: ");
        sb.append(this.value);
        sb.append("]");
        sb.append("[domain: ");
        sb.append(this.cookieDomain);
        sb.append("]");
        sb.append("[path: ");
        sb.append(this.cookiePath);
        sb.append("]");
        sb.append("[expiry: ");
        sb.append(this.cookieExpiryDate);
        sb.append("]");
        return sb.toString();
    }

    public void setComment(String str) {
        this.cookieComment = str;
    }

    public void setExpiryDate(Date date) {
        this.cookieExpiryDate = date;
    }

    public void setPath(String str) {
        this.cookiePath = str;
    }

    public void setSecure(boolean z) {
        this.isSecure = z;
    }

    public void setVersion(int i) {
        this.cookieVersion = i;
    }

    public boolean containsAttribute(String str) {
        if (this.attribs.get(str) != null) {
            return true;
        }
        return false;
    }

    public String getAttribute(String str) {
        return (String) this.attribs.get(str);
    }

    public void setDomain(String str) {
        if (str != null) {
            this.cookieDomain = str.toLowerCase(Locale.ENGLISH);
        } else {
            this.cookieDomain = null;
        }
    }

    public boolean isExpired(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("Date may not be null");
        } else if (this.cookieExpiryDate == null || this.cookieExpiryDate.getTime() > date.getTime()) {
            return false;
        } else {
            return true;
        }
    }

    public void setAttribute(String str, String str2) {
        this.attribs.put(str, str2);
    }

    public BasicClientCookie(String str, String str2) {
        if (str != null) {
            this.name = str;
            this.attribs = new HashMap();
            this.value = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
