package com.p280ss.android.ugc.aweme.requesttask.idle;

import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.k */
public final class C37252k {

    /* renamed from: a */
    public final String f97368a;

    /* renamed from: b */
    public final boolean f97369b;

    /* renamed from: a */
    public final void mo93872a() {
        try {
            String str = this.f97368a;
            StringBuilder sb = new StringBuilder("活动被系统回收 or config change:");
            sb.append(this.f97369b);
            C6921a.m21552a(4, str, sb.toString());
            boolean z = this.f97369b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("activity", this.f97368a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f97369b);
            jSONObject.put("activity_status", sb2.toString());
            C6893q.m21444a("activity_monitor", z ? 1 : 0, jSONObject);
        } catch (Throwable th) {
            C6921a.m21559a(th);
        }
    }

    public C37252k(String str, boolean z) {
        C7573i.m23587b(str, "tag");
        this.f97368a = str;
        this.f97369b = z;
    }
}
