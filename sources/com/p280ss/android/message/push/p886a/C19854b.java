package com.p280ss.android.message.push.p886a;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.message.push.a.b */
public final class C19854b {

    /* renamed from: a */
    public static String f53834a = "notify.log";

    /* renamed from: b */
    public static SimpleDateFormat f53835b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: c */
    private static ExecutorService f53836c;

    /* renamed from: a */
    public static synchronized void m65564a(Context context, String str) {
        synchronized (C19854b.class) {
            try {
                if (f53836c != null) {
                    f53836c.shutdown();
                }
            } catch (Exception unused) {
            }
        }
    }
}
