package com.p280ss.android.ugc.aweme.common.adapter;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1280l;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;

/* renamed from: com.ss.android.ugc.aweme.common.adapter.PullUpLoadMoreHelper */
public class PullUpLoadMoreHelper implements C1280l {

    /* renamed from: a */
    public boolean f67560a;

    /* renamed from: b */
    private RecyclerView f67561b;

    /* renamed from: c */
    private C6905a f67562c;

    /* renamed from: d */
    private boolean f67563d;

    /* renamed from: e */
    private int f67564e = ViewConfiguration.get(this.f67561b.getContext()).getScaledTouchSlop();

    /* renamed from: f */
    private float f67565f;

    /* renamed from: a */
    public final void mo5689a(boolean z) {
    }

    /* renamed from: b */
    public final void mo5691b(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public PullUpLoadMoreHelper(RecyclerView recyclerView, C6905a aVar) {
        this.f67561b = recyclerView;
        this.f67562c = aVar;
        this.f67561b.mo5527a((C1280l) this);
    }

    /* renamed from: a */
    public final boolean mo5690a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f67565f = motionEvent.getY();
            this.f67563d = true;
        }
        if (this.f67561b != null && this.f67560a && this.f67563d && !this.f67561b.canScrollVertically(1) && this.f67565f - motionEvent.getY() > ((float) this.f67564e)) {
            if (this.f67562c != null) {
                this.f67562c.bd_();
            }
            this.f67560a = false;
            this.f67563d = false;
        }
        return false;
    }
}
