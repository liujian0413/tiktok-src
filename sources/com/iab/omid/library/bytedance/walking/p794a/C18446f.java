package com.iab.omid.library.bytedance.walking.p794a;

import android.text.TextUtils;
import com.iab.omid.library.bytedance.adsession.C18403g;
import com.iab.omid.library.bytedance.p789b.C18407a;
import com.iab.omid.library.bytedance.p791d.C18423b;
import com.iab.omid.library.bytedance.walking.p794a.C18440b.C18442b;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance.walking.a.f */
public final class C18446f extends C18439a {
    public C18446f(C18442b bVar, HashSet<String> hashSet, JSONObject jSONObject, double d) {
        super(bVar, hashSet, jSONObject, d);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (C18423b.m60660b(this.f49995b, this.f49998e.mo47885a())) {
            return null;
        }
        this.f49998e.mo47886a(this.f49995b);
        return this.f49995b.toString();
    }

    /* renamed from: b */
    private void m60735b(String str) {
        C18407a a = C18407a.m60593a();
        if (a != null) {
            for (C18403g gVar : a.mo47833b()) {
                if (this.f49994a.contains(gVar.mo47812e())) {
                    gVar.mo47811d().mo47866a(str, this.f49996c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            m60735b(str);
        }
        super.onPostExecute(str);
    }
}
