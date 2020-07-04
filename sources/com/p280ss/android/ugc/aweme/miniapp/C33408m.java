package com.p280ss.android.ugc.aweme.miniapp;

import android.content.Context;
import com.bytedance.crash.C9895f;
import com.bytedance.crash.p504l.C9972a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.AppLog.ILogSessionHook;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.deviceregister.p289a.C6778a;
import com.p280ss.android.deviceregister.p289a.C6781d;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp.m */
public final class C33408m implements C9895f {

    /* renamed from: a */
    public String f87252a;

    /* renamed from: b */
    private Context f87253b;

    /* renamed from: c */
    private Map<String, String> f87254c = new HashMap();

    /* renamed from: d */
    public final String mo24481d() {
        return this.f87252a;
    }

    /* renamed from: f */
    private void m108047f() {
        AppLog.addSessionHook(new ILogSessionHook() {
            public final void onLogSessionStart(long j) {
            }

            public final void onLogSessionTerminate(long j, String str, JSONObject jSONObject) {
            }

            public final void onLogSessionBatchEvent(long j, String str, JSONObject jSONObject) {
                C33408m.this.f87252a = str;
            }
        });
    }

    /* renamed from: c */
    public final long mo24480c() {
        try {
            return Long.parseLong(AppLog.getUserId());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: e */
    private String m108046e() {
        return C7285c.m22838a(this.f87253b, C6778a.m20960a(), 0).getString("device_id", "");
    }

    /* renamed from: b */
    public final String mo24479b() {
        if (C9972a.m29506b(this.f87253b)) {
            return TeaAgent.getServerDeviceId();
        }
        return m108046e();
    }

    /* renamed from: a */
    public final Map<String, Object> mo24478a() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        NetUtil.putCommonParams(hashMap2, true);
        hashMap.putAll(hashMap2);
        hashMap.putAll(this.f87254c);
        if (!hashMap.containsKey("channel")) {
            hashMap.put("channel", C6781d.m20990f());
        }
        if (!hashMap.containsKey("release_build")) {
            hashMap.put("release_build", C6781d.m20984c());
        }
        return hashMap;
    }

    public C33408m(Context context) {
        this.f87253b = context;
        m108047f();
    }
}
