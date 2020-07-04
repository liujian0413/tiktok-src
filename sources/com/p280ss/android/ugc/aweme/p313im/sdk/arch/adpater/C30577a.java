package com.p280ss.android.ugc.aweme.p313im.sdk.arch.adpater;

import android.os.Handler;
import android.os.Looper;
import android.support.p029v7.util.C1143a;
import android.support.p029v7.util.C1143a.C1146b;
import android.support.p029v7.util.C1151b;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.a */
public final class C30577a<T> {

    /* renamed from: a */
    public final Executor f80293a;

    /* renamed from: b */
    public int f80294b;

    /* renamed from: c */
    public final C30583c<T> f80295c;

    /* renamed from: d */
    private List<? extends T> f80296d;

    /* renamed from: e */
    private final ExtendedListUpdateCallback f80297e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.a$a */
    public static final class C30578a implements Executor {

        /* renamed from: a */
        private final Handler f80298a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f80298a.post(runnable);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.a$b */
    static final class C30579b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C30577a f80299a;

        /* renamed from: b */
        final /* synthetic */ List f80300b;

        /* renamed from: c */
        final /* synthetic */ List f80301c;

        /* renamed from: d */
        final /* synthetic */ int f80302d;

        /* renamed from: e */
        final /* synthetic */ C7561a f80303e;

        C30579b(C30577a aVar, List list, List list2, int i, C7561a aVar2) {
            this.f80299a = aVar;
            this.f80300b = list;
            this.f80301c = list2;
            this.f80302d = i;
            this.f80303e = aVar2;
        }

        public final void run() {
            final C1146b a = C1143a.m5066a(new AsyncListDiffer$submitList$1$result$1(this));
            C7573i.m23582a((Object) a, "DiffUtil.calculateDiff(o…                       })");
            this.f80299a.f80293a.execute(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C30579b f80304a;

                {
                    this.f80304a = r1;
                }

                public final void run() {
                    if (this.f80304a.f80299a.f80294b == this.f80304a.f80302d) {
                        this.f80304a.f80299a.mo80352a(this.f80304a.f80301c, a);
                    }
                    C7561a aVar = this.f80304a.f80303e;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final int mo80349a() {
        List<? extends T> list = this.f80296d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo80351a(List<? extends T> list) {
        this.f80296d = list;
        this.f80297e.mo80348a();
    }

    /* renamed from: a */
    public final T mo80350a(int i) {
        List<? extends T> list = this.f80296d;
        if (list != null && i < list.size() && i >= 0) {
            return list.get(i);
        }
        return null;
    }

    public C30577a(ExtendedListUpdateCallback extendedListUpdateCallback, C30583c<T> cVar) {
        C7573i.m23587b(extendedListUpdateCallback, "mUpdateCallback");
        C7573i.m23587b(cVar, "mConfig");
        this.f80297e = extendedListUpdateCallback;
        this.f80295c = cVar;
        Executor executor = this.f80295c.f80308c;
        if (executor == null) {
            executor = new C30578a();
        }
        this.f80293a = executor;
    }

    /* renamed from: a */
    public final void mo80352a(List<? extends T> list, C1146b bVar) {
        this.f80296d = list;
        bVar.mo4547a((C1151b) this.f80297e);
    }

    /* renamed from: a */
    public final void mo80353a(List<? extends T> list, C7561a<C7581n> aVar) {
        this.f80294b++;
        int i = this.f80294b;
        List<? extends T> list2 = this.f80296d;
        if (list != list2) {
            if (list == null) {
                if (list2 == null) {
                    C7573i.m23580a();
                }
                int size = list2.size();
                this.f80296d = null;
                this.f80297e.mo255b(0, size);
            } else if (list2 == null) {
                this.f80296d = list;
                this.f80297e.mo253a(0, list.size());
            } else {
                Executor executor = this.f80295c.f80307b;
                C30579b bVar = new C30579b(this, list2, list, i, aVar);
                executor.execute(bVar);
            }
        }
    }
}
