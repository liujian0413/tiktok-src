package com.p280ss.android.ugc.bogut.library.p1721a;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.bogut.library.a.a */
public class C43668a<View> {

    /* renamed from: a */
    public View f113020a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C43669a> f113021b = new CopyOnWriteArrayList<>();

    /* renamed from: com.ss.android.ugc.bogut.library.a.a$a */
    public interface C43669a {
        /* renamed from: a */
        void mo105635a();
    }

    /* renamed from: b */
    public final void mo105634b() {
        this.f113020a = null;
    }

    /* renamed from: a */
    public final void mo105631a() {
        Iterator it = this.f113021b.iterator();
        while (it.hasNext()) {
            ((C43669a) it.next()).mo105635a();
        }
    }

    /* renamed from: a */
    public final void mo105633a(View view) {
        this.f113020a = view;
    }

    /* renamed from: a */
    public final void mo105632a(C43669a aVar) {
        this.f113021b.add(aVar);
    }
}
