package com.p280ss.android.ugc.aweme.utils;

import android.graphics.Rect;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.bytedance.common.utility.C9738o;

/* renamed from: com.ss.android.ugc.aweme.utils.dn */
public final class C43064dn {
    /* renamed from: b */
    public static void m136622b(RecyclerView recyclerView) {
        m136620a(recyclerView, 6);
    }

    /* renamed from: a */
    private static int m136617a(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: b */
    private static int m136621b(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 < i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static Rect m136618a(C1293v vVar) {
        if (vVar == null || vVar.itemView == null) {
            return null;
        }
        View view = vVar.itemView;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    /* renamed from: a */
    public static C0902i<Integer, Integer> m136619a(RecyclerView recyclerView) {
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            return new C0902i<>(Integer.valueOf(linearLayoutManager.mo5445j()), Integer.valueOf(linearLayoutManager.mo5447l()));
        } else if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            return new C0902i<>(Integer.valueOf(gridLayoutManager.mo5445j()), Integer.valueOf(gridLayoutManager.mo5447l()));
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.f5123a];
            staggeredGridLayoutManager.mo6011c(iArr);
            int a = m136617a(iArr);
            staggeredGridLayoutManager.mo6009a(iArr);
            return new C0902i<>(Integer.valueOf(m136621b(iArr)), Integer.valueOf(a));
        } else {
            throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager");
        }
    }

    /* renamed from: a */
    private static void m136620a(RecyclerView recyclerView, int i) {
        if (recyclerView != null) {
            recyclerView.setPadding(0, (int) C9738o.m28708b(recyclerView.getContext(), 6.0f), 0, 0);
            recyclerView.setClipToPadding(false);
        }
    }
}
