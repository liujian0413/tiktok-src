package com.squareup.okhttp.internal.tls;

import com.taobao.android.dexposed.ClassUtils;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class OkHostnameVerifier implements HostnameVerifier {
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();
    private static final Pattern VERIFY_AS_IP_ADDRESS = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private OkHostnameVerifier() {
    }

    static boolean verifyAsIpAddress(String str) {
        return VERIFY_AS_IP_ADDRESS.matcher(str).matches();
    }

    public static List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        List subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        List subjectAltNames2 = getSubjectAltNames(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(subjectAltNames.size() + subjectAltNames2.size());
        arrayList.addAll(subjectAltNames);
        arrayList.addAll(subjectAltNames2);
        return arrayList;
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        if (verifyAsIpAddress(str)) {
            return verifyIpAddress(str, x509Certificate);
        }
        return verifyHostName(str, x509Certificate);
    }

    private boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        List subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        int size = subjectAltNames.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase((String) subjectAltNames.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return verify(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    private boolean verifyHostName(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        List subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        int size = subjectAltNames.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (verifyHostName(lowerCase, (String) subjectAltNames.get(i))) {
                return true;
            }
            i++;
            z = true;
        }
        if (!z) {
            String findMostSpecific = new DistinguishedNameParser(x509Certificate.getSubjectX500Principal()).findMostSpecific("cn");
            if (findMostSpecific != null) {
                return verifyHostName(lowerCase, findMostSpecific);
            }
        }
        return false;
    }

    private static List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2) {
                    Integer num = (Integer) list.get(0);
                    if (num != null && num.intValue() == i) {
                        String str = (String) list.get(1);
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private boolean verifyHostName(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(ClassUtils.PACKAGE_SEPARATOR) || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(ClassUtils.PACKAGE_SEPARATOR) || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(ClassUtils.PACKAGE_SEPARATOR)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('.');
            str = sb.toString();
        }
        if (!str2.endsWith(ClassUtils.PACKAGE_SEPARATOR)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append('.');
            str2 = sb2.toString();
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String substring = lowerCase.substring(1);
        if (!str.endsWith(substring)) {
            return false;
        }
        int length = str.length() - substring.length();
        if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
            return true;
        }
        return false;
    }
}
