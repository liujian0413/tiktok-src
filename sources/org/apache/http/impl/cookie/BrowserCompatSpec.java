package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.cookie.Cookie;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

public class BrowserCompatSpec extends CookieSpecBase {
    protected static final String[] DATE_PATTERNS = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};
    private static final String[] DEFAULT_DATE_PATTERNS = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};
    private final String[] datepatterns;

    public int getVersion() {
        return 0;
    }

    public Header getVersionHeader() {
        return null;
    }

    public String toString() {
        return "compatibility";
    }

    public BrowserCompatSpec() {
        this(null);
    }

    public BrowserCompatSpec(String[] strArr) {
        if (strArr != null) {
            this.datepatterns = (String[]) strArr.clone();
        } else {
            this.datepatterns = DEFAULT_DATE_PATTERNS;
        }
        registerAttribHandler("path", new BasicPathHandler());
        registerAttribHandler("domain", new BasicDomainHandler());
        registerAttribHandler("max-age", new BasicMaxAgeHandler());
        registerAttribHandler("secure", new BasicSecureHandler());
        registerAttribHandler("comment", new BasicCommentHandler());
        registerAttribHandler("expires", new BasicExpiresHandler(this.datepatterns));
    }

    public List<Header> formatCookies(List<Cookie> list) {
        if (list == null) {
            throw new IllegalArgumentException("List of cookies may not be null");
        } else if (!list.isEmpty()) {
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 20);
            charArrayBuffer.append("Cookie");
            charArrayBuffer.append(": ");
            for (int i = 0; i < list.size(); i++) {
                Cookie cookie = (Cookie) list.get(i);
                if (i > 0) {
                    charArrayBuffer.append("; ");
                }
                charArrayBuffer.append(cookie.getName());
                charArrayBuffer.append("=");
                String value = cookie.getValue();
                if (value != null) {
                    charArrayBuffer.append(value);
                }
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new BufferedHeader(charArrayBuffer));
            return arrayList;
        } else {
            throw new IllegalArgumentException("List of cookies may not be empty");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<org.apache.http.cookie.Cookie> parse(org.apache.http.Header r7, org.apache.http.cookie.CookieOrigin r8) throws org.apache.http.cookie.MalformedCookieException {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00b5
            if (r8 == 0) goto L_0x00ad
            java.lang.String r0 = r7.getName()
            java.lang.String r1 = r7.getValue()
            java.lang.String r2 = "Set-Cookie"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0090
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r0 = r1.toLowerCase(r0)
            java.lang.String r2 = "expires="
            int r0 = r0.indexOf(r2)
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 == r3) goto L_0x003e
            int r0 = r0 + 8
            r5 = 59
            int r5 = r1.indexOf(r5, r0)
            if (r5 != r3) goto L_0x0033
            int r5 = r1.length()
        L_0x0033:
            java.lang.String r0 = r1.substring(r0, r5)     // Catch:{ DateParseException -> 0x003e }
            java.lang.String[] r1 = r6.datepatterns     // Catch:{ DateParseException -> 0x003e }
            org.apache.http.impl.cookie.DateUtils.parseDate(r0, r1)     // Catch:{ DateParseException -> 0x003e }
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 == 0) goto L_0x0087
            org.apache.http.impl.cookie.NetscapeDraftHeaderParser r0 = org.apache.http.impl.cookie.NetscapeDraftHeaderParser.DEFAULT
            boolean r1 = r7 instanceof org.apache.http.FormattedHeader
            if (r1 == 0) goto L_0x005b
            org.apache.http.FormattedHeader r7 = (org.apache.http.FormattedHeader) r7
            org.apache.http.util.CharArrayBuffer r1 = r7.getBuffer()
            org.apache.http.message.ParserCursor r3 = new org.apache.http.message.ParserCursor
            int r7 = r7.getValuePos()
            int r5 = r1.length()
            r3.<init>(r7, r5)
            goto L_0x0076
        L_0x005b:
            java.lang.String r7 = r7.getValue()
            if (r7 == 0) goto L_0x007f
            org.apache.http.util.CharArrayBuffer r1 = new org.apache.http.util.CharArrayBuffer
            int r3 = r7.length()
            r1.<init>(r3)
            r1.append(r7)
            org.apache.http.message.ParserCursor r3 = new org.apache.http.message.ParserCursor
            int r7 = r1.length()
            r3.<init>(r4, r7)
        L_0x0076:
            org.apache.http.HeaderElement[] r7 = new org.apache.http.HeaderElement[r2]
            org.apache.http.HeaderElement r0 = r0.parseHeader(r1, r3)
            r7[r4] = r0
            goto L_0x008b
        L_0x007f:
            org.apache.http.cookie.MalformedCookieException r7 = new org.apache.http.cookie.MalformedCookieException
            java.lang.String r8 = "Header value is null"
            r7.<init>(r8)
            throw r7
        L_0x0087:
            org.apache.http.HeaderElement[] r7 = r7.getElements()
        L_0x008b:
            java.util.List r7 = r6.parse(r7, r8)
            return r7
        L_0x0090:
            org.apache.http.cookie.MalformedCookieException r8 = new org.apache.http.cookie.MalformedCookieException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unrecognized cookie header '"
            r0.<init>(r1)
            java.lang.String r7 = r7.toString()
            r0.append(r7)
            java.lang.String r7 = "'"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x00ad:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Cookie origin may not be null"
            r7.<init>(r8)
            throw r7
        L_0x00b5:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Header may not be null"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.cookie.BrowserCompatSpec.parse(org.apache.http.Header, org.apache.http.cookie.CookieOrigin):java.util.List");
    }
}
