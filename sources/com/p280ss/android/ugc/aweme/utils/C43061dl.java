package com.p280ss.android.ugc.aweme.utils;

import android.os.SystemClock;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import com.bytedance.apm.p253n.p469a.C9629c;
import com.p280ss.android.ugc.aweme.common.widget.BaseCustomViewPager;
import com.p280ss.android.ugc.aweme.feed.monitor.C28539a.C28540a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.dl */
final class C43061dl implements C42979bl {

    /* renamed from: c */
    public static final C43062a f111663c = new C43062a(null);

    /* renamed from: a */
    public final String f111664a;

    /* renamed from: b */
    public final boolean f111665b;

    /* renamed from: d */
    private final C9629c f111666d = new C9629c(this.f111664a);

    /* renamed from: e */
    private long f111667e;

    /* renamed from: f */
    private long f111668f;

    /* renamed from: com.ss.android.ugc.aweme.utils.dl$a */
    public static final class C43062a {
        private C43062a() {
        }

        public /* synthetic */ C43062a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo104725a() {
        this.f111667e = 0;
        this.f111668f = 0;
    }

    /* renamed from: c */
    public final void mo104727c() {
        if (this.f111668f <= 0) {
            this.f111668f = SystemClock.uptimeMillis();
            if (this.f111667e > 0) {
                this.f111666d.mo23983b();
            }
        }
    }

    /* renamed from: b */
    public final void mo104726b() {
        if (!C28540a.m93747b().f75182a && this.f111667e <= 0) {
            this.f111667e = SystemClock.uptimeMillis();
            if (this.f111667e <= 0 || this.f111668f <= 0 || this.f111668f > this.f111667e) {
                this.f111666d.mo23981a();
            }
        }
    }

    /* renamed from: a */
    public final void mo104686a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.mo5528a((C1281m) new RealFpsMonitor$startRecyclerView$1(this));
        }
    }

    /* renamed from: a */
    public final void mo104687a(BaseCustomViewPager baseCustomViewPager) {
        if (baseCustomViewPager != null) {
            baseCustomViewPager.mo66629a(new RealFpsMonitor$startVerticalViewPager$1(this));
        }
    }

    public C43061dl(String str, boolean z) {
        C7573i.m23587b(str, "type");
        this.f111664a = str;
        this.f111665b = z;
    }
}
