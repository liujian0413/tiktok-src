package com.p280ss.android.ugc.aweme.miniapp;

import android.support.p022v4.widget.NestedScrollView;
import android.support.p022v4.widget.NestedScrollView.C1017b;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.r */
public final class C33416r {

    /* renamed from: a */
    private C33418a f87268a;

    /* renamed from: b */
    private boolean f87269b = true;

    /* renamed from: c */
    private List<String> f87270c = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.miniapp.r$a */
    public interface C33418a {
        /* renamed from: a */
        void mo85661a(MicroAppInfo microAppInfo);
    }

    /* renamed from: a */
    private static int[] m108068a(GridLayoutManager gridLayoutManager) {
        return new int[]{gridLayoutManager.mo5445j(), gridLayoutManager.mo5447l()};
    }

    /* renamed from: a */
    private static int[] m108069a(LinearLayoutManager linearLayoutManager) {
        return new int[]{linearLayoutManager.mo5445j(), linearLayoutManager.mo5447l()};
    }

    /* renamed from: a */
    private void m108067a(View view) {
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            MicroAppInfo microAppInfo = (MicroAppInfo) view.getTag();
            int i = iArr[1];
            int height = view.getHeight() / 2;
            int b = C9738o.m28709b(view.getContext());
            if ((i >= 0 || Math.abs(i) <= height) && i + height <= b && this.f87268a != null) {
                if (microAppInfo != null && !this.f87270c.contains(microAppInfo.getAppId())) {
                    this.f87270c.add(microAppInfo.getAppId());
                    this.f87268a.mo85661a(microAppInfo);
                } else if (microAppInfo == null && !this.f87270c.contains("more_micro")) {
                    this.f87270c.add("more_micro");
                    this.f87268a.mo85661a(null);
                }
            }
        }
    }

    /* renamed from: a */
    private static int[] m108070a(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        int[] iArr = new int[staggeredGridLayoutManager.f5123a];
        int[] iArr2 = new int[staggeredGridLayoutManager.f5123a];
        staggeredGridLayoutManager.mo6009a(iArr);
        staggeredGridLayoutManager.mo6011c(iArr2);
        return m108071a(iArr, iArr2);
    }

    /* renamed from: a */
    public final void mo85659a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            try {
                int[] iArr = new int[2];
                C1273i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    iArr = m108069a((LinearLayoutManager) layoutManager);
                } else if (layoutManager instanceof GridLayoutManager) {
                    iArr = m108068a((GridLayoutManager) layoutManager);
                } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                    iArr = m108070a((StaggeredGridLayoutManager) layoutManager);
                }
                if (iArr != null) {
                    if (iArr.length >= 2) {
                        for (int i = iArr[0]; i <= iArr[1]; i++) {
                            m108067a(layoutManager.mo5432c(i));
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static int[] m108071a(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = i;
        for (int i4 = 1; i4 < iArr.length; i4++) {
            if (i3 > iArr[i4]) {
                i3 = iArr[i4];
            }
        }
        for (int i5 = 1; i5 < iArr2.length; i5++) {
            if (i2 < iArr2[i5]) {
                i2 = iArr2[i5];
            }
        }
        return new int[]{i3, i2};
    }

    /* renamed from: a */
    public final void mo85660a(final RecyclerView recyclerView, NestedScrollView nestedScrollView, C33418a aVar) {
        if (recyclerView != null) {
            this.f87268a = aVar;
            mo85659a(recyclerView);
            nestedScrollView.setOnScrollChangeListener(new C1017b() {
                /* renamed from: a */
                public final void mo3976a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                    C33416r.this.mo85659a(recyclerView);
                }
            });
        }
    }
}
