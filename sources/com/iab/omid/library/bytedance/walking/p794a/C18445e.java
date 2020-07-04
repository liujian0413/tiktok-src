package com.iab.omid.library.bytedance.walking.p794a;

import com.iab.omid.library.bytedance.adsession.C18403g;
import com.iab.omid.library.bytedance.p789b.C18407a;
import com.iab.omid.library.bytedance.walking.p794a.C18440b.C18442b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance.walking.a.e */
public final class C18445e extends C18439a {
    public C18445e(C18442b bVar, HashSet<String> hashSet, JSONObject jSONObject, double d) {
        super(bVar, hashSet, jSONObject, d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f49995b.toString();
    }

    /* renamed from: b */
    private void m60732b(String str) {
        C18407a a = C18407a.m60593a();
        if (a != null) {
            for (C18403g gVar : a.mo47833b()) {
                if (this.f49994a.contains(gVar.mo47812e())) {
                    gVar.mo47811d().mo47870b(str, this.f49996c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void onPostExecute(String str) {
        m60732b(str);
        super.onPostExecute(str);
    }
}
