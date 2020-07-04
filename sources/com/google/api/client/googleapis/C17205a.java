package com.google.api.client.googleapis;

import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.google.api.client.googleapis.a */
public final class C17205a {

    /* renamed from: a */
    public static final Integer f47929a = Integer.valueOf(1);

    /* renamed from: b */
    public static final Integer f47930b = Integer.valueOf(23);

    /* renamed from: c */
    public static final Integer f47931c = Integer.valueOf(0);

    /* renamed from: d */
    public static final String f47932d;

    static {
        String valueOf = String.valueOf(String.valueOf(f47929a));
        String valueOf2 = String.valueOf(String.valueOf(f47930b));
        String valueOf3 = String.valueOf(String.valueOf(f47931c));
        StringBuilder sb = new StringBuilder(valueOf.length() + 2 + valueOf2.length() + valueOf3.length());
        sb.append(valueOf);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(valueOf2);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(valueOf3);
        f47932d = sb.toString().toString();
    }
}
