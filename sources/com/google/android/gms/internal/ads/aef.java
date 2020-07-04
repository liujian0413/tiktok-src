package com.google.android.gms.internal.ads;

import java.util.Map;

final class aef extends C16091uo {

    /* renamed from: g */
    private final /* synthetic */ byte[] f40095g;

    /* renamed from: h */
    private final /* synthetic */ Map f40096h;

    /* renamed from: i */
    private final /* synthetic */ afg f40097i;

    aef(aea aea, int i, String str, byb byb, bxd bxd, byte[] bArr, Map map, afg afg) {
        this.f40095g = bArr;
        this.f40096h = map;
        this.f40097i = afg;
        super(i, str, byb, bxd);
    }

    /* renamed from: a */
    public final byte[] mo39254a() throws zza {
        return this.f40095g == null ? super.mo39254a() : this.f40095g;
    }

    /* renamed from: b */
    public final Map<String, String> mo39255b() throws zza {
        return this.f40096h == null ? super.mo39255b() : this.f40096h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39253a(String str) {
        this.f40097i.mo39277a(str);
        super.mo39252a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo39252a(Object obj) {
        mo39252a((String) obj);
    }
}
