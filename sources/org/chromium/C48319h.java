package org.chromium;

import com.ttnet.org.chromium.net1.TTEventListener;
import java.util.Map;

/* renamed from: org.chromium.h */
public class C48319h extends TTEventListener {

    /* renamed from: b */
    private static C48319h f123373b;

    /* renamed from: a */
    public boolean f123374a;

    private C48319h() {
    }

    public void onColdStartFinish() {
        if (this.f123374a) {
            C48316e.m149835a().mo121732b();
        }
    }

    public void onTNCUpdateFailed() {
        if (this.f123374a) {
            C48316e.m149835a().mo121735c();
        }
    }

    /* renamed from: a */
    public static C48319h m149885a() {
        if (f123373b == null) {
            synchronized (C48319h.class) {
                if (f123373b == null) {
                    f123373b = new C48319h();
                }
            }
        }
        return f123373b;
    }

    public void onEffectiveConnectionTypeChanged(int i) {
        if (this.f123374a) {
            C48316e.m149835a().mo121733b(i);
        }
    }

    public void onServerConfigUpdated(String str) {
        if (this.f123374a) {
            C48316e.m149835a().mo121729a(str);
        }
    }

    public void onTTNetDetectInfoChanged(String str) {
        if (this.f123374a) {
            C48316e.m149835a().mo121734b(str);
        }
    }

    public void onTTNetStateChanged(int i) {
        if (this.f123374a) {
            C48316e.m149835a().mo121727a(i);
        }
    }

    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        return C48316e.m149835a().mo121726a(str, map);
    }

    public void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4) {
        if (this.f123374a) {
            C48316e.m149835a().mo121731a(z, str, str2, str3, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, z2, j11, j12, str4);
        }
    }
}
