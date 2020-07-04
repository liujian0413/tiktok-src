package com.p280ss.android.newmedia.p300c;

import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.util.NetworkUtils.C6763b;
import com.p280ss.android.http.legacy.p296a.C19565e;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.newmedia.c.a */
public final class C6837a implements C6763b {

    /* renamed from: a */
    private boolean f19464a;

    /* renamed from: b */
    private final Object f19465b = new Object();

    /* renamed from: a */
    public final void mo16553a() {
        if (!"ActionReaper".equals(Thread.currentThread().getName())) {
            synchronized (this.f19465b) {
                if (!this.f19464a) {
                    try {
                        Thread.sleep(1500);
                    } catch (Exception unused) {
                    }
                    this.f19464a = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo16552a(String str, boolean z) {
        return AppLog.addCommonParams(str, z);
    }

    /* renamed from: a */
    public final void mo16554a(List<C19565e> list, boolean z) {
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, z);
        for (Entry entry : hashMap.entrySet()) {
            list.add(new C19565e((String) entry.getKey(), (String) entry.getValue()));
        }
    }
}
