package com.bytedance.android.p089a.p090a;

import android.content.Context;
import android.view.View;
import com.bytedance.android.p089a.p090a.p091a.C2207a;
import com.bytedance.android.p089a.p090a.p092b.C2212a;
import com.bytedance.android.p089a.p090a.p092b.C2213b;
import com.bytedance.android.p089a.p090a.p095e.C2221a;
import com.bytedance.android.p089a.p090a.p095e.C2222b;
import com.bytedance.android.p089a.p090a.p096f.C2223a;
import com.bytedance.android.p089a.p090a.p097g.C2227a;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.d */
public final class C2219d extends C2214c {

    /* renamed from: h */
    private static volatile C2219d f7455h;

    /* renamed from: a */
    public boolean f7456a;

    /* renamed from: b */
    public Context f7457b;

    /* renamed from: c */
    public C2223a f7458c;

    /* renamed from: d */
    public C2206a f7459d = new C2206a();

    /* renamed from: e */
    public C2208b f7460e = new C2208b();

    /* renamed from: f */
    public C2212a f7461f;

    /* renamed from: g */
    public C2207a f7462g;

    /* renamed from: b */
    public final boolean mo7951b() {
        return this.f7456a;
    }

    /* renamed from: d */
    public final boolean mo7958d() {
        if (!this.f7456a || !this.f7458c.f7486f) {
            return false;
        }
        return true;
    }

    private C2219d() {
    }

    /* renamed from: c */
    public static C2219d m9560c() {
        if (f7455h == null) {
            synchronized (C2219d.class) {
                if (f7455h == null) {
                    f7455h = new C2219d();
                }
            }
        }
        return f7455h;
    }

    /* renamed from: a */
    public final void mo7948a(C2207a aVar) {
        this.f7462g = aVar;
    }

    /* renamed from: a */
    public final void mo7949a(C2223a aVar) {
        if (mo7951b()) {
            this.f7458c = aVar;
            this.f7460e.mo7936a();
        }
    }

    /* renamed from: a */
    public final void mo7950a(C2227a aVar) {
        if (mo7951b()) {
            this.f7460e.mo7938a(aVar);
        }
    }

    /* renamed from: a */
    private void m9559a(View view, C2221a aVar) {
        this.f7460e.mo7937a(view, aVar);
    }

    /* renamed from: a */
    public final void mo7947a(Context context, C2223a aVar) {
        if (!this.f7456a && context != null && aVar != null) {
            this.f7457b = context.getApplicationContext();
            this.f7461f = new C2213b(context, "byte_ad_tracker_preferences");
            this.f7458c = aVar;
            this.f7456a = true;
        }
    }

    /* renamed from: b */
    public final void mo7955b(View view, long j, List<String> list, boolean z, long j2, String str, JSONObject jSONObject) {
        if (mo7951b()) {
            m9558a(null, j, list, 2, false, -1, str, null);
        }
    }

    /* renamed from: d */
    public final void mo7957d(View view, long j, List<String> list, boolean z, long j2, String str, JSONObject jSONObject) {
        if (mo7951b()) {
            m9558a(null, j, list, 4, false, -1, str, null);
        }
    }

    /* renamed from: e */
    public final void mo7959e(View view, long j, List<String> list, boolean z, long j2, String str, JSONObject jSONObject) {
        if (mo7951b()) {
            m9558a(null, j, list, 5, false, -1, str, null);
        }
    }

    /* renamed from: c */
    public final void mo7956c(View view, long j, List<String> list, boolean z, long j2, String str, JSONObject jSONObject) {
        if (mo7951b()) {
            m9558a(null, j, list, 1, false, -1, str, null);
        }
    }

    /* renamed from: a */
    public final void mo7954a(View view, long j, List<String> list, boolean z, long j2, String str, JSONObject jSONObject) {
        if (mo7951b()) {
            m9558a(null, j, list, 0, false, -1, str, null);
        }
    }

    /* renamed from: a */
    private void m9558a(View view, long j, List<String> list, int i, boolean z, long j2, String str, JSONObject jSONObject) {
        C2222b bVar = new C2222b(j, list, i, z, j2, str, jSONObject);
        View view2 = view;
        m9559a(view, (C2221a) bVar);
    }
}
