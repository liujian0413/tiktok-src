package com.fasterxml.jackson.core;

/* renamed from: com.fasterxml.jackson.core.a */
public final class C14646a {

    /* renamed from: a */
    public static final Base64Variant f37799a;

    /* renamed from: b */
    public static final Base64Variant f37800b = new Base64Variant(f37799a, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);

    /* renamed from: c */
    public static final Base64Variant f37801c;

    /* renamed from: d */
    public static final Base64Variant f37802d;

    static {
        Base64Variant base64Variant = new Base64Variant("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", true, '=', 76);
        f37799a = base64Variant;
        Base64Variant base64Variant2 = new Base64Variant(f37799a, "PEM", true, '=', 64);
        f37801c = base64Variant2;
        StringBuffer stringBuffer = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        stringBuffer.setCharAt(stringBuffer.indexOf("+"), '-');
        stringBuffer.setCharAt(stringBuffer.indexOf("/"), '_');
        Base64Variant base64Variant3 = new Base64Variant("MODIFIED-FOR-URL", stringBuffer.toString(), false, 0, Integer.MAX_VALUE);
        f37802d = base64Variant3;
    }

    /* renamed from: a */
    public static Base64Variant m42361a(String str) throws IllegalArgumentException {
        String str2;
        if (f37799a._name.equals(str)) {
            return f37799a;
        }
        if (f37800b._name.equals(str)) {
            return f37800b;
        }
        if (f37801c._name.equals(str)) {
            return f37801c;
        }
        if (f37802d._name.equals(str)) {
            return f37802d;
        }
        if (str == null) {
            str2 = "<null>";
        } else {
            StringBuilder sb = new StringBuilder("'");
            sb.append(str);
            sb.append("'");
            str2 = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("No Base64Variant with name ");
        sb2.append(str2);
        throw new IllegalArgumentException(sb2.toString());
    }
}
