package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.util.Log;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.net.UnknownHostException;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.am */
public final class C41530am {
    /* renamed from: a */
    public static void m132280a(String str) {
        C6921a.m21552a(3, "Tools-Client", str);
        C41531an.m132286a(3, "Tools-Client", str);
    }

    /* renamed from: b */
    public static void m132283b(String str) {
        C6921a.m21552a(6, "Tools-Client", str);
        C41531an.m132286a(6, "Tools-Client", str);
    }

    /* renamed from: c */
    public static void m132284c(String str) {
        C6921a.m21552a(5, "Tools-Client", str);
        C41531an.m132286a(5, "Tools-Client", str);
    }

    /* renamed from: d */
    public static void m132285d(String str) {
        C6921a.m21552a(4, "Tools-Client", str);
        C41531an.m132286a(4, "Tools-Client", str);
    }

    /* renamed from: a */
    public static void m132281a(Throwable th) {
        C6921a.m21552a(6, "Tools-Client", Log.getStackTraceString(th));
    }

    /* renamed from: b */
    public static String m132282b(Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "UnknownHostException";
            }
        }
        return Log.getStackTraceString(th);
    }
}
