package com.bytedance.frameworks.baselib.network.http.util;

import java.util.regex.Pattern;

/* renamed from: com.bytedance.frameworks.baselib.network.http.util.d */
public final class C10184d {

    /* renamed from: a */
    private static final Pattern f27719a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    private static final Pattern f27720b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    private static final Pattern f27721c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    /* renamed from: a */
    public static boolean m30251a(String str) {
        return f27719a.matcher(str).matches();
    }
}
