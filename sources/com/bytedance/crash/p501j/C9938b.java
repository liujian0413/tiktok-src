package com.bytedance.crash.p501j;

import android.text.TextUtils;
import com.bytedance.crash.event.C9888b;
import com.bytedance.news.common.service.manager.C6446c;
import com.bytedance.services.slardar.config.C6480a;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.j.b */
public final class C9938b {

    /* renamed from: m */
    public static boolean f27112m = false;

    /* renamed from: n */
    private static IConfigManager f27113n = null;

    /* renamed from: o */
    private static boolean f27114o = true;

    /* renamed from: a */
    public boolean f27115a = true;

    /* renamed from: b */
    public String f27116b = "https://api2.musical.ly/monitor/collect/c/crash";

    /* renamed from: c */
    public String f27117c = "https://api2.musical.ly/monitor/collect/c/exception";

    /* renamed from: d */
    public String f27118d = "https://api2.musical.ly/monitor/collect/c/native_bin_crash";

    /* renamed from: e */
    public String f27119e = "https://mon.byteoversea.com/monitor/collect/c/logcollect";

    /* renamed from: f */
    public long f27120f = 8000;

    /* renamed from: g */
    public int f27121g = 512;

    /* renamed from: h */
    public int f27122h = 1;

    /* renamed from: i */
    public boolean f27123i = true;

    /* renamed from: j */
    public boolean f27124j = true;

    /* renamed from: k */
    public long f27125k = 1000;

    /* renamed from: l */
    public boolean f27126l;

    /* renamed from: c */
    public static boolean m29414c() {
        return f27114o;
    }

    /* renamed from: a */
    public final boolean mo24558a() {
        if (mo24559b() != null) {
            return mo24559b().getLogTypeSwitch("core_exception_monitor");
        }
        return this.f27124j;
    }

    /* renamed from: b */
    public final IConfigManager mo24559b() {
        if (f27114o && f27113n == null) {
            try {
                f27113n = (IConfigManager) C6446c.m20127a(IConfigManager.class);
            } catch (Throwable unused) {
                f27114o = false;
            }
            if (f27113n != null) {
                f27113n.registerConfigListener(new C6480a() {
                    public final void onReady() {
                        C9938b.f27112m = true;
                    }

                    public final void onRefresh(JSONObject jSONObject, boolean z) {
                    }
                });
            }
        }
        if (!f27114o || !f27112m) {
            return null;
        }
        return f27113n;
    }

    /* renamed from: a */
    public final void mo24557a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C9888b.m29182a();
            this.f27117c = str;
        }
    }

    /* renamed from: b */
    public final void mo24560b(String str) {
        if (!TextUtils.isEmpty(str)) {
            C9888b.m29182a();
            this.f27118d = str;
        }
    }

    /* renamed from: c */
    public final void mo24561c(String str) {
        if (!TextUtils.isEmpty(str)) {
            C9888b.m29182a();
            this.f27116b = str;
        }
    }
}
