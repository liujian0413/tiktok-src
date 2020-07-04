package com.bytedance.android.p089a.p099b.p101b.p102a;

import com.bytedance.android.p089a.p099b.C2236a;
import com.bytedance.android.p089a.p099b.p101b.C2249c;
import com.bytedance.android.p089a.p099b.p101b.C2251d;
import com.bytedance.android.p089a.p099b.p101b.p102a.C2242a.C2243a;
import com.bytedance.android.p089a.p099b.p101b.p102a.C2244b.C2245a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.a.b.b.a.c */
public final class C2246c implements C2245a {

    /* renamed from: a */
    private List<C2244b> f7501a;

    /* renamed from: a */
    public final C2249c mo7981a() {
        throw new UnsupportedOperationException("do not call");
    }

    /* renamed from: a */
    private static List<C2244b> m9650a(C2236a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2247d(aVar));
        return arrayList;
    }

    /* renamed from: a */
    public final C2251d mo7982a(C2249c cVar) {
        return new C2243a(this.f7501a, 0).mo7982a(cVar);
    }

    /* renamed from: a */
    public final void mo7983a(List<C2244b> list) {
        this.f7501a.addAll(this.f7501a.size() - 1, list);
    }

    public C2246c(C2236a aVar, C2242a aVar2) {
        this.f7501a = m9650a(aVar);
        this.f7501a.add(aVar2);
    }
}
