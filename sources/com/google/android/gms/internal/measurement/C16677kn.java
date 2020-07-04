package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C14931j;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.kn */
public final class C16677kn extends C14931j<C16677kn> {

    /* renamed from: a */
    public String f46580a;

    /* renamed from: b */
    public String f46581b;

    /* renamed from: c */
    public String f46582c;

    /* renamed from: d */
    public String f46583d;

    /* renamed from: e */
    public String f46584e;

    /* renamed from: f */
    public String f46585f;

    /* renamed from: g */
    public String f46586g;

    /* renamed from: h */
    public String f46587h;

    /* renamed from: i */
    public String f46588i;

    /* renamed from: j */
    public String f46589j;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.f46580a);
        hashMap.put("source", this.f46581b);
        hashMap.put("medium", this.f46582c);
        hashMap.put(POIService.KEY_KEYWORD, this.f46583d);
        hashMap.put(C38347c.f99553h, this.f46584e);
        hashMap.put("id", this.f46585f);
        hashMap.put("adNetworkId", this.f46586g);
        hashMap.put("gclid", this.f46587h);
        hashMap.put("dclid", this.f46588i);
        hashMap.put("aclid", this.f46589j);
        return m43370a((Object) hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37998a(C14931j jVar) {
        C16677kn knVar = (C16677kn) jVar;
        if (!TextUtils.isEmpty(this.f46580a)) {
            knVar.f46580a = this.f46580a;
        }
        if (!TextUtils.isEmpty(this.f46581b)) {
            knVar.f46581b = this.f46581b;
        }
        if (!TextUtils.isEmpty(this.f46582c)) {
            knVar.f46582c = this.f46582c;
        }
        if (!TextUtils.isEmpty(this.f46583d)) {
            knVar.f46583d = this.f46583d;
        }
        if (!TextUtils.isEmpty(this.f46584e)) {
            knVar.f46584e = this.f46584e;
        }
        if (!TextUtils.isEmpty(this.f46585f)) {
            knVar.f46585f = this.f46585f;
        }
        if (!TextUtils.isEmpty(this.f46586g)) {
            knVar.f46586g = this.f46586g;
        }
        if (!TextUtils.isEmpty(this.f46587h)) {
            knVar.f46587h = this.f46587h;
        }
        if (!TextUtils.isEmpty(this.f46588i)) {
            knVar.f46588i = this.f46588i;
        }
        if (!TextUtils.isEmpty(this.f46589j)) {
            knVar.f46589j = this.f46589j;
        }
    }
}
