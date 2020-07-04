package com.google.android.gms.internal.ads;

import java.util.Map;

public final class aei extends bqk<bor> {

    /* renamed from: g */
    private final agu<bor> f40098g;

    /* renamed from: h */
    private final Map<String, String> f40099h;

    /* renamed from: i */
    private final afg f40100i;

    public aei(String str, agu<bor> agu) {
        this(str, null, agu);
    }

    private aei(String str, Map<String, String> map, agu<bor> agu) {
        super(0, str, new aej(agu));
        this.f40099h = null;
        this.f40098g = agu;
        this.f40100i = new afg();
        this.f40100i.mo39278a(str, "GET", null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bwf<bor> mo39257a(bor bor) {
        return bwf.m50203a(bor, C15904nq.m51392a(bor));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo39252a(Object obj) {
        bor bor = (bor) obj;
        this.f40100i.mo39281a(bor.f43050c, bor.f43048a);
        afg afg = this.f40100i;
        byte[] bArr = bor.f43049b;
        if (afg.m45762c() && bArr != null) {
            afg.mo39282a(bArr);
        }
        this.f40098g.mo39333b(bor);
    }
}
