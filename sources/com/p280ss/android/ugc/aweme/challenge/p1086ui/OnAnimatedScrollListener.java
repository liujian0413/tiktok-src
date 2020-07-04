package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.adapter.C25650d;
import com.p280ss.android.ugc.aweme.setting.C37656k;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.OnAnimatedScrollListener */
public class OnAnimatedScrollListener extends C1281m {

    /* renamed from: a */
    private int f62620a;

    /* renamed from: b */
    private int f62621b;

    /* renamed from: c */
    private int[] f62622c = new int[2];

    /* renamed from: d */
    private int f62623d = ViewConfiguration.get(C6399b.m19921a()).getScaledTouchSlop();

    /* renamed from: e */
    private C23744a f62624e;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.OnAnimatedScrollListener$a */
    class C23744a {

        /* renamed from: a */
        public int f62625a = -1;

        /* renamed from: b */
        public int f62626b = -1;

        /* renamed from: c */
        public int f62627c = -1;

        C23744a() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo61763a(C1293v vVar) {
        if (vVar.mItemViewType == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m77860a(Context context) {
        if (this.f62621b == 0) {
            this.f62621b = C9738o.m28691a(context);
        }
    }

    /* renamed from: b */
    private void m77863b(Context context) {
        if (this.f62620a == 0) {
            this.f62620a = C9738o.m28709b(context);
        }
    }

    /* renamed from: a */
    public static void m77861a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1293v b = recyclerView.mo5539b(recyclerView.getChildAt(i));
                if (b instanceof C25650d) {
                    C25650d dVar = (C25650d) b;
                    if (dVar != null) {
                        dVar.bz_();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m77865b(RecyclerView recyclerView) {
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).f4747i == 1) {
                return true;
            }
            return false;
        } else if (!(layoutManager instanceof StaggeredGridLayoutManager) || ((StaggeredGridLayoutManager) layoutManager).f5127e != 1) {
            return false;
        } else {
            return true;
        }
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            mo61762a(recyclerView, false);
        }
    }

    /* renamed from: a */
    public final void mo61762a(RecyclerView recyclerView, boolean z) {
        if (m77865b(recyclerView)) {
            m77866c(recyclerView, z);
        } else {
            m77864b(recyclerView, z);
        }
    }

    /* renamed from: c */
    private void m77866c(RecyclerView recyclerView, boolean z) {
        int i;
        m77863b(recyclerView.getContext());
        recyclerView.getLocationOnScreen(this.f62622c);
        C1273i layoutManager = recyclerView.getLayoutManager();
        int childCount = recyclerView.getChildCount();
        int i2 = this.f62622c[1];
        int min = Math.min(this.f62620a, recyclerView.getHeight() + i2);
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            C1293v b = recyclerView.mo5539b(childAt);
            if (mo61763a(b)) {
                C25650d dVar = (C25650d) b;
                if (!dVar.bx_()) {
                    if (z) {
                        if (z) {
                            dVar.bB_();
                        }
                    }
                }
                int h = layoutManager.mo5789h(childAt);
                int j = layoutManager.mo5793j(childAt);
                int height = childAt.getHeight();
                if (h >= 0 || j <= min) {
                    if (h < 0) {
                        i = h + height;
                    } else {
                        int i4 = j + i2;
                        if (i4 > min) {
                            i = height - (i4 - min);
                        } else {
                            i = height;
                        }
                    }
                    if (i * 4 > height * 3) {
                        dVar.mo66493b(true);
                        dVar.by_();
                    } else {
                        dVar.mo66493b(false);
                        dVar.bz_();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m77864b(RecyclerView recyclerView, boolean z) {
        boolean z2;
        int i;
        m77860a(recyclerView.getContext());
        m77863b(recyclerView.getContext());
        recyclerView.getLocationOnScreen(this.f62622c);
        C1273i layoutManager = recyclerView.getLayoutManager();
        int childCount = recyclerView.getChildCount();
        int i2 = this.f62622c[0];
        int min = Math.min(this.f62621b, recyclerView.getWidth() + i2);
        int height = recyclerView.getHeight();
        if (this.f62622c[1] + (height >> 2) <= 0 || this.f62620a - this.f62622c[1] <= (height >> 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            C1293v b = recyclerView.mo5539b(childAt);
            if (mo61763a(b)) {
                C25650d dVar = (C25650d) b;
                if (!dVar.bx_()) {
                    if (z) {
                        if (z) {
                            dVar.bB_();
                        }
                    }
                }
                if (!z2) {
                    int g = layoutManager.mo5787g(childAt);
                    int i4 = layoutManager.mo5791i(childAt);
                    int width = childAt.getWidth();
                    if (g >= 0 || i4 <= min) {
                        if (g < 0) {
                            i = g + width;
                        } else {
                            int i5 = i4 + i2;
                            if (i5 > min) {
                                i = width - (i5 - min);
                            } else {
                                i = width;
                            }
                        }
                        if (i * 4 > width * 3) {
                            dVar.mo66493b(true);
                            dVar.by_();
                        }
                    }
                }
                dVar.mo66493b(false);
                dVar.bz_();
            }
        }
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (m77862a(recyclerView.getScrollState(), i, i2) && C37656k.m120485a(C6399b.m19921a())) {
            if (m77865b(recyclerView)) {
                i = i2;
            }
            if (Math.abs(i) <= this.f62623d) {
                mo61762a(recyclerView, false);
            }
        }
    }

    /* renamed from: a */
    private boolean m77862a(int i, int i2, int i3) {
        if (this.f62624e == null) {
            this.f62624e = new C23744a();
        }
        if (i != 0 || (this.f62624e.f62625a == i && this.f62624e.f62626b == i2 && this.f62624e.f62627c == i3)) {
            return false;
        }
        this.f62624e.f62625a = i;
        this.f62624e.f62626b = i2;
        this.f62624e.f62627c = i3;
        return true;
    }
}
