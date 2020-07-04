package com.p280ss.android.ugc.aweme.sdk.iap.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.utils.b */
public final class C37370b {

    /* renamed from: a */
    Map<String, C37372d> f97594a = new HashMap();

    /* renamed from: b */
    Map<String, Purchase> f97595b = new HashMap();

    C37370b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo94042a(C37372d dVar) {
        this.f97594a.put(dVar.f97596a, dVar);
    }

    /* renamed from: a */
    public final C37372d mo94040a(String str) {
        return (C37372d) this.f97594a.get(str);
    }

    /* renamed from: b */
    public final Purchase mo94043b(String str) {
        return (Purchase) this.f97595b.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo94041a(Purchase purchase) {
        this.f97595b.put(purchase.getSku(), purchase);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final List<String> mo94044c(String str) {
        ArrayList arrayList = new ArrayList();
        for (Purchase purchase : this.f97595b.values()) {
            if (purchase.getItemType().equals(str)) {
                arrayList.add(purchase.getSku());
            }
        }
        return arrayList;
    }
}
