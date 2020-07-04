package com.bytedance.android.livesdk.browser.p198h;

import android.os.SystemClock;
import com.bytedance.android.live.browser.C3142b;
import com.bytedance.android.live.core.p148d.C3171d;
import com.bytedance.android.live.core.p148d.C3172e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.browser.h.a */
public final class C4029a {

    /* renamed from: a */
    private long f12000a;

    /* renamed from: b */
    private final String f12001b;

    /* renamed from: c */
    private final String f12002c;

    /* renamed from: d */
    private C3142b f12003d;

    /* renamed from: a */
    public final void mo11651a() {
        m14087a(0, 0, "");
    }

    /* renamed from: b */
    public final void mo11653b() {
        m14087a(1, 0, "");
    }

    /* renamed from: c */
    public final void mo11654c() {
        m14087a(3, 0, "");
    }

    /* renamed from: a */
    public final void mo11652a(int i, String str) {
        m14087a(2, i, str);
    }

    public C4029a(String str, String str2, C3142b bVar) {
        this.f12001b = str;
        this.f12002c = str2;
        this.f12003d = bVar;
    }

    /* renamed from: a */
    private void m14087a(int i, int i2, String str) {
        long j = 0;
        if (i == 0) {
            this.f12000a = SystemClock.uptimeMillis();
        } else if (this.f12000a > 0) {
            long j2 = this.f12000a;
            this.f12000a = 0;
            j = SystemClock.uptimeMillis() - j2;
        } else {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("webview_scene", this.f12001b);
        hashMap.put("url", this.f12002c);
        if (i2 != 0) {
            hashMap.put("error_code", Integer.valueOf(i2));
            hashMap.put("error_msg", str);
        }
        C3172e.m11999a(C3171d.m11992a("ttlive_webview_load_status"), i, j, (Map<String, Object>) hashMap);
        if (i == 2) {
            C3172e.m12001a(C3171d.m11993b("ttlive_webview_load_status"), i, (Map<String, Object>) hashMap);
        }
        if (this.f12003d != null) {
            switch (i) {
                case 0:
                    this.f12003d.mo9979a(hashMap);
                    return;
                case 1:
                    this.f12003d.mo9978a(j, hashMap);
                    return;
                case 2:
                    this.f12003d.mo9980b(j, hashMap);
                    return;
                case 3:
                    this.f12003d.mo9981c(j, hashMap);
                    break;
            }
        }
    }
}
