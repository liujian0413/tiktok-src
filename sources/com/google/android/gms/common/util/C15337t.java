package com.google.android.gms.common.util;

import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.common.util.t */
public final class C15337t {

    /* renamed from: a */
    private static final Pattern f39609a = Pattern.compile("\\$\\{(.*?)\\}");

    /* renamed from: a */
    public static boolean m44610a(String str) {
        return str == null || str.trim().isEmpty();
    }
}
