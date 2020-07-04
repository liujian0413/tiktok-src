package org.chromium;

import com.ttnet.org.chromium.net.TTMonitorProvider;

/* renamed from: org.chromium.c */
public class C48314c extends TTMonitorProvider {

    /* renamed from: a */
    private static C48314c f123365a;

    private C48314c() {
    }

    /* renamed from: a */
    public static C48314c m149833a() {
        if (f123365a == null) {
            synchronized (C48314c.class) {
                if (f123365a == null) {
                    f123365a = new C48314c();
                }
            }
        }
        return f123365a;
    }

    public void sendAppMonitorEvent(String str, String str2) {
        C48316e.m149835a().mo121730a(str, str2);
    }

    public void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4) {
        C48316e.m149835a().mo121731a(z, str, str2, str3, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, z2, j11, j12, str4);
    }
}
