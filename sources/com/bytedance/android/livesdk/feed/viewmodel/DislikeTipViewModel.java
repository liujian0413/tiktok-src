package com.bytedance.android.livesdk.feed.viewmodel;

import android.content.Context;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.livesdk.feed.C6037j;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import com.bytedance.ies.p534b.C10296b;

public class DislikeTipViewModel extends RxViewModel {

    /* renamed from: a */
    private boolean f21079a;

    /* renamed from: b */
    private int f21080b;

    /* renamed from: c */
    private Context f21081c;

    /* renamed from: d */
    private boolean f21082d;

    /* renamed from: a */
    public final void mo20496a() {
        this.f21080b = -1;
    }

    /* renamed from: b */
    private void m23970b() {
        this.f21082d = C10296b.m30494a(this.f21081c, "ttlive_live_user").mo25024a("HAVE_SHOW_DISLIKE_GUIDE", false);
    }

    /* renamed from: a */
    public final void mo20497a(RecyclerView recyclerView) {
        if (this.f21079a && recyclerView != null && !this.f21082d && this.f21080b == -1) {
            C1273i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                this.f21080b = ((StaggeredGridLayoutManager) layoutManager).mo6011c((int[]) null)[0];
            } else if (layoutManager instanceof GridLayoutManager) {
                this.f21080b = ((GridLayoutManager) layoutManager).mo5447l();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo20498b(RecyclerView recyclerView) {
        int i;
        if (this.f21079a && recyclerView != null && !this.f21082d && this.f21080b != -1) {
            C1273i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                int[] c = ((StaggeredGridLayoutManager) layoutManager).mo6011c((int[]) null);
                if (c.length > 1) {
                    i = c[1];
                    if (i >= 0 && i - this.f21080b > 10) {
                        this.f21080b = -1;
                        C10296b.m30494a(this.f21081c, "ttlive_live_user").mo25021a("HAVE_SHOW_DISLIKE_GUIDE", (Object) Boolean.valueOf(true)).mo25023a();
                        this.f21082d = true;
                        return true;
                    }
                }
            } else if (layoutManager instanceof GridLayoutManager) {
                i = ((GridLayoutManager) layoutManager).mo5447l();
                this.f21080b = -1;
                C10296b.m30494a(this.f21081c, "ttlive_live_user").mo25021a("HAVE_SHOW_DISLIKE_GUIDE", (Object) Boolean.valueOf(true)).mo25023a();
                this.f21082d = true;
                return true;
            }
            i = -1;
            this.f21080b = -1;
            C10296b.m30494a(this.f21081c, "ttlive_live_user").mo25021a("HAVE_SHOW_DISLIKE_GUIDE", (Object) Boolean.valueOf(true)).mo25023a();
            this.f21082d = true;
            return true;
        }
        return false;
    }

    public DislikeTipViewModel(C6037j jVar, long j, Context context) {
        boolean z;
        C5989f a = jVar.mo14689a(j);
        if (a == null || a.f17760j <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f21079a = z;
        this.f21081c = context;
        m23970b();
    }
}
