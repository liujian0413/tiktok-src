package org.apache.http.conn.ssl;

import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.p1595a.C40427a;
import java.io.IOException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.util.InetAddressUtils;

public abstract class AbstractVerifier implements X509HostnameVerifier {
    private static final String[] BAD_COUNTRY_2LDS;

    static {
        String[] strArr = {"ac", "co", "com", C39382ed.f102271A, "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", C40427a.f105096d, "org"};
        BAD_COUNTRY_2LDS = strArr;
        Arrays.sort(strArr);
    }

    public static int countDots(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == '.') {
                i++;
            }
        }
        return i;
    }

    private static boolean isIPAddress(String str) {
        if (str == null || (!InetAddressUtils.isIPv4Address(str) && !InetAddressUtils.isIPv6Address(str))) {
            return false;
        }
        return true;
    }

    public static boolean acceptableCountryWildcard(String str) {
        int length = str.length();
        if (length >= 7 && length <= 9) {
            int i = length - 3;
            if (str.charAt(i) == '.') {
                if (Arrays.binarySearch(BAD_COUNTRY_2LDS, str.substring(2, i)) < 0) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public static String[] getCNs(X509Certificate x509Certificate) {
        LinkedList linkedList = new LinkedList();
        StringTokenizer stringTokenizer = new StringTokenizer(x509Certificate.getSubjectX500Principal().toString(), ",");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf("CN=");
            if (indexOf >= 0) {
                linkedList.add(nextToken.substring(indexOf + 3));
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    public final void verify(String str, X509Certificate x509Certificate) throws SSLException {
        verify(str, getCNs(x509Certificate), getSubjectAlts(x509Certificate, str));
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            return true;
        } catch (SSLException unused) {
            return false;
        }
    }

    public final void verify(String str, SSLSocket sSLSocket) throws IOException {
        if (str != null) {
            SSLSession session = sSLSocket.getSession();
            if (session == null) {
                sSLSocket.getInputStream().available();
                session = sSLSocket.getSession();
                if (session == null) {
                    sSLSocket.startHandshake();
                    session = sSLSocket.getSession();
                }
            }
            verify(str, (X509Certificate) session.getPeerCertificates()[0]);
            return;
        }
        throw new NullPointerException("host to verify is null");
    }

    private static String[] getSubjectAlts(X509Certificate x509Certificate, String str) {
        int i;
        Collection<List> collection;
        if (isIPAddress(str)) {
            i = 7;
        } else {
            i = 2;
        }
        LinkedList linkedList = new LinkedList();
        try {
            collection = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException e) {
            Logger.getLogger(AbstractVerifier.class.getName()).log(Level.FINE, "Error parsing certificate.", e);
            collection = null;
        }
        if (collection != null) {
            for (List list : collection) {
                if (((Integer) list.get(0)).intValue() == i) {
                    linkedList.add((String) list.get(1));
                }
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        return strArr;
    }

    public final void verify(String str, String[] strArr, String[] strArr2, boolean z) throws SSLException {
        boolean z2;
        LinkedList linkedList = new LinkedList();
        if (!(strArr == null || strArr.length <= 0 || strArr[0] == null)) {
            linkedList.add(strArr[0]);
        }
        if (strArr2 != null) {
            for (String str2 : strArr2) {
                if (str2 != null) {
                    linkedList.add(str2);
                }
            }
        }
        if (!linkedList.isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer();
            String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
            Iterator it = linkedList.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                String lowerCase2 = ((String) it.next()).toLowerCase(Locale.ENGLISH);
                stringBuffer.append(" <");
                stringBuffer.append(lowerCase2);
                stringBuffer.append('>');
                if (it.hasNext()) {
                    stringBuffer.append(" OR");
                }
                boolean z4 = true;
                if (!lowerCase2.startsWith("*.") || lowerCase2.lastIndexOf(46) < 0 || !acceptableCountryWildcard(lowerCase2) || isIPAddress(str)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    boolean endsWith = lowerCase.endsWith(lowerCase2.substring(1));
                    if (!endsWith || !z) {
                        z3 = endsWith;
                        continue;
                    } else {
                        if (countDots(lowerCase) != countDots(lowerCase2)) {
                            z4 = false;
                        }
                        z3 = z4;
                        continue;
                    }
                } else {
                    z3 = lowerCase.equals(lowerCase2);
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            if (!z3) {
                StringBuilder sb = new StringBuilder("hostname in certificate didn't match: <");
                sb.append(str);
                sb.append("> !=");
                sb.append(stringBuffer);
                throw new SSLException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Certificate for <");
        sb2.append(str);
        sb2.append("> doesn't contain CN or DNS subjectAlt");
        throw new SSLException(sb2.toString());
    }
}
