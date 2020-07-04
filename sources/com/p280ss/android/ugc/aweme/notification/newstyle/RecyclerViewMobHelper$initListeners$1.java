package com.p280ss.android.ugc.aweme.notification.newstyle;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.RecyclerViewMobHelper$initListeners$1 */
public final class RecyclerViewMobHelper$initListeners$1 extends C1281m {

    /* renamed from: a */
    public boolean f89980a = true;

    /* renamed from: b */
    final /* synthetic */ C34540f f89981b;

    RecyclerViewMobHelper$initListeners$1(C34540f fVar) {
        this.f89981b = fVar;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        C7573i.m23587b(recyclerView, "recyclerView");
        if (i2 < 0) {
            z = true;
        } else {
            z = false;
        }
        this.f89980a = z;
        this.f89981b.mo87844a(this.f89980a);
    }
}
