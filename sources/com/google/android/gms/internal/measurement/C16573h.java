package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C14931j;
import com.google.android.gms.common.internal.C15267r;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.measurement.h */
public final class C16573h extends C14931j<C16573h> {

    /* renamed from: a */
    public String f46382a;

    /* renamed from: b */
    public int f46383b;

    /* renamed from: c */
    public String f46384c;

    /* renamed from: d */
    private int f46385d;

    /* renamed from: e */
    private String f46386e;

    /* renamed from: f */
    private boolean f46387f;

    /* renamed from: g */
    private boolean f46388g;

    public C16573h() {
        this(false);
    }

    private C16573h(boolean z) {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0) {
            leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L);
            if (leastSignificantBits == 0) {
                leastSignificantBits = Integer.MAX_VALUE;
            }
        }
        this(false, leastSignificantBits);
    }

    private C16573h(boolean z, int i) {
        C15267r.m44383a(i);
        this.f46383b = i;
        this.f46388g = false;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", this.f46382a);
        hashMap.put("interstitial", Boolean.valueOf(this.f46387f));
        hashMap.put("automatic", Boolean.valueOf(this.f46388g));
        hashMap.put("screenId", Integer.valueOf(this.f46383b));
        hashMap.put("referrerScreenId", Integer.valueOf(this.f46385d));
        hashMap.put("referrerScreenName", this.f46386e);
        hashMap.put("referrerUri", this.f46384c);
        return m43370a((Object) hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37998a(C14931j jVar) {
        C16573h hVar = (C16573h) jVar;
        if (!TextUtils.isEmpty(this.f46382a)) {
            hVar.f46382a = this.f46382a;
        }
        if (this.f46383b != 0) {
            hVar.f46383b = this.f46383b;
        }
        if (this.f46385d != 0) {
            hVar.f46385d = this.f46385d;
        }
        if (!TextUtils.isEmpty(this.f46386e)) {
            hVar.f46386e = this.f46386e;
        }
        if (!TextUtils.isEmpty(this.f46384c)) {
            String str = this.f46384c;
            if (TextUtils.isEmpty(str)) {
                hVar.f46384c = null;
            } else {
                hVar.f46384c = str;
            }
        }
        if (this.f46387f) {
            hVar.f46387f = this.f46387f;
        }
        if (this.f46388g) {
            hVar.f46388g = this.f46388g;
        }
    }
}
