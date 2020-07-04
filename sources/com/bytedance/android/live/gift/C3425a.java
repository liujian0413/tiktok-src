package com.bytedance.android.live.gift;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.gift.a */
public final class C3425a {

    /* renamed from: a */
    private static C3425a f10248a;

    /* renamed from: b */
    private Map<GiftType, C3429b> f10249b = new HashMap();

    private C3425a() {
    }

    /* renamed from: a */
    public static C3425a m12724a() {
        if (f10248a == null) {
            f10248a = new C3425a();
        }
        return f10248a;
    }

    /* renamed from: b */
    public final void mo10391b() {
        for (C3429b a : this.f10249b.values()) {
            a.mo9340a();
        }
    }

    /* renamed from: a */
    public final C3429b mo10389a(GiftType giftType) {
        return (C3429b) this.f10249b.get(giftType);
    }

    /* renamed from: b */
    public final void mo10392b(GiftType giftType) {
        if (this.f10249b.containsKey(giftType)) {
            C3429b bVar = (C3429b) this.f10249b.get(giftType);
            if (bVar != null) {
                bVar.mo9340a();
            }
            this.f10249b.remove(giftType);
        }
    }

    /* renamed from: a */
    public final void mo10390a(GiftType giftType, C3429b bVar) throws Exception {
        if (!this.f10249b.containsKey(giftType)) {
            this.f10249b.put(giftType, bVar);
            return;
        }
        StringBuilder sb = new StringBuilder("GiftType ");
        sb.append(giftType.toString());
        sb.append(" already has been set, or you should call release firstly.");
        throw new Exception(sb.toString());
    }
}
