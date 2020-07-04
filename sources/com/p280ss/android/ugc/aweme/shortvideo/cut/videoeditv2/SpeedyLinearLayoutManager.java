package com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1290s;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.SpeedyLinearLayoutManager */
public final class SpeedyLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public static final C39266a f101898a = new C39266a(null);

    /* renamed from: b */
    private LinearSmoothScroller f101899b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.SpeedyLinearLayoutManager$a */
    public static final class C39266a {
        private C39266a() {
        }

        public /* synthetic */ C39266a(C7571f fVar) {
            this();
        }
    }

    public SpeedyLinearLayoutManager(Context context, int i, boolean z) {
        C7573i.m23587b(context, "context");
        super(context, 0, false);
    }

    /* renamed from: a */
    public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        if (this.f101899b == null) {
            this.f101899b = new SpeedyLinearLayoutManager$smoothScrollToPosition$1(recyclerView, recyclerView.getContext());
        }
        LinearSmoothScroller linearSmoothScroller = this.f101899b;
        if (linearSmoothScroller == null) {
            C7573i.m23580a();
        }
        linearSmoothScroller.f4993g = i;
        mo5755a((C1287r) this.f101899b);
    }
}
