package com.p280ss.android.ugc.aweme.notification.newstyle;

import android.graphics.Rect;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.View;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f */
public final class C34540f {

    /* renamed from: a */
    private RecyclerView f90112a;

    /* renamed from: b */
    private LinearLayoutManager f90113b;

    /* renamed from: c */
    private int f90114c;

    /* renamed from: d */
    private int f90115d = 6;

    /* renamed from: e */
    private final Rect f90116e = new Rect();

    /* renamed from: f */
    private final Rect f90117f = new Rect();

    /* renamed from: g */
    private C34541a f90118g;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.f$a */
    public interface C34541a {
        /* renamed from: a */
        void mo87795a(int i);
    }

    /* renamed from: a */
    private final void m111695a() {
        RecyclerView recyclerView = this.f90112a;
        if (recyclerView == null) {
            C7573i.m23583a("mRecyclerView");
        }
        recyclerView.mo5528a((C1281m) new RecyclerViewMobHelper$initListeners$1(this));
    }

    /* renamed from: a */
    public final void mo87844a(boolean z) {
        LinearLayoutManager linearLayoutManager = this.f90113b;
        if (linearLayoutManager == null) {
            C7573i.m23583a("mLinearLayoutManager");
        }
        int j = linearLayoutManager.mo5445j();
        LinearLayoutManager linearLayoutManager2 = this.f90113b;
        if (linearLayoutManager2 == null) {
            C7573i.m23583a("mLinearLayoutManager");
        }
        int l = linearLayoutManager2.mo5447l();
        if (j != -1 && l != -1) {
            LinearLayoutManager linearLayoutManager3 = this.f90113b;
            if (linearLayoutManager3 == null) {
                C7573i.m23583a("mLinearLayoutManager");
            }
            View c = linearLayoutManager3.mo5432c(j);
            LinearLayoutManager linearLayoutManager4 = this.f90113b;
            if (linearLayoutManager4 == null) {
                C7573i.m23583a("mLinearLayoutManager");
            }
            View c2 = linearLayoutManager4.mo5432c(l);
            if (c != null && c2 != null) {
                c.getLocalVisibleRect(this.f90116e);
                c2.getGlobalVisibleRect(this.f90117f);
                if (z) {
                    if (this.f90114c > j) {
                        int i = this.f90114c;
                        for (int i2 = j; i2 < i; i2++) {
                            C34541a aVar = this.f90118g;
                            if (aVar != null) {
                                aVar.mo87795a(i2);
                            }
                        }
                        this.f90114c = j;
                    }
                    if (this.f90115d != l) {
                        this.f90115d = l;
                        return;
                    }
                } else {
                    if (this.f90115d < l) {
                        int i3 = l + 1;
                        for (int i4 = this.f90115d + 1; i4 < i3; i4++) {
                            C34541a aVar2 = this.f90118g;
                            if (aVar2 != null) {
                                aVar2.mo87795a(i4);
                            }
                        }
                        this.f90115d = l;
                    }
                    if (this.f90114c == j) {
                        this.f90115d = l;
                        return;
                    }
                }
                this.f90114c = j;
            }
        }
    }

    /* renamed from: a */
    public final void mo87843a(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, C34541a aVar) {
        C7573i.m23587b(recyclerView, "recyclerView");
        C7573i.m23587b(linearLayoutManager, "layoutManager");
        C7573i.m23587b(aVar, "listener");
        this.f90112a = recyclerView;
        this.f90113b = linearLayoutManager;
        this.f90118g = aVar;
        m111695a();
    }
}
