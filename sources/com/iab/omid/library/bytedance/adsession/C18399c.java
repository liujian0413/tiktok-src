package com.iab.omid.library.bytedance.adsession;

import com.iab.omid.library.bytedance.p791d.C18423b;
import com.iab.omid.library.bytedance.p791d.C18426d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance.adsession.c */
public final class C18399c {

    /* renamed from: a */
    private final Owner f49909a;

    /* renamed from: b */
    private final Owner f49910b;

    /* renamed from: c */
    private final boolean f49911c;

    private C18399c(Owner owner, Owner owner2, boolean z) {
        this.f49909a = owner;
        if (owner2 == null) {
            this.f49910b = Owner.NONE;
        } else {
            this.f49910b = owner2;
        }
        this.f49911c = z;
    }

    /* renamed from: a */
    public static C18399c m60551a(Owner owner, Owner owner2, boolean z) {
        C18426d.m60669a((Object) owner, "Impression owner is null");
        C18426d.m60667a(owner);
        return new C18399c(owner, owner2, false);
    }

    /* renamed from: a */
    public final boolean mo47806a() {
        return Owner.NATIVE == this.f49909a;
    }

    /* renamed from: b */
    public final boolean mo47807b() {
        return Owner.NATIVE == this.f49910b;
    }

    /* renamed from: c */
    public final JSONObject mo47808c() {
        JSONObject jSONObject = new JSONObject();
        C18423b.m60655a(jSONObject, "impressionOwner", this.f49909a);
        C18423b.m60655a(jSONObject, "videoEventsOwner", this.f49910b);
        C18423b.m60655a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f49911c));
        return jSONObject;
    }
}
