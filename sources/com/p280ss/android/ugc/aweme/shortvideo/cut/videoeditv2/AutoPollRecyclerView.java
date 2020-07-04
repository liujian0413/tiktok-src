package com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.util.AttributeSet;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AutoPollRecyclerView */
public final class AutoPollRecyclerView extends RecyclerView {

    /* renamed from: N */
    public static final C39264a f101879N = new C39264a(null);

    /* renamed from: M */
    public boolean f101880M;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AutoPollRecyclerView$a */
    public static final class C39264a {
        private C39264a() {
        }

        public /* synthetic */ C39264a(C7571f fVar) {
            this();
        }
    }

    public AutoPollRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AutoPollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: n */
    public final void mo61102n() {
        if (this.f101880M) {
            this.f101880M = false;
            mo5576f();
        }
    }

    public final void setRunning(boolean z) {
        this.f101880M = z;
    }

    /* renamed from: j */
    public final void mo97738j(int i) {
        C1262a adapter = getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            this.f101880M = true;
            if (i == -1) {
                mo5561d(0);
            } else {
                mo5561d(itemCount - 1);
            }
        }
    }

    /* renamed from: i */
    public final void mo97737i(int i, int i2) {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            C1273i layoutManager = getLayoutManager();
            if (layoutManager != null) {
                ((LinearLayoutManager) layoutManager).mo5417a(i, i2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
        throw new IllegalArgumentException("layoutManager must be a subclass of LinearLayoutManager");
    }

    public AutoPollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ AutoPollRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
