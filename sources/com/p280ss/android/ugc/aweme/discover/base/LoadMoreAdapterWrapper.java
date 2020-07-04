package com.p280ss.android.ugc.aweme.discover.base;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.discover.base.C26599e.C26600a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.base.LoadMoreAdapterWrapper */
public final class LoadMoreAdapterWrapper extends HeaderAndFooterWrapper {

    /* renamed from: d */
    public static final C26586a f70123d = new C26586a(null);

    /* renamed from: c */
    public C26587b f70124c = new C26590a();

    /* renamed from: e */
    private int f70125e = -1;

    /* renamed from: f */
    private C26588c f70126f;

    /* renamed from: g */
    private C26599e f70127g = new C26599e();

    /* renamed from: h */
    private boolean f70128h;

    /* renamed from: i */
    private View f70129i;

    /* renamed from: com.ss.android.ugc.aweme.discover.base.LoadMoreAdapterWrapper$a */
    public static final class C26586a {
        private C26586a() {
        }

        public /* synthetic */ C26586a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.base.LoadMoreAdapterWrapper$b */
    public static abstract class C26587b {
        /* renamed from: a */
        public abstract View mo68267a(ViewGroup viewGroup, LoadMoreAdapterWrapper loadMoreAdapterWrapper);

        /* renamed from: a */
        public abstract void mo68268a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.base.LoadMoreAdapterWrapper$c */
    public interface C26588c {
        /* renamed from: a */
        void mo68269a();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.base.LoadMoreAdapterWrapper$d */
    static final class C26589d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LoadMoreAdapterWrapper f70131a;

        /* renamed from: b */
        final /* synthetic */ int f70132b;

        C26589d(LoadMoreAdapterWrapper loadMoreAdapterWrapper, int i) {
            this.f70131a = loadMoreAdapterWrapper;
            this.f70132b = i;
        }

        public final void run() {
            this.f70131a.f70124c.mo68268a(this.f70132b);
        }
    }

    /* renamed from: c */
    public final void mo68264c() {
        m87351c(1);
        mo68265d();
    }

    /* renamed from: d */
    public final void mo68265d() {
        if (!this.f70128h && this.f70125e == 1) {
            this.f70128h = true;
            C26588c cVar = this.f70126f;
            if (cVar != null) {
                cVar.mo68269a();
            }
        }
    }

    /* renamed from: a */
    public final void mo68262a(C26588c cVar) {
        C7573i.m23587b(cVar, "listener");
        this.f70126f = cVar;
    }

    /* renamed from: c */
    private final void m87351c(int i) {
        int i2 = this.f70125e;
        if (i2 != i) {
            this.f70125e = i;
            m87350a(i2, i);
        }
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.mo5545b((C1281m) this.f70127g);
    }

    /* renamed from: b */
    public final void mo68263b(int i) {
        if (i != 0) {
            this.f70128h = false;
            m87351c(i);
            return;
        }
        throw new IllegalArgumentException("STATE_INIT only can be set in the LoadMoreAdapterWrapper");
    }

    public final void onViewAttachedToWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        if (this.f70129i == vVar.itemView) {
            mo68265d();
        }
    }

    public LoadMoreAdapterWrapper(C1262a<C1293v> aVar) {
        C7573i.m23587b(aVar, "adapter");
        super(aVar);
        this.f70127g.mo68288a((C26600a) new C26600a(this) {

            /* renamed from: a */
            final /* synthetic */ LoadMoreAdapterWrapper f70130a;

            /* renamed from: a */
            public final void mo68266a() {
                this.f70130a.mo68265d();
            }

            {
                this.f70130a = r1;
            }
        });
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (this.f70129i == null) {
            this.f70129i = this.f70124c.mo68267a(recyclerView, this);
            this.f70124c.mo68268a(0);
            View view = this.f70129i;
            if (view == null) {
                C7573i.m23580a();
            }
            mo68261b(view);
        }
        recyclerView.mo5528a((C1281m) this.f70127g);
    }

    /* renamed from: a */
    private final void m87350a(int i, int i2) {
        RecyclerView recyclerView = this.f70111a;
        if (recyclerView != null) {
            recyclerView.post(new C26589d(this, i2));
        }
    }
}
