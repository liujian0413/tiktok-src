package org.chromium;

import com.ttnet.org.chromium.net1.TTMonitorProvider;

/* renamed from: org.chromium.d */
public final class C48315d extends TTMonitorProvider {

    /* renamed from: a */
    private static C48315d f123366a;

    private C48315d() {
    }

    /* renamed from: a */
    public static C48315d m149834a() {
        if (f123366a == null) {
            synchronized (C48314c.class) {
                if (f123366a == null) {
                    f123366a = new C48315d();
                }
            }
        }
        return f123366a;
    }

    public final void sendAppMonitorEvent(String str, String str2) {
        C48316e.m149835a().mo121730a(str, str2);
    }

    public final void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4) {
        C48316e.m149835a().mo121731a(z, str, str2, str3, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, z2, j11, j12, str4);
    }
}
