package com.bytedance.android.live.core.utils;

import com.C1642a;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.bytedance.android.live.core.utils.j */
public final class C3390j {

    /* renamed from: a */
    private static SimpleDateFormat f10186a = new SimpleDateFormat("HH:mm:ss");

    /* renamed from: b */
    private static SimpleDateFormat f10187b = new SimpleDateFormat("HH:mm:ss SSS");

    /* renamed from: c */
    private static SimpleDateFormat f10188c = new SimpleDateFormat("HH:mm:ss.SSS");

    /* renamed from: a */
    public static String m12609a(String str, Object... objArr) {
        try {
            return C1642a.m8035a(Locale.US, str, objArr);
        } catch (Exception unused) {
            return "";
        }
    }
}
