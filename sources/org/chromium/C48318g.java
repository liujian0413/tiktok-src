package org.chromium;

import com.ttnet.org.chromium.net.TTEventListener;
import java.util.Map;

/* renamed from: org.chromium.g */
public class C48318g extends TTEventListener {

    /* renamed from: b */
    private static C48318g f123371b;

    /* renamed from: a */
    public boolean f123372a;

    private C48318g() {
    }

    public void onColdStartFinish() {
        if (this.f123372a) {
            C48316e.m149835a().mo121732b();
        }
    }

    public void onTNCUpdateFailed() {
        if (this.f123372a) {
            C48316e.m149835a().mo121735c();
        }
    }

    /* renamed from: a */
    public static C48318g m149884a() {
        if (f123371b == null) {
            synchronized (C48318g.class) {
                if (f123371b == null) {
                    f123371b = new C48318g();
                }
            }
        }
        return f123371b;
    }

    public void onEffectiveConnectionTypeChanged(int i) {
        if (this.f123372a) {
            C48316e.m149835a().mo121733b(i);
        }
    }

    public void onServerConfigUpdated(String str) {
        if (this.f123372a) {
            C48316e.m149835a().mo121729a(str);
        }
    }

    public void onTTNetDetectInfoChanged(String str) {
        if (this.f123372a) {
            C48316e.m149835a().mo121734b(str);
        }
    }

    public void onTTNetStateChanged(int i) {
        if (this.f123372a) {
            C48316e.m149835a().mo121727a(i);
        }
    }

    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        return C48316e.m149835a().mo121726a(str, map);
    }

    public void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4) {
        if (this.f123372a) {
            C48316e.m149835a().mo121731a(z, str, str2, str3, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, z2, j11, j12, str4);
        }
    }
}
