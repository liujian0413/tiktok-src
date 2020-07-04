package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.livesdkapi.depend.model.p445a.C9351f;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9351f.C9352a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.android.live.broadcast.preview.bv */
public final class C2904bv implements C9351f {

    /* renamed from: a */
    private ArrayList<C9352a> f9129a = new ArrayList<>();

    /* renamed from: a */
    public final void mo9650a() {
        m11387b();
    }

    /* renamed from: b */
    private void m11387b() {
        Iterator it = this.f9129a.iterator();
        while (it.hasNext()) {
            ((C9352a) it.next()).mo9570b();
        }
    }

    /* renamed from: b */
    public final void mo9652b(C9352a aVar) {
        this.f9129a.remove(aVar);
    }

    /* renamed from: a */
    public final void mo9651a(C9352a aVar) {
        if (!this.f9129a.contains(aVar)) {
            this.f9129a.add(aVar);
        }
    }
}
