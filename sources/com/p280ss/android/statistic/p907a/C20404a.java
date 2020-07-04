package com.p280ss.android.statistic.p907a;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.statistic.C20403a;
import com.p280ss.android.statistic.C20408b;
import com.p280ss.android.statistic.Configuration;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.statistic.a.a */
public final class C20404a extends C20406c {
    /* renamed from: a */
    public final String mo54943a() {
        return C20403a.f55116d;
    }

    /* renamed from: a */
    public final void mo54944a(Context context, Configuration configuration) {
        C20405b.m67718a(this, context, configuration);
    }

    /* renamed from: a */
    public final void mo54945a(C20408b bVar) {
        String str;
        long j;
        JSONObject jSONObject;
        String str2 = bVar.f55137a;
        Map<String, Object> map = bVar.f55139c;
        if (!TextUtils.isEmpty(str2)) {
            if (!bVar.mo54948b()) {
                if (bVar.mo54949c()) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (map != null) {
                        try {
                            for (Entry entry : map.entrySet()) {
                                if (entry != null && (entry.getValue() instanceof String) && (entry.getKey() instanceof String)) {
                                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    C6759a.m20910a(bVar.f55137a, jSONObject2);
                }
            } else if (map == null) {
                AppLog.onEvent(null, str2);
            } else {
                String str3 = (String) map.get(C20403a.f55131s);
                Object obj = map.get(C20403a.f55128p);
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                Object obj2 = map.get(C20403a.f55132t);
                long j2 = 0;
                if (obj2 instanceof Long) {
                    j = ((Long) obj2).longValue();
                } else {
                    j = 0;
                }
                Object obj3 = map.get(C20403a.f55133u);
                if (obj3 instanceof Long) {
                    j2 = ((Long) obj3).longValue();
                }
                Object obj4 = map.get(C20403a.f55134v);
                if (obj4 instanceof JSONObject) {
                    jSONObject = (JSONObject) obj4;
                } else {
                    jSONObject = null;
                }
                AppLog.onEvent((Context) null, str3, str2, str, j, j2, jSONObject);
            }
        }
    }
}
