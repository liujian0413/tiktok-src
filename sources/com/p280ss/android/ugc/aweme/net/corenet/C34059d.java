package com.p280ss.android.ugc.aweme.net.corenet;

import android.os.SystemClock;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10144b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ttnet.p671c.C12955b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.corenet.d */
public final class C34059d implements C10144b<C12955b> {
    /* renamed from: a */
    public final String mo24805a(String str, boolean z, Object... objArr) {
        return str;
    }

    /* renamed from: a */
    public final void mo24806a() {
        if (!C30538p.m99745a()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            String c = C6776h.m20949c(C6399b.m19921a());
            if (TextUtils.isEmpty(c) || !c.contains("miniapp")) {
                AppLog.tryWaitDeviceInit();
            }
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 > 1000) {
                C1592h.m7853a((Callable<TResult>) new C34060e<TResult>(uptimeMillis2));
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m109665a(long j) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
        } catch (JSONException unused) {
        }
        C6759a.m20910a("api_stuck", jSONObject);
        return null;
    }

    /* renamed from: a */
    public final String mo24804a(String str, boolean z) {
        if (str == null || (!str.contains("/get_domains/") && !str.contains("/ttnet_crash/"))) {
            return str;
        }
        return AppLog.addCommonParams(str, z);
    }
}
