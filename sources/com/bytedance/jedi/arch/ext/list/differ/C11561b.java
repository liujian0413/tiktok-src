package com.bytedance.jedi.arch.ext.list.differ;

import android.support.p029v7.util.AdapterListUpdateCallback;
import android.support.p029v7.util.C1143a;
import android.support.p029v7.util.C1143a.C1146b;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.util.C1151b;
import android.support.p029v7.widget.RecyclerView.C1262a;
import com.bytedance.jedi.arch.ext.list.differ.C11564c.C11565a;
import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.bytedance.jedi.arch.ext.list.differ.b */
public final class C11561b<T> {

    /* renamed from: a */
    public final Executor f31221a;

    /* renamed from: b */
    public int f31222b;

    /* renamed from: c */
    public List<? extends T> f31223c;

    /* renamed from: d */
    public final C11564c<T> f31224d;

    /* renamed from: e */
    private final C1151b f31225e;

    /* renamed from: f */
    private final C11567e f31226f;

    /* renamed from: com.bytedance.jedi.arch.ext.list.differ.b$a */
    static final class C11562a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11561b f31227a;

        /* renamed from: b */
        final /* synthetic */ List f31228b;

        /* renamed from: c */
        final /* synthetic */ List f31229c;

        /* renamed from: d */
        final /* synthetic */ int f31230d;

        /* renamed from: e */
        final /* synthetic */ C7561a f31231e;

        C11562a(C11561b bVar, List list, List list2, int i, C7561a aVar) {
            this.f31227a = bVar;
            this.f31228b = list;
            this.f31229c = list2;
            this.f31230d = i;
            this.f31231e = aVar;
        }

        public final void run() {
            final C1146b a = C1143a.m5066a(new JediAsyncListDiffer$submitList$1$result$1(this));
            C7573i.m23582a((Object) a, "DiffUtil.calculateDiff(o…                       })");
            this.f31227a.f31221a.execute(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C11562a f31232a;

                {
                    this.f31232a = r1;
                }

                public final void run() {
                    if (this.f31232a.f31227a.f31222b == this.f31232a.f31230d) {
                        this.f31232a.f31227a.mo29145a(this.f31232a.f31229c, a, this.f31232a.f31231e);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final int mo29143a() {
        return this.f31223c.size();
    }

    /* renamed from: a */
    public final T mo29144a(int i, boolean z) {
        List<? extends T> list = this.f31223c;
        if (i >= list.size() || i < 0) {
            return null;
        }
        if (z) {
            C11567e eVar = this.f31226f;
            if (eVar != null) {
                eVar.mo29151a(i);
            }
        }
        return list.get(i);
    }

    /* renamed from: a */
    public final void mo29146a(List<? extends T> list, C7561a<C7581n> aVar) {
        C7573i.m23587b(list, "newList");
        this.f31222b++;
        int i = this.f31222b;
        List<? extends T> list2 = this.f31223c;
        if (list != list2) {
            if (list.isEmpty()) {
                int size = list2.size();
                this.f31223c = C7525m.m23461a();
                this.f31225e.mo255b(0, size);
                if (aVar != null) {
                    aVar.invoke();
                }
            } else if (list2.isEmpty()) {
                this.f31223c = list;
                this.f31225e.mo253a(0, list.size());
                if (aVar != null) {
                    aVar.invoke();
                }
            } else {
                Executor executor = this.f31224d.f31234a;
                C11562a aVar2 = new C11562a(this, list2, list, i, aVar);
                executor.execute(aVar2);
            }
        }
    }

    public C11561b(C1151b bVar, C11564c<T> cVar, C11567e eVar) {
        C7573i.m23587b(bVar, "mUpdateCallback");
        C7573i.m23587b(cVar, "mConfig");
        this.f31225e = bVar;
        this.f31224d = cVar;
        this.f31226f = eVar;
        Executor executor = this.f31224d.f31236c;
        if (executor == null) {
            executor = new C11571g();
        }
        this.f31221a = executor;
        this.f31223c = C7525m.m23461a();
    }

    /* renamed from: a */
    public final void mo29145a(List<? extends T> list, C1146b bVar, C7561a<C7581n> aVar) {
        this.f31223c = list;
        bVar.mo4547a(this.f31225e);
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public C11561b(C1262a<?> aVar, C1147c<T> cVar, C11569b bVar) {
        C7573i.m23587b(aVar, "adapter");
        C7573i.m23587b(cVar, "diffCallback");
        C1151b adapterListUpdateCallback = new AdapterListUpdateCallback(aVar);
        C11564c a = new C11565a(cVar).mo29150a();
        C11567e eVar = null;
        if (bVar != null) {
            eVar = C11570f.m34039a(bVar, true, 10);
        }
        this(adapterListUpdateCallback, a, eVar);
    }

    public /* synthetic */ C11561b(C1262a aVar, C1147c cVar, C11569b bVar, int i, C7571f fVar) {
        this(aVar, cVar, (C11569b) null);
    }
}
