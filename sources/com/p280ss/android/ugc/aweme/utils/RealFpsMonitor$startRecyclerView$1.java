package com.p280ss.android.ugc.aweme.utils;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.RealFpsMonitor$startRecyclerView$1 */
public final class RealFpsMonitor$startRecyclerView$1 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ C43061dl f111424a;

    RealFpsMonitor$startRecyclerView$1(C43061dl dlVar) {
        this.f111424a = dlVar;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        if (i != 0) {
            this.f111424a.mo104726b();
            return;
        }
        this.f111424a.mo104727c();
        this.f111424a.mo104725a();
    }
}
