package com.iab.omid.library.bytedance.walking;

import com.iab.omid.library.bytedance.walking.p794a.C18440b.C18442b;
import com.iab.omid.library.bytedance.walking.p794a.C18443c;
import com.iab.omid.library.bytedance.walking.p794a.C18444d;
import com.iab.omid.library.bytedance.walking.p794a.C18445e;
import com.iab.omid.library.bytedance.walking.p794a.C18446f;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance.walking.d */
public final class C18449d implements C18442b {

    /* renamed from: a */
    private JSONObject f50013a;

    /* renamed from: b */
    private final C18443c f50014b;

    public C18449d(C18443c cVar) {
        this.f50014b = cVar;
    }

    /* renamed from: a */
    public final JSONObject mo47885a() {
        return this.f50013a;
    }

    /* renamed from: a */
    public final void mo47886a(JSONObject jSONObject) {
        this.f50013a = jSONObject;
    }

    /* renamed from: a */
    public final void mo47897a(JSONObject jSONObject, HashSet<String> hashSet, double d) {
        C18443c cVar = this.f50014b;
        C18446f fVar = new C18446f(this, hashSet, jSONObject, d);
        cVar.mo47887b(fVar);
    }

    /* renamed from: b */
    public final void mo47898b() {
        this.f50014b.mo47887b(new C18444d(this));
    }

    /* renamed from: b */
    public final void mo47899b(JSONObject jSONObject, HashSet<String> hashSet, double d) {
        C18443c cVar = this.f50014b;
        C18445e eVar = new C18445e(this, hashSet, jSONObject, d);
        cVar.mo47887b(eVar);
    }
}
