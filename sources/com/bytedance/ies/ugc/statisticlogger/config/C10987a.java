package com.bytedance.ies.ugc.statisticlogger.config;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.C6730a;
import kotlin.TypeCastException;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.config.a */
public final class C10987a implements C6730a {

    /* renamed from: a */
    public static final C10987a f29717a = new C10987a();

    /* renamed from: b */
    private static String f29718b;

    private C10987a() {
    }

    /* renamed from: a */
    public final String mo16334a() {
        return C6399b.m19942r();
    }

    /* renamed from: b */
    public final int mo16335b() {
        return C6399b.m19935k();
    }

    /* renamed from: c */
    public final String mo16336c() {
        return C6399b.m19941q();
    }

    /* renamed from: d */
    public final Context mo16337d() {
        return C6399b.m19921a();
    }

    /* renamed from: e */
    public final int mo16338e() {
        return (int) C6399b.m19939o();
    }

    /* renamed from: g */
    public final int mo16340g() {
        return (int) C6399b.m19932h();
    }

    /* renamed from: i */
    public final String mo16342i() {
        return C6399b.m19934j();
    }

    /* renamed from: j */
    public final String mo16343j() {
        return C6399b.m19929e();
    }

    /* renamed from: k */
    public final int mo16344k() {
        return (int) C6399b.m19933i();
    }

    /* renamed from: f */
    public final String mo16339f() {
        if (C6399b.m19943s()) {
            return mo16342i();
        }
        return null;
    }

    /* renamed from: h */
    public final String mo16341h() {
        if (f29718b != null) {
            return f29718b;
        }
        try {
            Object systemService = C6399b.m19921a().getSystemService("phone");
            if (systemService != null) {
                f29718b = ((TelephonyManager) systemService).getDeviceId();
                if (f29718b == null) {
                    f29718b = "";
                }
                return f29718b;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception unused) {
        }
    }
}
