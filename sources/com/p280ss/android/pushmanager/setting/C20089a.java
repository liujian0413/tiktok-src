package com.p280ss.android.pushmanager.setting;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.message.C19809a;
import com.p280ss.android.pushmanager.C20077j;
import com.p280ss.android.pushmanager.setting.PushMultiProcessSharedProvider.C20088b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.pushmanager.setting.a */
public class C20089a {

    /* renamed from: a */
    private static C20089a f54329a;

    /* renamed from: b */
    private C20088b f54330b;

    /* renamed from: c */
    private SharedPreferences f54331c;

    /* renamed from: c */
    public final boolean mo53744c() {
        return this.f54330b.mo53739b();
    }

    /* renamed from: d */
    private String m66180d() {
        return this.f54330b.mo53737a("ssids", "");
    }

    private C20089a() {
        Application a = C19809a.m65408a();
        this.f54330b = PushMultiProcessSharedProvider.m66155a((Context) a);
        this.f54331c = C7285c.m22838a(a, "push_multi_process_config", 4);
    }

    /* renamed from: b */
    public final String mo53742b() {
        HashMap hashMap = new HashMap();
        mo53743b(hashMap);
        return (String) hashMap.get(C20077j.f54293a);
    }

    /* renamed from: a */
    public static synchronized C20089a m66179a() {
        C20089a aVar;
        synchronized (C20089a.class) {
            if (f54329a == null) {
                synchronized (C20089a.class) {
                    if (f54329a == null) {
                        f54329a = new C20089a();
                    }
                }
            }
            aVar = f54329a;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo53740a(Map<String, String> map) {
        if (map != null) {
            try {
                this.f54330b.mo53736a().mo53730a("ssids", C6319n.m19591a(map)).mo53732a();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo53743b(Map<String, String> map) {
        if (map != null) {
            try {
                String d = m66180d();
                if (!C6319n.m19593a(d)) {
                    C6319n.m19592a(d, map);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo53741a(String str, Boolean bool) {
        return this.f54331c.getBoolean(str, bool.booleanValue());
    }
}
