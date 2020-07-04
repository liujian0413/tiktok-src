package com.p280ss.android.ugc.aweme.hybrid.monitor.utils;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.utils.g */
public final class C30411g {

    /* renamed from: a */
    public static final C30412a f79920a = new C30412a(null);

    /* renamed from: b */
    private final List<C30406b> f79921b;

    /* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.utils.g$a */
    public static final class C30412a {
        private C30412a() {
        }

        public /* synthetic */ C30412a(C7571f fVar) {
            this();
        }
    }

    public C30411g(List<C30406b> list) {
        C7573i.m23587b(list, "timingInfoList");
        this.f79921b = list;
    }

    /* renamed from: a */
    public final C30407c mo80038a(String str, JSONObject jSONObject) {
        C7573i.m23587b(str, "curTrigger");
        C7573i.m23587b(jSONObject, "metrics");
        Iterator it = this.f79921b.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (TextUtils.equals(((C30406b) it.next()).f79907b, str)) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() == -1) {
            z = true;
        }
        if (z) {
            valueOf = null;
        }
        if (valueOf != null) {
            C30406b bVar = (C30406b) this.f79921b.get(valueOf.intValue());
            long optLong = jSONObject.optLong(str) - jSONObject.optLong(bVar.f79906a);
            if (optLong > 0) {
                return new C30407c(bVar.f79908c, optLong);
            }
        }
        return null;
    }
}
