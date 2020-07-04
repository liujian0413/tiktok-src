package com.bytedance.android.livesdk.browser.p193c;

import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.monitor.webview.C9529a;
import com.bytedance.android.monitor.webview.C9531c.C9532a;
import com.bytedance.android.monitor.webview.C9533d;
import com.bytedance.android.monitor.webview.C9535f;
import com.bytedance.android.monitor.webview.C9541j;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.c.d */
public final class C3980d {

    /* renamed from: a */
    private static boolean f11857a;

    /* renamed from: c */
    private static C9529a m13955c() {
        return new C9529a() {
            /* renamed from: a */
            public final void mo11574a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
                C3172e.m12003a(str, i, jSONObject, jSONObject2);
            }
        };
    }

    /* renamed from: a */
    public static void m13953a() {
        if (!f11857a) {
            f11857a = true;
            m13954b();
        }
    }

    /* renamed from: b */
    private static void m13954b() {
        C9532a a = C9541j.m28227b().mo23584a();
        a.mo23600a(m13955c()).mo23602a(true).mo23607c((String) LiveSettingKeys.WEBVIEW_MONITOR_SLARDAR_SWITCH_SET.mo10240a()).mo23601a((C9533d) C9535f.m28156a());
        C9541j.m28227b().mo23596b(a);
    }
}
