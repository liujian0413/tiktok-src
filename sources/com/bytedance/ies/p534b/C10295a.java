package com.bytedance.ies.p534b;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.ies.b.a */
public final class C10295a {

    /* renamed from: a */
    public static String f27951a = "notify.log";

    /* renamed from: b */
    public static SimpleDateFormat f27952b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: c */
    private static ExecutorService f27953c;

    /* renamed from: a */
    public static synchronized void m30492a(Context context, String str) {
        synchronized (C10295a.class) {
            try {
                if (f27953c != null) {
                    f27953c.shutdown();
                }
            } catch (Exception unused) {
            }
        }
    }
}
