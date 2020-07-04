package com.p280ss.android.ugc.aweme.discover.base;

import android.content.Context;
import android.content.res.Resources;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.base.e */
final class C26599e extends C1281m {

    /* renamed from: a */
    public boolean f70153a = true;

    /* renamed from: b */
    private int f70154b = 3;

    /* renamed from: c */
    private C26600a f70155c;

    /* renamed from: d */
    private int f70156d;

    /* renamed from: e */
    private int f70157e;

    /* renamed from: f */
    private int f70158f = -1;

    /* renamed from: com.ss.android.ugc.aweme.discover.base.e$a */
    public interface C26600a {
        /* renamed from: a */
        void mo68266a();
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
    }

    /* renamed from: a */
    public final void mo68288a(C26600a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f70155c = aVar;
    }

    /* renamed from: a */
    private static int m87375a(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: a */
    private final void m87376a(RecyclerView recyclerView) {
        int i;
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            C7573i.m23582a((Object) layoutManager, "recyclerView.layoutManager ?: return");
            int i2 = Integer.MAX_VALUE;
            int A = layoutManager.mo5744A() - 1;
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                int i3 = this.f70154b * gridLayoutManager.f4716b;
                int i4 = 0;
                int i5 = A - 1;
                while (true) {
                    if (i5 < 0) {
                        break;
                    }
                    i4 += gridLayoutManager.f4721g.mo5386a(i5);
                    if (i4 >= i3) {
                        i2 = i5;
                        break;
                    }
                    i5--;
                }
                i = gridLayoutManager.mo5447l();
            } else if (layoutManager instanceof LinearLayoutManager) {
                i2 = (A - 1) - (this.f70154b * 1);
                i = ((LinearLayoutManager) layoutManager).mo5447l();
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] iArr = new int[staggeredGridLayoutManager.f5123a];
                staggeredGridLayoutManager.mo6011c(iArr);
                i2 = A - (staggeredGridLayoutManager.f5123a * this.f70154b);
                i = m87375a(iArr);
            } else {
                return;
            }
            if (layoutManager.mo5800s() > 0 && i >= i2 && this.f70158f != i2) {
                this.f70158f = i2;
                C26600a aVar = this.f70155c;
                if (aVar != null) {
                    aVar.mo68266a();
                }
            }
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C7573i.m23587b(recyclerView, "recyclerView");
        if (this.f70153a && i2 >= 0 && i >= 0) {
            if (this.f70157e == 0) {
                Context context = recyclerView.getContext();
                C7573i.m23582a((Object) context, "recyclerView.context");
                Resources resources = context.getResources();
                C7573i.m23582a((Object) resources, "recyclerView.context.resources");
                this.f70157e = (int) (resources.getDisplayMetrics().density * 40.0f);
            }
            this.f70156d += i2;
            if (this.f70156d > this.f70157e) {
                m87376a(recyclerView);
                this.f70156d = 0;
            }
        }
    }
}
