package com.p280ss.android.ugc.aweme.base.widget;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1280l;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.base.widget.RecyclerTouchListener */
public final class RecyclerTouchListener implements C1280l {

    /* renamed from: a */
    private C23505a f62018a;

    /* renamed from: b */
    private GestureDetector f62019b;

    /* renamed from: com.ss.android.ugc.aweme.base.widget.RecyclerTouchListener$a */
    public interface C23505a {
    }

    /* renamed from: a */
    public final void mo5689a(boolean z) {
    }

    /* renamed from: b */
    public final void mo5691b(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    /* renamed from: a */
    public final boolean mo5690a(RecyclerView recyclerView, MotionEvent motionEvent) {
        View a = recyclerView.mo5519a(motionEvent.getX(), motionEvent.getY());
        if (!(a == null || this.f62018a == null || !this.f62019b.onTouchEvent(motionEvent))) {
            RecyclerView.m5892f(a);
        }
        return false;
    }
}
