package com.p280ss.android.http.legacy.p877d;

import java.util.regex.Pattern;

/* renamed from: com.ss.android.http.legacy.d.c */
public final class C19575c {

    /* renamed from: a */
    private static final Pattern f52948a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    private static final Pattern f52949b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    private static final Pattern f52950c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    /* renamed from: a */
    public static boolean m64492a(String str) {
        return f52948a.matcher(str).matches();
    }
}
