package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.PointF;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;

/* renamed from: com.ss.android.ugc.aweme.views.WrapGridLayoutManager */
public class WrapGridLayoutManager extends GridLayoutManager implements C43371g {

    /* renamed from: L */
    C1262a f112321L;

    public WrapGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    /* renamed from: a */
    public final void mo5752a(C1262a aVar, C1262a aVar2) {
        super.mo5752a(aVar, aVar2);
        this.f112321L = aVar2;
    }

    /* renamed from: c */
    public final void mo5385c(C1284o oVar, C1290s sVar) {
        try {
            super.mo5385c(oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
        } catch (NullPointerException e) {
            if (this.f112321L != null) {
                C6921a.m21556a(this.f112321L.getClass().getName(), (Exception) e);
                WrapLinearLayoutManager.m137637a(this.f112321L);
            }
        }
    }

    /* renamed from: a */
    public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
        C433581 r2 = new LinearSmoothScroller(recyclerView.getContext()) {
            /* renamed from: b */
            public final int mo5472b(int i) {
                return super.mo5472b(i) * 3;
            }

            /* renamed from: c */
            public final PointF mo5861c(int i) {
                return WrapGridLayoutManager.this.mo5434d(i);
            }
        };
        r2.f4993g = i;
        mo5755a((C1287r) r2);
    }

    /* renamed from: b */
    public final int mo5381b(int i, C1284o oVar, C1290s sVar) {
        try {
            return super.mo5381b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        } catch (NullPointerException e) {
            if (this.f112321L != null) {
                C6921a.m21556a(this.f112321L.getClass().getName(), (Exception) e);
                WrapLinearLayoutManager.m137637a(this.f112321L);
            }
            return 0;
        }
    }

    public WrapGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, 1, false);
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
