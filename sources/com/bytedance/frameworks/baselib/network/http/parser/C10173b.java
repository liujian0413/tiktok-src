package com.bytedance.frameworks.baselib.network.http.parser;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;

/* renamed from: com.bytedance.frameworks.baselib.network.http.parser.b */
public final class C10173b {

    /* renamed from: a */
    private Hashtable f27705a = new Hashtable();

    public C10173b() {
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(this.f27705a.size() * 16);
        Enumeration keys = this.f27705a.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            stringBuffer.append("; ");
            stringBuffer.append(str);
            stringBuffer.append('=');
            stringBuffer.append(m30215d((String) this.f27705a.get(str)));
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public final void mo24869b(String str) {
        this.f27705a.remove(str.trim().toLowerCase(Locale.ENGLISH));
    }

    public C10173b(String str) throws MimeTypeParseException {
        m30214c(str);
    }

    /* renamed from: a */
    private static boolean m30213a(char c) {
        if (c <= ' ' || c >= 127 || "()<>@,;:/[]?=\\\"".indexOf(c) >= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static String m30216e(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.ensureCapacity(length);
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (!z && charAt != '\\') {
                stringBuffer.append(charAt);
            } else if (z) {
                stringBuffer.append(charAt);
                z = false;
            } else {
                z = true;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: d */
    private static String m30215d(String str) {
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length && !z; i++) {
            z = !m30213a(str.charAt(i));
        }
        if (!z) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        double d = (double) length;
        Double.isNaN(d);
        stringBuffer.ensureCapacity((int) (d * 1.5d));
        stringBuffer.append('\"');
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\\' || charAt == '\"') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(charAt);
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public final String mo24867a(String str) {
        return (String) this.f27705a.get(str.trim().toLowerCase(Locale.ENGLISH));
    }

    /* renamed from: c */
    private void m30214c(String str) throws MimeTypeParseException {
        int i;
        String str2;
        if (str != null) {
            int length = str.length();
            if (length > 0) {
                int a = m30212a(str, 0);
                while (a < length && str.charAt(a) == ';') {
                    int a2 = m30212a(str, a + 1);
                    if (a2 < length) {
                        int i2 = a2;
                        while (i2 < length && m30213a(str.charAt(i2))) {
                            i2++;
                        }
                        String lowerCase = str.substring(a2, i2).toLowerCase(Locale.ENGLISH);
                        int a3 = m30212a(str, i2);
                        if (a3 >= length || str.charAt(a3) != '=') {
                            throw new MimeTypeParseException("Couldn't find the '=' that separates a parameter name from its value.");
                        }
                        int a4 = m30212a(str, a3 + 1);
                        if (a4 < length) {
                            char charAt = str.charAt(a4);
                            if (charAt == '\"') {
                                int i3 = a4 + 1;
                                if (i3 < length) {
                                    char c = charAt;
                                    int i4 = i3;
                                    while (i4 < length) {
                                        c = str.charAt(i4);
                                        if (c == '\"') {
                                            break;
                                        }
                                        if (c == '\\') {
                                            i4++;
                                        }
                                        i4++;
                                    }
                                    if (c == '\"') {
                                        str2 = m30216e(str.substring(i3, i4));
                                        i = i4 + 1;
                                    } else {
                                        throw new MimeTypeParseException("Encountered unterminated quoted parameter value.");
                                    }
                                } else {
                                    throw new MimeTypeParseException("Encountered unterminated quoted parameter value.");
                                }
                            } else if (m30213a(charAt)) {
                                i = a4;
                                while (i < length && m30213a(str.charAt(i))) {
                                    i++;
                                }
                                str2 = str.substring(a4, i);
                            } else {
                                StringBuilder sb = new StringBuilder("Unexpected character encountered at index ");
                                sb.append(a4);
                                throw new MimeTypeParseException(sb.toString());
                            }
                            this.f27705a.put(lowerCase, str2);
                            a = m30212a(str, i);
                        } else {
                            StringBuilder sb2 = new StringBuilder("Couldn't find a value for parameter named ");
                            sb2.append(lowerCase);
                            throw new MimeTypeParseException(sb2.toString());
                        }
                    } else {
                        return;
                    }
                }
                if (a < length) {
                    throw new MimeTypeParseException("More characters encountered in input than expected.");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo24868a(String str, String str2) {
        this.f27705a.put(str.trim().toLowerCase(Locale.ENGLISH), str2);
    }

    /* renamed from: a */
    private static int m30212a(String str, int i) {
        int length = str.length();
        while (i < length && Character.isWhitespace(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
